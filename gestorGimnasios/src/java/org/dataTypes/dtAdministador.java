/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.List;

/**
 *
 * @author diego
 */
public class dtAdministador {
    
    String nombre;
    String apellido;
    dtDireccion dtDir;
    String telefono;
    String empresa;
    List<dtGimnasios> gimnasios;

    public dtAdministador() {
    }

    public dtAdministador(String nombre, String apellido, dtDireccion dtDir, String telefono, String empresa, List<dtGimnasios> gimnasios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dtDir = dtDir;
        this.telefono = telefono;
        this.empresa = empresa;
        this.gimnasios = gimnasios;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public dtDireccion getDtDir() {
        return dtDir;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public List<dtGimnasios> getGimnasios() {
        return gimnasios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDtDir(dtDireccion dtDir) {
        this.dtDir = dtDir;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setGimnasios(List<dtGimnasios> gimnasios) {
        this.gimnasios = gimnasios;
    }
    
    
}
