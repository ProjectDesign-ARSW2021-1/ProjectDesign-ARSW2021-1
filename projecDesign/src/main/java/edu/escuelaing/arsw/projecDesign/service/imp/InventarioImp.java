package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.repositories.InventarioRespository;
import edu.escuelaing.arsw.projecDesign.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InventarioImp implements InventarioService {
    @Autowired
    private InventarioRespository inventarioRespository;

    @Override
    public Boolean guardarInventario(Inventario inventario) {
        try{
            Long cantidad=inventarioRespository.count();
            inventarioRespository.save(inventario);
            return true;
        }catch (Exception e){
            System.out.println(e.getStackTrace()[0]);
            return false;
        }
    }
    @Override
    public Inventario buscarPorId(int id){
        Inventario inventario=null;
        try{
            inventario=inventarioRespository.buscarPorId(id);
        }catch (Exception e){
            System.out.println("Error al encontrar el inventario");
        }
        return inventario;
    }
}
