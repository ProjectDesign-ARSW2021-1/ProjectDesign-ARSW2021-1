package edu.escuelaing.arsw.projecDesign.service.imp;
import com.google.gson.Gson;
import edu.escuelaing.arsw.projecDesign.cache.Cache;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import edu.escuelaing.arsw.projecDesign.repositories.ProductoRepository;
import edu.escuelaing.arsw.projecDesign.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductoImp<cantidadDeProductos> implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    @Qualifier("cache")
    Cache cache;
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
    @Override
    public String getProductosTipo(String tipo){
        String jsonString = null;
        if(cache.vencido(tipo)){
            System.out.println("Entre a guardar");
            List<Producto> productos= null;
            ArrayList<Producto> productosTipo=new ArrayList<Producto>();
            Gson enviar=new Gson();
            productos=productoRepository.findAll();
            for(int i=0;i<productos.size();i++){
                if(productos.get(i).getTipo().equals(tipo)){
                    productosTipo.add(productos.get(i));
                }
            }
            jsonString=enviar.toJson(productosTipo);
            cache.guardarProductos(tipo,jsonString);
        }else{
            System.out.println("Saco del cache");
            jsonString=cache.obtenerProductosPorTipo(tipo);


        }
        return jsonString;
    }
    @Override
    public String getProductos(){
        List<Producto> productos= null;
        Gson enviar=new Gson();
        String jsonString = null;
        productos=productoRepository.findAll();
        jsonString=enviar.toJson(productos);
        return jsonString;
    }
}