package com.gestionpeliculas.gestionpeliculas.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id_ciudad;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais paises;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public Ciudad() {
    }

    public Ciudad(Short id_ciudad, String name, Pais paises, LocalDateTime ultima_actualizacion) {
        this.id_ciudad = id_ciudad;
        this.name = name;
        this.paises = paises;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public Short getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Short id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pais getPaises() {
        return paises;
    }

    public void setPaises(Pais paises) {
        this.paises = paises;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    
    




}
