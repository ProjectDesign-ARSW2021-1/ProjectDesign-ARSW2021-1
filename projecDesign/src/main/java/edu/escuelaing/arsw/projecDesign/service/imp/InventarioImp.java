package edu.escuelaing.arsw.projecDesign.service.imp;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.escuelaing.arsw.projecDesign.repositories.InventarioRepository;

@Component
public class InventarioImp implements InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public Boolean guardarInventario(Inventario inventario) {
        try{
            Long cantidad=inventarioRepository.count();
            inventarioRepository.save(inventario);
            return true;
        }catch (Exception e){
            System.out.println(e.getStackTrace()[0]);
            return false;
        }
    }
    @Override
    public Inventario buscarPorId(String id){
        Inventario inventario=null;
        try{
            inventario=inventarioRepository.findById(id).orElseThrow(() -> new Exception("inventario no encontrado"));
        }catch (Exception e){
            System.out.println("Error al encontrar el inventario");
        }
        return inventario;
    }
}
