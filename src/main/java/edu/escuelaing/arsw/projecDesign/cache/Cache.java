package edu.escuelaing.arsw.projecDesign.cache;

import edu.escuelaing.arsw.projecDesign.entities.Producto;

import java.util.ArrayList;

public interface Cache {
    public void guardarProductos(String tipo, String productos);
    public void borrarTipo(String tipo);
    public boolean tipoEnCache(String tipo);
    public String obtenerProductosPorTipo(String tipo);
    public boolean vencido(String tipo);
}
