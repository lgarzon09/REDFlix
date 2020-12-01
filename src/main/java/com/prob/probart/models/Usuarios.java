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
@Table(name = "usuarios")
public class Usuarios {
    
    @Id
    @Column(name = "usu_alias")
    String usuAlias;
    
    @Column(name = "usu_nombre")
    String usuNombre;
    
    @Column(name = "usu_apellidos")
    String usuApellidos;
    
    @Column(name = "usu_email")
    String usuEmail;
    
    @Column(name = "usu_celular")
    String usuCelular;
    
    @Column(name = "usu_nacimiento")
    String usuNacimiento;
    
    @Column(name = "usu_contrasena")
    String usuContrasena;

    public String getUsuAlias() {
        return usuAlias;
    }

    public void setUsuAlias(String usuAlias) {
        this.usuAlias = usuAlias;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApellidos() {
        return usuApellidos;
    }

    public void setUsuApellidos(String usuApellidos) {
        this.usuApellidos = usuApellidos;
    }

    public String getUsuEmail() {
        return usuEmail;
    }

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    public String getUsuCelular() {
        return usuCelular;
    }

    public void setUsuCelular(String usuCelular) {
        this.usuCelular = usuCelular;
    }

    public String getUsuNacimiento() {
        return usuNacimiento;
    }

    public void setUsuNacimiento(String usuNacimiento) {
        this.usuNacimiento = usuNacimiento;
    }

    public String getUsuContrasena() {
        return usuContrasena;
    }

    public void setUsuContrasena(String usuContrasena) {
        this.usuContrasena = usuContrasena;
    }
    
    
    
}
