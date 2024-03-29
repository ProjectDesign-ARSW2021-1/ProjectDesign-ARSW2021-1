package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.service.CarritoService;
import edu.escuelaing.arsw.projecDesign.service.InventarioService;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
    //@PreAuthorize("hasAuthority('inventory:write')")
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
    @RequestMapping(method = RequestMethod.PUT, value="/actualizarcantidad/{id}")
    //@PreAuthorize("hasAuthority('inventory:write')")
    public ResponseEntity<?> actualizarCantidad(@PathVariable("id") String id,@RequestBody int cantidad)
    {
        try
        {
            inventarios.actualizarCantidad(id,cantidad);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el inventario",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = {"inventario/{id}"})
    //@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public ResponseEntity<?> buscarPorId(@PathVariable("id") String id){
        try{
            return new ResponseEntity<>(inventarios.buscarPorId(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se puede encontrar el inventario",HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = "todoslosinventarios/")
    //@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public ResponseEntity<?> getProductos(){
        try{
            return new ResponseEntity<>(inventarios.getInventarios(),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontraron productos",HttpStatus.NOT_FOUND);
        }
    }
}
