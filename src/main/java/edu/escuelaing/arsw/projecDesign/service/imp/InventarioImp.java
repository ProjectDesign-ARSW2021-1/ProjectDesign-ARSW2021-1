package edu.escuelaing.arsw.projecDesign.service.imp;

import com.google.gson.Gson;
import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.escuelaing.arsw.projecDesign.repositories.InventarioRepository;

import java.util.List;

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
        Gson enviar=new Gson();
        try{
            inventario=inventarioRepository.findById(id).orElseThrow(() -> new Exception("inventario no encontrado"));
            System.out.println(inventario.getCantidad());
        }catch (Exception e){
            System.out.println("Error al encontrar el inventario");
        }
        return inventario;
    }
    @Override
    public String getInventarios(){
        List<Inventario> inventarios= null;
        Gson enviar=new Gson();
        String jsonString = null;
        inventarios=inventarioRepository.findAll();
        jsonString=enviar.toJson(inventarios);
        return jsonString;
    }
    @Override
    public void actualizarCantidad(String id,int cantidad){
        Inventario actualizar=buscarPorId(id);
        actualizar.setCantidad(cantidad);
        guardarInventario(actualizar);
    }
}
