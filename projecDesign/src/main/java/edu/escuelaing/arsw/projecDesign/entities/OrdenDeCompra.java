package edu.escuelaing.arsw.projecDesign.entities;

import java.util.Date;

public class OrdenDeCompra {
    private Date fecha;
    private String descripcion;
    private Date fechaDeEntrega;
    private int id;
    private Double total;

    public OrdenDeCompra(Date fecha,String descripcion,Date fechaDeEntrega,int id,Double total){
        this.fecha=fecha;
        this.fechaDeEntrega=fechaDeEntrega;
        this.id=id;
        this.total=total;
        this.descripcion=descripcion;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
