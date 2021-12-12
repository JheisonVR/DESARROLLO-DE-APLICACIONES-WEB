package co.edu.unab.api_rest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.api_rest.models.ClienteModel;
import co.edu.unab.api_rest.services.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel>obtenerListaProductos(){
        return clienteService.obtenerProductos();
    }   

    @PostMapping()
    public ClienteModel guardarProductoNuevo(@RequestBody ClienteModel producto){
        return clienteService.guardarProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProducto(@PathVariable("id") String id){
        if(clienteService.eliminarProducto(id)){
            return "Se elimino el producto con Id: "+id;
        }else{
            return "No existe producto con Id"+id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> obtenerProductoPorId(@PathVariable("id") String id){
        return clienteService.obtenerPorId(id);
    }
    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<ClienteModel> obtenerProductoPorNombre(@PathVariable("nombre") String nombre){
        return clienteService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/precio/{precio}")
    public ArrayList<ClienteModel> obtenerPorPrecio(@PathVariable("precio") Long precio){
        return clienteService.obtenerPorPrecio(precio);
    }
}
