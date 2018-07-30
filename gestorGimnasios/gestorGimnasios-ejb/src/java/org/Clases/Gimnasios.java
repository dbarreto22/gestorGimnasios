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
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtAdministador;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtServicios;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Gimnasios implements Serializable{
    
    @Id @GeneratedValue
    int id;
    String nombre;
    dtDireccion dtDir;
    String telefono;
    @OneToMany(fetch = FetchType.LAZY)
    dtAdministador dtAdmin;
    @ManyToMany(fetch = FetchType.LAZY)
    List<dtServicios> servicios;

    public Gimnasios() {
    }

    public Gimnasios(String nombre, dtDireccion dtDir, String telefono, dtAdministador dtAdmin, List<dtServicios> servicios) {
        this.nombre = nombre;
        this.dtDir = dtDir;
        this.telefono = telefono;
        this.dtAdmin = dtAdmin;
        this.servicios = servicios;
    }
    
    
    
    public Gimnasios(dtGimnasios dtGim) {
        this.nombre = dtGim.getNombre();
        this.dtAdmin = dtGim.getDtAdmin();
        this.dtDir = dtGim.getDtDir();
        this.telefono = dtGim.getTelefono();
        this.servicios = dtGim.getServicios();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public dtAdministador getDtAdmin() {
        return dtAdmin;
    }

    public void setDtAdmin(dtAdministador dtAdmin) {
        this.dtAdmin = dtAdmin;
    }

    public List<dtServicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<dtServicios> servicios) {
        this.servicios = servicios;
    }
    
    
}
