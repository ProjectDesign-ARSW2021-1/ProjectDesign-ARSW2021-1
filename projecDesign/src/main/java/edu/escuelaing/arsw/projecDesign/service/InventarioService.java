package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;

public interface InventarioService {
    public Inventario buscarPorId(int id);
    public Boolean guardarInventario(Inventario inventario);
}
