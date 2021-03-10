package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.repositories.ProductoRepository;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;

public class ProductoImp implements ProductoService {
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
    public Producto buscarPorId(int id) {
        Producto producto=null;
        try{
            producto=productoRepository.buscarPorId(id);
        }catch (Exception e){
            System.out.println("No se encontro producto");
        }
        return producto;
    }
}
