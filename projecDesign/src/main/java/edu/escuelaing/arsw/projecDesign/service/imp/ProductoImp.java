package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.repositories.ProductoRepository;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductoImp implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    @Override
    public Boolean guardarProducto(Producto producto) {
        try{
            Long cantidad=productoRepository.count();
            System.out.println(cantidad);
            productoRepository.save(producto);
            
            return true;
        }catch (Exception e){
            System.out.println(e.getStackTrace()[0]);
        }
        return false;
    }

    @Override
    public Producto buscarPorId(String id) {
        Producto producto=null;
        try{
            producto=productoRepository.findById(id).orElseThrow(() -> new Exception("Producto no encontrado"));
        }catch (Exception e){
            System.out.println("No se encontro producto");
        }
        return producto;
    }
}
