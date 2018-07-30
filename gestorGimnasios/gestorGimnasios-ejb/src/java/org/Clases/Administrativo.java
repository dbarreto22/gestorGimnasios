/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
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
public class Administrativo extends Usuario implements Serializable {

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido, String telefono, dtDireccion dtDir, int edad, String sexo, Date fechaNac, String email) {
        super(nombre, apellido, telefono, dtDir, edad, sexo, fechaNac, email);
    }

    public Administrativo(dtUsuario dtU) {
        super(dtU);
    }


   
}
