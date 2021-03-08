package edu.escuelaing.arsw.projecDesign.repositories;


import edu.escuelaing.arsw.projecDesign.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    public Usuario buscarPorCorreo(String correo);
}
