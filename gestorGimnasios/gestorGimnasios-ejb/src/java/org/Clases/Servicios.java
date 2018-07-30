/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtServicios;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Servicios implements Serializable {

    @Id @GeneratedValue
    Long id;
    String nombre;
    String descripcion;
    int duracion;
    @ManyToMany(fetch = FetchType.LAZY)
    List<dtGimnasios> gimnasios;

    public Servicios() {
    }

    public Servicios(String nombre, String descripcion, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public Servicios(dtServicios dtServicio) {
        this.nombre = dtServicio.getNombre();
        this.duracion = dtServicio.getDuracion();
        this.descripcion = dtServicio.getDescripcion();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Servicios other = (Servicios) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }



}
