package com.example.table.products;

public class Producto {
    private String nombre;
    private String descripcion;
    private Integer foto;

    public Producto(String nombre, String descripcion, Integer foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
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

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
