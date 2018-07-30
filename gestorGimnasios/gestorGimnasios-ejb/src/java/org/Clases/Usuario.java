/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtUsuario;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario implements Serializable {
    
    @Id @GeneratedValue
    Long id;

    String nombre;
    String apellido;
    String telefono;
    dtDireccion dtDir;
    int edad;
    String sexo;
    Date fechaNac;
    String email;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dtDir = dtDir;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.email = email;
    }
    
    public Usuario(dtUsuario dtU){
        this.nombre = dtU.getNombre();
        this.apellido = dtU.getApellido();
        this.telefono = dtU.getTelefono();
        this.dtDir = dtU.getDtDir();
        this.edad = dtU.getEdad();
        this.sexo = dtU.getSexo();
        this.fechaNac = dtU.getFechaNac();
        this.email = dtU.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
