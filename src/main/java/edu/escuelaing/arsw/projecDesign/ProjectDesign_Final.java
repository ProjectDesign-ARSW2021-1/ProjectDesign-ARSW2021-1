package edu.escuelaing.arsw.projecDesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ProjectDesign_Final
{
    public static void main( String[] args ) {
        //SpringApplication.run(RouletteApplication.class, args);
        //mongodb+srv://andresDavila:1234@projectdesign.b0o7s.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
        SpringApplication app = new SpringApplication(ProjectDesign_Final.class);
        app.setDefaultProperties(Collections.singletonMap("spring.data.mongodb.uri", "mongodb+srv://SantiagoLaiton:SA0227Lc@projectdesign.tmgx3.mongodb.net/ProjectDesing_Final?retryWrites=true&w=majority"));
        app.run(args);
    }
}
