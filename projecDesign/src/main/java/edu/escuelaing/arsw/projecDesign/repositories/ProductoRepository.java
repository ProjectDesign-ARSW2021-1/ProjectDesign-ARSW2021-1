package edu.escuelaing.arsw.projecDesign.repositories;

import edu.escuelaing.arsw.projecDesign.entities.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {
    
}
