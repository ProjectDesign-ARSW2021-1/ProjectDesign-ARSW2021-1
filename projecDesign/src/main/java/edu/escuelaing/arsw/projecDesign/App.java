package edu.escuelaing.arsw.projecDesign;

import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class App
{
    public static void main( String[] args ) {
        //SpringApplication.run(RouletteApplication.class, args);
        //mongodb+srv://ieti:<ieti123>@cluster0.j78lp.mongodb.net/cadanwheels?retryWrites=true&w=majority
        SpringApplication app = new SpringApplication(CadanWheelsApplication.class);
        app.setDefaultProperties(Collections.singletonMap("spring.data.mongodb.uri", "mongodb+srv://ieti:ieti123@cluster0.j78lp.mongodb.net/cadanwheels?retryWrites=true&w=majority"));
        app.run(args);
    }
}
