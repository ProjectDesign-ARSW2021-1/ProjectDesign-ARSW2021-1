package edu.escuelaing.arsw.projecDesign.entities;

import java.util.ArrayList;

public class CarritoDeCompra {
    private String id;
    private String nombre;
    private String correo;
    private ArrayList<Producto>productos;
    private int cantidad;
    private Double subTotal;


    public CarritoDeCompra(){
        this.id=null;
        this.correo=null;
        this.nombre=null;
        this.cantidad=0;
        this.subTotal=0.0;
        this.productos=new ArrayList<Producto>();
    }
    public String getNombre(){
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
