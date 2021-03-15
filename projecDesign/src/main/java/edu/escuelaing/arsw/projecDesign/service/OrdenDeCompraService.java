package edu.escuelaing.arsw.projecDesign.service;

import edu.escuelaing.arsw.projecDesign.entities.OrdenDeCompra;

public interface OrdenDeCompraService {
    public OrdenDeCompra buscarOrdenDeCompraPorId(String id);
    public Boolean guardarOrdenDeCompra(OrdenDeCompra ordenDeCompra);
}
