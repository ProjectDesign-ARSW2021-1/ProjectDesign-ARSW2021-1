package edu.escuelaing.arsw.projecDesign.entities;

import java.util.Date;

public class Inventario {
    private String id;
    private String nombreProducto;
    private Date fechaUltimaModi;
    private int cantidad;

    public Inventario(String nombreProducto,String id,Date fechaUltimaModi,int cantidad){
        this.id=id;
        this.nombreProducto=nombreProducto;
        this.fechaUltimaModi=fechaUltimaModi;
        this.cantidad=cantidad;
    }

    public String getnombreProducto() {
        return nombreProducto;
    }

    public void setnombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getFechaEntrada() {
        return fechaUltimaModi;
    }

    public void setFechaEntrada(Date fechaUltimaModi) {
        this.fechaUltimaModi = fechaUltimaModi;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setIdProducto(String idProducto) {
        this.id = idProducto;
    }
}
