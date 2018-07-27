/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtCliente;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtProfesor;
import org.dataTypes.dtRutina;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Profesor implements Serializable {

    @Id
    int id;
    String nombre;
    String apellido;
    dtDireccion dtDir;
    String telefono;
    int edad;

    List<dtCliente> clientes;
    List<dtRutina> rutinas;

    public Profesor() {
    }

    public Profesor(dtProfesor dtProfe) {
        this.nombre = dtProfe.getNombre();
        this.dtDir = dtProfe.getDtDir();
        this.telefono = dtProfe.getTelefono();
        this.clientes = dtProfe.getClientes();
        this.rutinas = dtProfe.getRutinas();
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Profesor other = (Profesor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
