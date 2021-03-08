package edu.escuelaing.arsw.projecDesign.entities;

public class Usuario {
    private String cargo;
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;
    private int id;
    private String contrasena;

    public Usuario(String cargo, String nombre, int telefono,String correo,String direccion,int id,String contrasena){
        this.cargo=cargo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.contrasena=contrasena;
        this.correo=correo;
        this.id=id;
        this.direccion=direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
