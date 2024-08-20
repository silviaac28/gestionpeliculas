package com.gestionpeliculas.gestionpeliculas.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PeliculaActor {

    @EmbeddedId
    private PeliculaActorPK id;

    @ManyToOne 
    @JoinColumn(name = "id_actor", insertable = false, updatable = false)
    private Actor actores;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", insertable = false, updatable = false)
    private Pelicula peliculas;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    public PeliculaActor() {
    }

    public PeliculaActor(PeliculaActorPK id, Actor actores, Pelicula peliculas, LocalDateTime ultima_actualizacion) {
        this.id = id;
        this.actores = actores;
        this.peliculas = peliculas;
        this.ultima_actualizacion = ultima_actualizacion;
    }

    public PeliculaActorPK getId() {
        return id;
    }

    public void setId(PeliculaActorPK id) {
        this.id = id;
    }

    public Actor getActores() {
        return actores;
    }

    public void setActores(Actor actores) {
        this.actores = actores;
    }

    public Pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }

    


}
