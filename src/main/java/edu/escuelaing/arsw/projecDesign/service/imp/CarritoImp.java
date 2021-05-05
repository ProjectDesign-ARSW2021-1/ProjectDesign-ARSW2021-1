package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.repositories.CarritoRepository;
import edu.escuelaing.arsw.projecDesign.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CarritoImp implements CarritoService {
    @Autowired
    CarritoRepository carritoRepository;
    @Override
    public Boolean guardarCarrito(CarritoDeCompra carritoDeCompra) {
        try{
            Long cantidad=carritoRepository.count();
            System.out.println(cantidad);
            carritoRepository.save(carritoDeCompra);
            return true;
        }catch (Exception e){
            System.out.println(e.getStackTrace()[0]);
        }
        return false;
    }

    @Override
    public void agregarProducto(Producto producto) {

    }

    @Override
    public CarritoDeCompra buscarPorId(String id) {
        CarritoDeCompra producto=null;
        try{
            producto=carritoRepository.findById(id).orElseThrow(() -> new Exception("Producto no encontrado"));
        }catch (Exception e){
            System.out.println("No se encontro producto");
        }
        return producto;
    }
    @Override
    public void actualizarCarrito(String id, ArrayList<Producto> carrito){
        CarritoDeCompra actualizar=buscarPorId(id);
        actualizar.setProductos(carrito);
        guardarCarrito(actualizar);
    }


}

