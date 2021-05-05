package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import edu.escuelaing.arsw.projecDesign.entities.Producto;

import java.util.ArrayList;

public interface CarritoService {
    public Boolean guardarCarrito(CarritoDeCompra carritoDeCompra);
    public void agregarProducto(Producto producto);
    public CarritoDeCompra buscarPorId(String id);
    public void actualizarCarrito(String id, ArrayList<Producto> listaCarrito);
}
