package edu.escuelaing.arsw.projecDesign.repositories;

import edu.escuelaing.arsw.projecDesign.entities.CarritoDeCompra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarritoRepository extends MongoRepository<CarritoDeCompra,String> {
}
