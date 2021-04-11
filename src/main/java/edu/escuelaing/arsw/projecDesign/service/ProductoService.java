package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.Producto;

public interface ProductoService {
    public Boolean guardarProducto(Producto producto);
    Producto buscarPorId(String id);
    public String getProductosTipo(String tipo);
    public String getProductos();
}
