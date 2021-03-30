package edu.escuelaing.arsw.projecDesign.repositories;

import edu.escuelaing.arsw.projecDesign.entities.OrdenDeCompra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdenDeCompraRepository extends MongoRepository<OrdenDeCompra,String> {
    
}
