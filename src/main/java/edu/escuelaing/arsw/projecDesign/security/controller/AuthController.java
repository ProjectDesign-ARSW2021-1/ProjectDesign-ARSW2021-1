package edu.escuelaing.arsw.projecDesign.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import edu.escuelaing.arsw.projecDesign.entities.Role;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.security.dto.JwtDto;
import edu.escuelaing.arsw.projecDesign.security.dto.LoginUsuario;

import edu.escuelaing.arsw.projecDesign.security.jwt.JwtProvider;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;

import edu.escuelaing.arsw.projecDesign.service.imp.UsuarioImp;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin()
public class AuthController {



    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioImp usuarioService;

    @Autowired
    JwtProvider jwtProvider;
    


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
    	
 
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(loginUsuario.getCorreo(),loginUsuario.getContrasena());
            System.out.println(loginUsuario.getCorreo());
            System.out.println(loginUsuario.getContrasena());
            Authentication authentication =
                   authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtProvider.generateToken(authentication);
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
            return new ResponseEntity<>(jwtDto.getToken(),HttpStatus.CREATED);


    }

}
