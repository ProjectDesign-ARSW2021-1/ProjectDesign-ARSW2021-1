package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import edu.escuelaing.arsw.projecDesign.repositories.CarritoRepository;
import edu.escuelaing.arsw.projecDesign.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
