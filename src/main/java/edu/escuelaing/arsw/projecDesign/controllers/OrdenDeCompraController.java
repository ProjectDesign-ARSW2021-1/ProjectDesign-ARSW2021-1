package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.OrdenDeCompra;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.service.OrdenDeCompraService;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class OrdenDeCompraController {
    @Autowired
    private OrdenDeCompraService ordenesDeCompras;
    @RequestMapping(method = RequestMethod.POST, path = { "ordenDeCompra/" })
    public ResponseEntity<?> saveProduct(@RequestBody OrdenDeCompra ordenDeCompra)
    {
        try
        {
            ordenesDeCompras.guardarOrdenDeCompra(ordenDeCompra);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(OrdenDeCompraController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar la orden de compra",
                    HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.GET,path = {"ordenDeCompra/{id}"})
    public ResponseEntity<?> buscarOrdenDeCompraPorId(@PathVariable("id") String id){
        try{
            return new ResponseEntity<>(ordenesDeCompras.buscarOrdenDeCompraPorId(id),HttpStatus.ACCEPTED);
        }catch (Exception ex){
            Logger.getLogger(OrdenDeCompraController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("No se encontro orden de compra con el numero"+id,HttpStatus.NOT_FOUND);
        }
    }


}
