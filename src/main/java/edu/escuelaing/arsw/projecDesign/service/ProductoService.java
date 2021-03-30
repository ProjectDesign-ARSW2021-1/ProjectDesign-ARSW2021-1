package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.Producto;

import java.util.List;

public interface ProductoService {
    public Boolean guardarProducto(Producto producto);
    //public Producto buscarPorId(String id);
    public List<Producto> getProductos(String tipo);
}
