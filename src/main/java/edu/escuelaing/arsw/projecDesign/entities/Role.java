/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.projecDesign.entities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import edu.escuelaing.arsw.projecDesign.security.Enums.RoleName;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
/**
 *
 * @author Andres Davila
 */
@Document(collection = "role")
public class Role {
    @Id
    private String id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleName rolNombre;

    private String role;
    
    public Role()
    {
        
    }
    public Role(@NotNull RoleName rolNombre) {
        this.rolNombre = rolNombre;
    }

    public RoleName getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RoleName rolNombre) {
        this.rolNombre = rolNombre;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
