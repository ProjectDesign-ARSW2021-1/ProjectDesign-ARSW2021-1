package edu.escuelaing.arsw.projecDesign.repositories;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventarioRespository extends MongoRepository<Inventario,String> {
    public Inventario buscarPorId(int id);
}
