/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtProfesor;
import org.dataTypes.dtRutina;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente extends Usuario implements Serializable {

    float peso;
    float altura;
    @ManyToMany
    List<dtGimnasios> gimnasios;
    @ManyToOne
    dtProfesor dtProfe;
    @ManyToMany
    List<dtRutina> rutinas;

    public Cliente() {
    }

    public Cliente(float peso, float altura, List<dtGimnasios> gimnasios, dtProfesor dtProfe, List<dtRutina> rutinas, String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac) {
        super(nombre, apellido, telefono, dtDir, edad, sexo, fechaNac);
        this.peso = peso;
        this.altura = altura;
        this.gimnasios = gimnasios;
        this.dtProfe = dtProfe;
        this.rutinas = rutinas;
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
