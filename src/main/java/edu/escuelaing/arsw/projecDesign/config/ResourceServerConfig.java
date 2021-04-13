/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.projecDesign.config;

import edu.escuelaing.arsw.projecDesign.service.imp.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
/**
 *
 * @author Andres Davila
 */
@Configuration
@EnableWebSecurity
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;
@Autowired
AuthorizationServerConfig customizeAuthenticationSuccessHandler;


@Override
public void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers("/login").permitAll()
            .antMatchers("/signup").permitAll()
            .antMatchers("/usuario/").permitAll()
            .antMatchers("/productos/").permitAll()
            .antMatchers("productos/{tipo}").permitAll()
            .antMatchers("productosbyid/{id}").permitAll()
            .antMatchers("usuario/").permitAll()
            .antMatchers("usuario/{correo}").permitAll()
            .antMatchers("inventario/").permitAll()
            .antMatchers("inventario/{id}").permitAll()
            .antMatchers("carritodecompras/").permitAll()
            .antMatchers("ordenDeCompra/").permitAll()
            .antMatchers("ordenDeCompra/{id}").permitAll()
            .anyRequest().authenticated();
    }
}