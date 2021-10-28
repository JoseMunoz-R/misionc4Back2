package com.misionc4.back2Demo.models;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private Integer puntaje;
    
    
    
    public Usuario() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Integer getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    
}
