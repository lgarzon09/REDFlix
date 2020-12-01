package com.prob.probart.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @Column(name = "pel_titulo")
    String pelTitulo;
    
    @Column(name = "pel_resumen")
    String pelResumen;
    
    @Column(name = "pel_anio")
    Long pelAnio;
    
    @Column(name = "pel_director")
    String pelDirector;

    public String getPelTitulo() {
        return pelTitulo;
    }

    public void setPelTitulo(String pelTitulo) {
        this.pelTitulo = pelTitulo;
    }

    public String getPelResumen() {
        return pelResumen;
    }

    public void setPelResumen(String pelResumen) {
        this.pelResumen = pelResumen;
    }

    public Long getPelAnio() {
        return pelAnio;
    }

    public void setPelAnio(Long pelAnio) {
        this.pelAnio = pelAnio;
    }

    public String getPelDirector() {
        return pelDirector;
    }

    public void setPelDirector(String pelDirector) {
        this.pelDirector = pelDirector;
    }
    
    

    
}
