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
public class dtCliente {
    
    String nombre;
    String apellido;
    dtDireccion dtDir;
    String telefono;
    int edad;
    float peso;
    float altura;
    List<dtGimnasios> gimnasios;
    dtProfesor dtProfe;
    List<dtRutina> rutinas;

    public dtCliente() {
    }

    public dtCliente(String nombre, dtDireccion dtDir, String telefono, int edad, float peso, float altura, List<dtGimnasios> gimnasios, dtProfesor dtProfe, List<dtRutina> rutinas) {
        this.nombre = nombre;
        this.dtDir = dtDir;
        this.telefono = telefono;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.gimnasios = gimnasios;
        this.dtProfe = dtProfe;
        this.rutinas = rutinas;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public List<dtGimnasios> getGimnasios() {
        return gimnasios;
    }

    public void setGimnasios(List<dtGimnasios> gimnasios) {
        this.gimnasios = gimnasios;
    }

    public dtProfesor getDtProfe() {
        return dtProfe;
    }

    public void setDtProfe(dtProfesor dtProfe) {
        this.dtProfe = dtProfe;
    }

    public List<dtRutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(List<dtRutina> rutinas) {
        this.rutinas = rutinas;
    }
    
    
    
}
