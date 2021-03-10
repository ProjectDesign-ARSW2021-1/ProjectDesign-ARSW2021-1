package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.OrdenDeCompra;
import edu.escuelaing.arsw.projecDesign.repositories.OrdenDeCompraRepository;
import edu.escuelaing.arsw.projecDesign.service.OrdenDeCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrdenDeCompraImp implements OrdenDeCompraService {
    @Autowired
    OrdenDeCompraRepository ordenDeCompraRepository;
    @Override
    public OrdenDeCompra buscarOrdenDeCompraPorId(int id) {
        OrdenDeCompra ordenDeCompra=null;
        try{
            ordenDeCompra=ordenDeCompraRepository.buscarOrdenDeCompraPorId(id);
        }catch (Exception e){
            System.out.println("No se puede encontrar orden de compra con este numero"+ id);
        }
        return ordenDeCompra;
    }

    @Override
    public Boolean guardarOrdenDeCompra(OrdenDeCompra ordenDeCompra) {
        try {
            Long cantidad=ordenDeCompraRepository.count();
            System.out.println(cantidad);
            ordenDeCompraRepository.save(ordenDeCompra);
            return true;
        }catch (Exception e){
            System.out.println(e.getStackTrace()[0]);
            return false;
        }
    }
}
