/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.Date;
import java.util.List;


/**
 *
 * @author diego
 */
public class dtCliente extends dtUsuario{
    
    float peso;
    float altura;

    List<dtGimnasios> gimnasios;
    dtProfesor dtProfe;
    List<dtRutina> rutinas;

    public dtCliente() {
    }

    public dtCliente(float peso, float altura, List<dtGimnasios> gimnasios, dtProfesor dtProfe, List<dtRutina> rutinas, String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac) {
        super(nombre, apellido, telefono, dtDir, edad, sexo, fechaNac);
        this.peso = peso;
        this.altura = altura;
        this.gimnasios = null;
        this.dtProfe = null;
        this.rutinas = null;
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
