package co.edu.unab.api_rest.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unab.api_rest.models.ClienteModel;

public interface ClienteRepository extends MongoRepository<ClienteModel, String>{
    
    ArrayList<ClienteModel> findByNombre (String nombre);

    ArrayList<ClienteModel>findByPrecioGreaterThanEqual(Long precio);
}
