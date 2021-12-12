package co.edu.unab.api_rest.models;

import org.springframework.data.annotation.Id;

public class ClienteModel {
    @Id
    private String id;
    private String categoria; //categoria
    private String nombre;
    private String descripcion; //descripcion
    private String disponibilidad; //disponibilidad
    private Long precio; // precio

    public ClienteModel() {
    }

    public ClienteModel(String id, String categoria, String nombre, String descripcion, String disponibilidad, Long precio) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    

    
    
}
