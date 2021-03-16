package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController

public class UsuarioController {
    @Autowired
    private UsuarioService usuarios;

    @RequestMapping(method = RequestMethod.POST, path = { "usuario/" })
    public ResponseEntity<?> saveUsuario(@RequestBody Usuario usuario)
    {
        try
        {
            usuarios.guardarUsuario(usuario);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el usuario",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = {"usuario/{correo}"})
    public ResponseEntity<?> buscarPorCorreo(@PathVariable("correo") String correo){
        try{
            return new ResponseEntity<>(usuarios.buscarPorCorreo(correo),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se encontro ningun usuario",HttpStatus.NOT_FOUND);
        }
    }

}
