package edu.escuelaing.arsw.projecDesign.entities;

import scala.Product;

import java.util.ArrayList;
import java.util.Date;

public class OrdenDeCompra {

    private String descripcion;
    private int id;
    private Double total;
    private String direccion;
    private String ciudad;
    private ArrayList<Producto> productos;
    private String nombreUsuario;
    private int telefonoUsuario;

    public OrdenDeCompra(int telefonoUsuario,String nombreUsuario,String direccion,String ciudad,String descripcion,int id,Double total,ArrayList<Producto> productos){

        this.id=id;
        this.total=total;
        this.descripcion=descripcion;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.productos=productos;
        this.nombreUsuario=nombreUsuario;
        this.telefonoUsuario=telefonoUsuario;

    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }
}
