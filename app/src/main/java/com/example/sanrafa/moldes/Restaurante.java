package com.example.sanrafa.moldes;

import java.io.Serializable;

public class Restaurante implements Serializable {

    private String nombre;
    private String ubicacion;
    private String precio;

    private String descripcion;
    private Integer fotografia;

    public Restaurante() {
    }

    public Restaurante(String nombre, String ubicacion, String precio, String descripcion,Integer fotografia) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {this.fotografia = fotografia;
    }
}
