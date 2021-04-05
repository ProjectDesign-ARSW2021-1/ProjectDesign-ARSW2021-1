package edu.escuelaing.arsw.projecDesign.entities;

import java.util.ArrayList;

public class CarritoDeCompra {
    private String nombre;
    private ArrayList<Producto>productos;
    private int cantidad;
    private Double subTotal;

    public CarritoDeCompra(){
        this.nombre=null;
        this.cantidad=0;
        this.subTotal=0.0;
        this.productos=new ArrayList<Producto>();
    }
    public String getNombre(){
        return nombre;
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
}
