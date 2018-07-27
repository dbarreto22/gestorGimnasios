/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class dtProfesor {
    
    String nombre;
    String apellido;
    dtDireccion dtDir;
    String telefono;
    int edad;
    List<dtGimnasios> gimnasios;
    List<dtCliente> clientes;
    List<dtRutina> rutinas;

    public dtProfesor() {
    }

    public dtProfesor(String nombre, String apellido, dtDireccion dtDir, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dtDir = dtDir;
        this.telefono = telefono;
        this.edad = edad;
        this.gimnasios = new ArrayList<dtGimnasios>();
        this.clientes = new ArrayList<dtCliente>();
        this.rutinas = new ArrayList<dtRutina>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public List<dtGimnasios> getGimnasios() {
        return gimnasios;
    }

    public void setGimnasios(List<dtGimnasios> gimnasios) {
        this.gimnasios = gimnasios;
    }

    public List<dtCliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<dtCliente> clientes) {
        this.clientes = clientes;
    }

    public List<dtRutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(List<dtRutina> rutinas) {
        this.rutinas = rutinas;
    }
    
    
}
