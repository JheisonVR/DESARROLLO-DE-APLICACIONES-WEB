package co.edu.unab.api_rest.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.api_rest.models.ClienteModel;
import co.edu.unab.api_rest.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerProductos(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarProducto(ClienteModel producto){
        return clienteRepository.save(producto);
    }

    public boolean eliminarProducto(String id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<ClienteModel> obtenerPorId(String id){

        return clienteRepository.findById(id);
    }

    public ArrayList<ClienteModel> obtenerPorNombre(String nombre){
        return clienteRepository.findByNombre(nombre);
    }

    public ArrayList<ClienteModel>obtenerPorPrecio(Long precio){
        return clienteRepository.findByPrecioGreaterThanEqual(precio);
    }




}
