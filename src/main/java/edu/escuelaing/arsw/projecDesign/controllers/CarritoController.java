package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.service.CarritoService;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*")
public class CarritoController {
    @Autowired
    private CarritoService carrito;
    @RequestMapping(method = RequestMethod.POST, path = { "carritodecompras/" })
    public ResponseEntity<?> saveProduct(@RequestBody CarritoDeCompra carritoDeCompra)
    {
        try
        {
            carrito.guardarCarrito(carritoDeCompra);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex) {
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No se ha podido guardar el producto",
                    HttpStatus.NOT_FOUND);
        }
    }

}
