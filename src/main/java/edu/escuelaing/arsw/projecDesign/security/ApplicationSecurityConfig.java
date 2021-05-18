package edu.escuelaing.arsw.projecDesign.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import edu.escuelaing.arsw.projecDesign.service.imp.CustomUserDetails;

import static edu.escuelaing.arsw.projecDesign.security.ApplicationUserRole.*;

import java.util.concurrent.TimeUnit;




@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;
 

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
 
        
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "index", "/css/*", "/js/*").permitAll()
                .antMatchers("/usuario/**").permitAll()
                .antMatchers("/productosbyid/**").permitAll()
                .antMatchers("/productos/**").permitAll()
                .antMatchers("/login/").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/miCuenta").permitAll()
                .defaultSuccessUrl("/carrito",true)
                .passwordParameter("password")
                .usernameParameter("email")
                .and()
                .rememberMe()
                        .tokenValiditySeconds((int)TimeUnit.DAYS.toSeconds(21))
                        .key("johannesgurrero")
                .and()
                .logout()
                        .logoutUrl("/logout")
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout","GET"))
                        .clearAuthentication(true)
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID","remember-me")
                        .logoutSuccessUrl("/miCuenta"); //default two weeks
    }


    @Bean
    public UserDetailsService mongoUserDetails() {
        return new CustomUserDetails();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserDetailsService userDetailsService = mongoUserDetails();
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);

    }
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
    }
    /*@Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails annaSmithUser = User.builder()
                .username("annasmith")
                .password(passwordEncoder.encode("password"))
//                .roles(STUDENT.name()) // ROLE_STUDENT
                .authorities(CLIENT.getGrantedAuthorities())
                .build();

        UserDetails lindaUser = User.builder()
                .username("linda")
                .password(passwordEncoder.encode("password123"))
//                .roles(ADMIN.name()) // ROLE_ADMIN
                .authorities(ADMIN.getGrantedAuthorities())
                .build();

        UserDetails tomUser = User.builder()
                .username("tom")
                .password(passwordEncoder.encode("password123"))
//                .roles(ADMINTRAINEE.name()) // ROLE_ADMINTRAINEE
                .authorities(ADMINTRAINEE.getGrantedAuthorities())
                .build();

        return new InMemoryUserDetailsManager(
                annaSmithUser,
                lindaUser,
                tomUser
        );

    }*/
}
    /*.antMatchers("/usuario/").permitAll()
        .antMatchers("/productos/").permitAll()
        .antMatchers("productos/{tipo}").permitAll()
        .antMatchers("productosbyid/{id}").permitAll()
        .antMatchers("usuario/").permitAll()
        .antMatchers("usuario/{correo}").permitAll()
        .antMatchers("carritodecompras/").permitAll()
        .antMatchers("ordenDeCompra/").permitAll()
        .antMatchers("ordenDeCompra/{id}").permitAll()
                .antMatchers("/","index","/css/*","/js/*")
        .permitAll()*/ 

