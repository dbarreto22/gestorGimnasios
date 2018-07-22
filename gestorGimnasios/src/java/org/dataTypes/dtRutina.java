/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class dtRutina {

    String nombre;
    String descripcion;
    int repeticiones;
    int duracion;
    int descanso;
    List<dtMovimientos> movimientos;

    public dtRutina() {
    }

    public dtRutina(String nombre, String descripcion, int repeticiones, int duracion, int descanso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.repeticiones = repeticiones;
        this.duracion = duracion;
        this.descanso = descanso;
        this.movimientos = new ArrayList<dtMovimientos>();
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
    
    
    
}
