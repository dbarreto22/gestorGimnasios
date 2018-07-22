/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtCliente;
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
public class Cliente implements Serializable {
    @Id
    int id;
    String nombre;
    String apellido;
    String telefono;
    dtDireccion dtDir;
    int edad;
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
    
    public Cliente(dtCliente dtCliente) {
        this.nombre = dtCliente.getNombre();
        this.apellido = dtCliente.getApellido();
        this.telefono = dtCliente.getTelefono();
        this.dtDir = dtCliente.getDtDir();
        this.edad = dtCliente.getEdad();
        this.peso = dtCliente.getPeso();
        this.altura = dtCliente.getAltura();
        this.gimnasios = dtCliente.getGimnasios();
        this.dtProfe = dtCliente.getDtProfe();
        this.rutinas = dtCliente.getRutinas();
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

    public List<dtRutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(List<dtRutina> rutinas) {
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


    public dtProfesor getDtProfe() {
        return dtProfe;
    }

    public void setDtProfe(dtProfesor dtProfe) {
        this.dtProfe = dtProfe;
    }

    public List<dtGimnasios> getGimnasios() {
        return gimnasios;
    }

    public void setGimnasios(List<dtGimnasios> gimnasios) {
        this.gimnasios = gimnasios;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
