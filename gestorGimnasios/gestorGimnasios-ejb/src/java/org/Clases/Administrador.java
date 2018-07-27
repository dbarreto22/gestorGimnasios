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
import javax.persistence.ManyToOne;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtAdministador;
import static org.hibernate.type.TypeFactory.serializable;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Administrador implements Serializable {
   
    @Id
    int id;
    String nombre;
    String apellido;
    dtDireccion dtDir;
    String telefono;
    String empresa;

    List<dtGimnasios> gimnasios;

    public Administrador() {
    }

    public Administrador(dtAdministador dtAdmin) {
        this.nombre = dtAdmin.getNombre();
        this.apellido = dtAdmin.getApellido();
        this.dtDir = dtAdmin.getDtDir();
        this.telefono = dtAdmin.getTelefono();
        this.empresa = dtAdmin.getEmpresa();
        this.gimnasios = dtAdmin.getGimnasios();

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
        final Administrador other = (Administrador) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
}
