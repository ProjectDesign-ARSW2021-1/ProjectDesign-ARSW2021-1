package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.service.CarritoService;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*")
public class CarritoController {
    @Autowired
    private CarritoService carritos;
    @Autowired
    private ProductoService productos;
    @RequestMapping(method = RequestMethod.POST, path = { "carritodecompras/" })
    public ResponseEntity<?> saveProduct(@RequestBody CarritoDeCompra carritoDeCompra) {
        try
        {
            carritos.guardarCarrito(carritoDeCompra);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el producto",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.PUT, value="/actualizarcarrito/{correo}")
    public ResponseEntity<?> actualizarCantidadCarrito(@PathVariable("correo") String correo,@RequestBody ArrayList<Producto> listaProductos)
    {
        System.out.println(correo);
        try{
            Producto producto=productos.buscarPorId(correo);
            carritos.actualizarCarrito(correo,listaProductos);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el inventario",
                    HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(method = RequestMethod.GET,path = {"carrito/{id}"})
    public ResponseEntity<?> buscarPorId(@PathVariable("id") String id){
        try{
            return new ResponseEntity<>(carritos.buscarPorId(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se puede encontrar el inventario",HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = {"carritobyCorreo/{correo}"})
    public ResponseEntity<?> buscarPorCorreo(@PathVariable("correo") String correo){
        try{
            return new ResponseEntity<>(carritos.buscarPorCorreo(correo),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(InventarioController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se puede encontrar el inventario",HttpStatus.NOT_FOUND);
        }
    }

}
