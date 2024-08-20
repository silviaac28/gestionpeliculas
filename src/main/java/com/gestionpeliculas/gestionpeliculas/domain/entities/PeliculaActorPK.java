package com.gestionpeliculas.gestionpeliculas.domain.entities;


import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PeliculaActorPK implements Serializable {

    @Column(name = "id_actor")
    private Short id_actor;

    @Column(name = "id_pelicula")
    private Short id_pelicula;

    public PeliculaActorPK() {
    }

    public PeliculaActorPK(Short id_actor, Short id_pelicula) {
        this.id_actor = id_actor;
        this.id_pelicula = id_pelicula;
    }

    public Short getId_actor() {
        return id_actor;
    }

    public void setId_actor(Short id_actor) {
        this.id_actor = id_actor;
    }

    public Short getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(Short id_pelicula) {
        this.id_pelicula = id_pelicula;
    }



    
}
