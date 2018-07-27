/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtDireccion;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario implements Serializable {
    
    @Id
    int id;
    String nombre;
    String apellido;
    String telefono;
    dtDireccion dtDir;
    int edad;
    String sexo;
    Date fechaNac;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dtDir = dtDir;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public dtDireccion getDtDir() {
        return dtDir;
    }

    public void setDtDir(dtDireccion dtDir) {
        this.dtDir = dtDir;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
