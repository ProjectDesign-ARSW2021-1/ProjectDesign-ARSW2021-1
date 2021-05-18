package edu.escuelaing.arsw.projecDesign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.escuelaing.arsw.projecDesign.entities.Role;
import edu.escuelaing.arsw.projecDesign.repositories.RoleRepository;

import java.util.Collections;

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

            Role adminRole = roleRepository.findByRole("ADMIN");
            if (adminRole == null) {
                Role newAdminRole = new Role();
                newAdminRole.setRole("ADMIN");
                roleRepository.save(newAdminRole);
            }

            Role admintraineeRole = roleRepository.findByRole("ADMINTRAINEE");
            if (admintraineeRole == null) {
                Role newUserRole = new Role();
                newUserRole.setRole("ADMINTRAINEE");
                roleRepository.save(newUserRole);
            }

            Role clientRole = roleRepository.findByRole("CLIENT");
            if (clientRole == null) {
                Role newUserRole = new Role();
                newUserRole.setRole("CLIENT");
                roleRepository.save(newUserRole);
            }
        };

    }
}
