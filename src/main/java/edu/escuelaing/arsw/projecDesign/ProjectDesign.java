package edu.escuelaing.arsw.projecDesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
