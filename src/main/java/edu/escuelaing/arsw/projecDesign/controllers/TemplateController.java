package edu.escuelaing.arsw.projecDesign.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TemplateController {

    @GetMapping("miCuenta")
    public String getLogin() {
        return "miCuenta";
    }

    @GetMapping("carrito")
    public String getCourses() {
        return "carrito";
    }
}
