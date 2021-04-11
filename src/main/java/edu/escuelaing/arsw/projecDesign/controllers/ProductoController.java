/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 *
 * @author Andres Davila
 */
@RestController
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    private ProductoService productos;
    
    @RequestMapping(method = RequestMethod.POST, path = { "productos/" })
    public ResponseEntity<?> saveProduct(@RequestBody Producto producto)
    {
        try
        {
            productos.guardarProducto(producto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el producto",
                    HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(method = RequestMethod.GET,path = "productosbyid/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable String id){
        try{
            return new ResponseEntity<>(productos.buscarPorId(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontró un producto con el id :"+id,HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = "todoslosproductos/")
    public ResponseEntity<?> getProductos(){
        try{
            return new ResponseEntity<>(productos.getProductos(),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontraron productos",HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = "productos/{tipo}")
    public ResponseEntity<?> productos(@PathVariable String tipo){
        try{
            return new ResponseEntity<>(productos.getProductosTipo(tipo),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontró un producto con el id :",HttpStatus.NOT_FOUND);
        }
    }
}
