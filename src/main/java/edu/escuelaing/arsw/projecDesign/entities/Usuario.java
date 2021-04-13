package edu.escuelaing.arsw.projecDesign.entities;

import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "usuario")
public class Usuario {
    private String cargo;
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

   

    private String contrasena;
    private boolean enabled;
    @DBRef
    private Set<Role> roles;

    public Usuario(String cargo, String nombre, int telefono,String correo,String direccion,String id,String contrasena){
        this.cargo=cargo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.contrasena=contrasena;
        this.correo=correo;
        this.id=id;
        this.direccion=direccion;
    }
     public Usuario() {
        
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
