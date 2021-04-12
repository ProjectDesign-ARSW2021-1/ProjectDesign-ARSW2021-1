package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;

public interface InventarioService {
    public Inventario buscarPorId(String id);
    public Boolean guardarInventario(Inventario inventario);
    public String getInventarios();
    public void actualizarCantidad(String id,int cantidad);
}
