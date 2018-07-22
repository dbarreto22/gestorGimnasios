/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clases;
import org.dataTypes.dtAdministador;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtGimnasios;

/**
 *
 * @author diego
 */
public class Gimnasios {
    
    int id;
    String nombre;
    dtDireccion dtDir;
    String telefono;
    dtAdministador dtAdmin;

    public Gimnasios() {
    }
    
    public Gimnasios(dtGimnasios dtGim) {
        this.nombre = dtGim.getNombre();
        this.dtAdmin = dtGim.getDtAdmin();
        this.dtDir = dtGim.getDtDir();
        this.telefono = dtGim.getTelefono();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public dtDireccion getDtDir() {
        return dtDir;
    }

    public void setDtDir(dtDireccion dtDir) {
        this.dtDir = dtDir;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public dtAdministador getDtAdmin() {
        return dtAdmin;
    }

    public void setDtAdmin(dtAdministador dtAdmin) {
        this.dtAdmin = dtAdmin;
    }
    
}
