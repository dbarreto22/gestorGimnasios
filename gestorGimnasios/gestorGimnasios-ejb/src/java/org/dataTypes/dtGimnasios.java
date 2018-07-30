/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.List;
import org.dataTypes.dtAdministador;

/**
 *
 * @author diego
 */
public class dtGimnasios {

    String nombre;
    dtDireccion dtDir;
    String telefono;
    dtAdministador dtAdmin;
    List<dtServicios> servicios;

    public dtGimnasios() {
    }

    public dtGimnasios(String nombre, dtDireccion dtDir, String telefono, dtAdministador dtAdmin, List<dtServicios> servicios) {
        this.nombre = nombre;
        this.dtDir = dtDir;
        this.telefono = telefono;
        this.dtAdmin = dtAdmin;
        this.servicios = null;
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

    public List<dtServicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<dtServicios> servicios) {
        this.servicios = servicios;
    }

}
