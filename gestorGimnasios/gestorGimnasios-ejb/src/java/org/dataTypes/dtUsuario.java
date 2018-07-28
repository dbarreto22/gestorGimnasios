/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dataTypes;

import java.util.Date;
import org.Clases.Usuario;

/**
 *
 * @author diego
 */
public class dtUsuario  {

    String nombre;
    String apellido;
    String telefono;
    dtDireccion dtDir;
    int edad;
    String sexo;
    Date fechaNac;

    public dtUsuario() {
    }

    public dtUsuario(String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac) {
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
    
}
