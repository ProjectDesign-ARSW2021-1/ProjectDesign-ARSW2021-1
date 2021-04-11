package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.service.InventarioService;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*")
public class InventarioController {
    @Autowired
    private InventarioService inventarios;
    @RequestMapping(method = RequestMethod.POST, path = { "inventario/" })
    public ResponseEntity<?> saveInventario(@RequestBody Inventario inventario)
    {
        try
        {
            inventarios.guardarInventario(inventario);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el inventario",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = {"inventario/{id}"})
    public ResponseEntity<?> buscarPorId(@PathVariable("id") String id){
        try{
            return new ResponseEntity<>(inventarios.buscarPorId(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se puede encontrar el inventario",HttpStatus.NOT_FOUND);
        }
    }
}
