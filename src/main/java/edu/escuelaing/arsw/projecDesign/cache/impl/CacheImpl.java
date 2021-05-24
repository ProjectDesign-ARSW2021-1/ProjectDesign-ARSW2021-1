package edu.escuelaing.arsw.projecDesign.cache.impl;

import edu.escuelaing.arsw.projecDesign.cache.Cache;
import edu.escuelaing.arsw.projecDesign.entities.Producto;
import org.javatuples.Pair;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
@Service("cache")
public class CacheImpl implements Cache {

    private Map<String, Pair<String, Date>>cache;

    public CacheImpl(){ cache =new ConcurrentHashMap<String, Pair<String, Date>>(); }

    @Override
    public void guardarProductos(String tipo, String productos) {
        Pair<String,Date>tupla=new Pair<String, Date>(productos,new Date());
        cache.put(tipo,tupla);
    }

    @Override
    public void borrarTipo(String tipo) {
        cache.remove(tipo);

    }

    @Override
    public boolean tipoEnCache(String tipo) {
        boolean enCache;
        if(cache.get(tipo).equals(null)){
            enCache=false;
        }else{
            enCache=true;
        }
        return enCache;
    }

    @Override
    public String obtenerProductosPorTipo(String tipo) {
        return cache.get(tipo).getValue0();
    }

    @Override
    public boolean vencido(String tipo) {
        boolean expirado;
        if(cache.get(tipo)!=null){
            Date fecha=cache.get(tipo).getValue1();
            if(new Date().getTime()-fecha.getTime()>=300000){
                expirado=true;
                cache.remove(tipo);
            }else{
                expirado=false;
            }
        }else{
            expirado=true;
        }
        return expirado;
    }


}
