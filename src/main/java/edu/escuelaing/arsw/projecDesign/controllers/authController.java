package edu.escuelaing.arsw.projecDesign.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.service.imp.CustomUserDetails;

/**
 *
 * @author Andres Davila
 */
@RestController
public class authController {

    @Autowired
    private CustomUserDetails userService;
    



    @RequestMapping(method = RequestMethod.GET,path = {"login/{email}"})
    public ResponseEntity<?> inicioSesion(@PathVariable("email") String email){
        try{
            return new ResponseEntity<>(userService.loadUserByUsername(email),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se puede encontrar el usuario",HttpStatus.NOT_FOUND);
        }
    }

 
}
/*public ModelAndView login() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("login");
    return modelAndView;
}

@RequestMapping(value = "/signup", method = RequestMethod.GET)
public ModelAndView signup() {
    ModelAndView modelAndView = new ModelAndView();
    Usuario user = new Usuario();
    modelAndView.addObject("user", user);
    modelAndView.setViewName("signup");
    return modelAndView;
}

@RequestMapping(value = "/signup", method = RequestMethod.POST)
public ModelAndView createNewUser(@RequestBody Usuario user, BindingResult bindingResult) {
    ModelAndView modelAndView = new ModelAndView();
    Usuario userExists = userService.findUserByEmail(user.getCorreo());
    if (userExists != null) {
        bindingResult
                .rejectValue("email", "error.user",
                        "There is already a user registered with the username provided");
    }
    if (bindingResult.hasErrors()) {
        modelAndView.setViewName("signup");
    } else {
        userService.saveUser(user);
        modelAndView.addObject("successMessage", "User has been registered successfully");
        modelAndView.addObject("user", new Usuario());
        modelAndView.setViewName("login");

    }
    return modelAndView;
}

@RequestMapping(value = "/miCuenta", method = RequestMethod.GET)
public ModelAndView dashboard() {
    ModelAndView modelAndView = new ModelAndView();
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    Usuario user = userService.findUserByEmail(auth.getName());
    modelAndView.addObject("currentUser", user);
    modelAndView.addObject("fullName", "Welcome " + user.getNombre());
    modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
    modelAndView.setViewName("dashboard");
    return modelAndView;
}

@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("index");
    return modelAndView;
}
}*/
    

    

