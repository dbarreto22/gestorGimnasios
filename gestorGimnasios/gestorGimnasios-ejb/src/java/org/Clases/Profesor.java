/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtCliente;
import org.dataTypes.dtDireccion;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtProfesor;
import org.dataTypes.dtRutina;
import org.dataTypes.dtUsuario;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Profesor extends Usuario implements Serializable {

  
    @OneToMany(fetch = FetchType.LAZY)
    List<dtCliente> clientes;
    
    List<dtRutina> rutinas;

    public Profesor() {
    }

    public Profesor(List<dtCliente> clientes, List<dtRutina> rutinas, String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac, String email) {
        super(nombre, apellido, telefono, dtDir, edad, sexo, fechaNac, email);
        this.clientes = null;
        this.rutinas = null;
    }

    public Profesor(List<dtCliente> clientes, List<dtRutina> rutinas, dtUsuario dtU) {
        super(dtU);
        this.clientes = null;
        this.rutinas = null;
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

   

   

}
