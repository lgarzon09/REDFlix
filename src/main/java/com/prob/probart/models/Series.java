
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
@Table(name = "series")
public class Series {
    @Id
    @Column(name = "ser_titulo")
    String serTitulo;
    
    @Column(name = "ser_temporadas")
    Long serTemporadas;
    
    @Column(name = "ser_episodios")
    Long serEpisodios;

    public String getSerTitulo() {
        return serTitulo;
    }

    public void setSerTitulo(String serTitulo) {
        this.serTitulo = serTitulo;
    }

    public Long getSerTemporadas() {
        return serTemporadas;
    }

    public void setSerTemporadas(Long serTemporadas) {
        this.serTemporadas = serTemporadas;
    }

    public Long getSerEpisodios() {
        return serEpisodios;
    }

    public void setSerEpisodios(Long serEpisodios) {
        this.serEpisodios = serEpisodios;
    }
        
    
}
