package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import edu.escuelaing.arsw.projecDesign.service.CarritoService;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import edu.escuelaing.arsw.projecDesign.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;

import org.json.JSONObject;




@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarios;
    @Autowired
    private CarritoService carrito;

    @RequestMapping(method = RequestMethod.POST, path = { "usuario/" })
    public ResponseEntity<?> saveUsuario(@RequestBody Usuario usuario)
    {
        try
        {
            ArrayList<Producto> lista=new ArrayList<Producto>();
            usuarios.guardarUsuario(usuario);
            JSONObject myObjectJson = new JSONObject();
            myObjectJson.put("id",usuario.getId());
            myObjectJson.put("nombre",usuario.getNombre());
            myObjectJson.put("productos",lista);
            myObjectJson.put("cantidad",0);
            myObjectJson.put("subTotal",0);
            System.out.print(myObjectJson);

            Gson enviar=new Gson();
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
    @RequestMapping(method = RequestMethod.GET,path = "usuariobyid/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable String id){
        try{
            return new ResponseEntity<>(usuarios.buscarPorId(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontró un usuario con el id :"+id,HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/usuario/token/{token}")
    public ResponseEntity<?> obtenerUsuarioToken(@PathVariable("token") String token) {
        
        Usuario u=usuarios.getByIdToken(token);

        u.setContrasena(null);
        
        return new ResponseEntity<>(u,HttpStatus.ACCEPTED);
    }

}
