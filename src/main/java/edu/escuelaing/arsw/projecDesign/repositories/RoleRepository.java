/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.projecDesign.repositories;


import edu.escuelaing.arsw.projecDesign.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author Andres Davila
 */
public interface RoleRepository extends MongoRepository<Role, String>{
    Role findByRole(String role);
    
    
}
