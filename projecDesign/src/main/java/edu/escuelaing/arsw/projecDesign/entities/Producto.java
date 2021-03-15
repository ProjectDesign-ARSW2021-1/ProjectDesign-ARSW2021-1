package edu.escuelaing.arsw.projecDesign.entities;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private String especifacion;
    private float precio;
    private String id;
    private String tipo;
    private ArrayList<String> imagenes;
    private String texto;

    public Producto(String nombre,String especifacion,float precio,String id,String tipo,ArrayList<String>imagenes,String texto){
        this.nombre=nombre;
        this.especifacion=especifacion;
        this.precio=precio;
        this.id=id;
        this.tipo=tipo;
        this.imagenes=imagenes;
        this.texto=texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
