package edu.escuelaing.arsw.projecDesign;

import edu.escuelaing.arsw.projecDesign.entities.Role;
import edu.escuelaing.arsw.projecDesign.repositories.RoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectDesign
{
    public static void main( String[] args ) {
        //SpringApplication.run(RouletteApplication.class, args);
        //mongodb+srv://andresDavila:1234@projectdesign.b0o7s.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
        SpringApplication app = new SpringApplication(ProjectDesign.class);
        app.setDefaultProperties(Collections.singletonMap("spring.data.mongodb.uri", "mongodb+srv://andresda1302:churrias123@cluster0.wloae.mongodb.net/ProjectDesign?retryWrites=true&w=majority"));
        app.run(args);
        
        
    }
    @Bean
    CommandLineRunner init(RoleRepository roleRepository) {

    return args -> {

        Role adminRole = roleRepository.findByRole("ROLE_ADMIN");
        if (adminRole == null) {
            Role newAdminRole = new Role();
            newAdminRole.setRole("ROLE_ADMIN");
            roleRepository.save(newAdminRole);
        }

        Role userRole = roleRepository.findByRole("ROLE_USER");
        if (userRole == null) {
            Role newUserRole = new Role();
            newUserRole.setRole("ROLE_USER");
            roleRepository.save(newUserRole);
        }
    };
}
}
