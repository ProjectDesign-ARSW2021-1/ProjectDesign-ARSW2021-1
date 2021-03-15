package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.Producto;

public interface ProductoService {
    public Boolean guardarProducto(Producto producto);
    public Producto buscarPorId(String id);
}
