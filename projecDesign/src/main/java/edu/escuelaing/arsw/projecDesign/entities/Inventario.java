package edu.escuelaing.arsw.projecDesign.entities;

import java.util.Date;

public class Inventario {
    private String descripcion;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int cantidad;

    public Inventario(String descripcion,Date fechaEntrada,Date fechaSalida,int cantidad){
        this.descripcion=descripcion;
        this.fechaEntrada=fechaEntrada;
        this.fechaSalida=fechaSalida;
        this.cantidad=cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
