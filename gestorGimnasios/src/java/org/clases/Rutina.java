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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtMovimientos;
import org.dataTypes.dtRutina;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Rutina implements Serializable {

    @Id
    int id;
    String nombre;
    String descripcion;
    int repeticiones;
    int duracion;
    int descanso;
    List<dtMovimientos> movimientos;

    public Rutina() {
    }

    public Rutina(dtRutina dtRutina) {
        this.nombre = dtRutina.getNombre();
        this.descripcion = dtRutina.getDescripcion();
        this.repeticiones = dtRutina.getRepeticiones();
        this.duracion = dtRutina.getDuracion();
        this.descanso = dtRutina.getDescanso();
        this.movimientos = dtRutina.getMovimientos();
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

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDescanso() {
        return descanso;
    }

    public void setDescanso(int descanso) {
        this.descanso = descanso;
    }

    public List<dtMovimientos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<dtMovimientos> movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
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
        final Rutina other = (Rutina) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
