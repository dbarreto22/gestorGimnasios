/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author diego
 */
public class dtProfesor extends dtUsuario{
    
    List<dtGimnasios> gimnasios;
    List<dtCliente> clientes;
    List<dtRutina> rutinas;

    public dtProfesor() {
    }

    public dtProfesor(List<dtGimnasios> gimnasios, List<dtCliente> clientes, List<dtRutina> rutinas, String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac) {
        super(nombre, apellido, telefono, dtDir, edad, sexo, fechaNac);
        this.gimnasios = null;
        this.clientes = null;
        this.rutinas = null;
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
