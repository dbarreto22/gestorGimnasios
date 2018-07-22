/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtProfesor;
import org.dataTypes.dtRutina;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class RutinaParticular extends Rutina implements Serializable {

    @ManyToOne
    dtProfesor dtProfe;

    public RutinaParticular(dtRutina rutina, dtProfesor dtProfe) {
        super(rutina);
        this.dtProfe = dtProfe;

    }

    public dtProfesor getDtProfe() {
        return dtProfe;
    }

    public void setDtProfe(dtProfesor dtProfe) {
        this.dtProfe = dtProfe;
    }
    
    

}
