package com.gestionpeliculas.gestionpeliculas.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_actor;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String nombres;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false)
    private String apellidos;


    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;


    public Actor() {
    }


    public Actor(Short id_actor, String nombres, String apellidos, LocalDateTime ultima_actualizacion) {
        this.id_actor = id_actor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ultima_actualizacion = ultima_actualizacion;
    }


    public Short getId_actor() {
        return id_actor;
    }


    public void setId_actor(Short id_actor) {
        this.id_actor = id_actor;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }


    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    



}
