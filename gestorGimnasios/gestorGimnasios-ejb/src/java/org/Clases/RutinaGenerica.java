/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import org.dataTypes.dtGimnasios;
import org.dataTypes.dtRutina;

/**
 *
 * @author diego
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class RutinaGenerica extends Rutina implements Serializable {

    @ManyToOne
    List<dtGimnasios> gimnasios;

    public RutinaGenerica(List<dtGimnasios> gimnasios) {
        this.gimnasios = gimnasios;
    }

    public RutinaGenerica(dtRutina rutina) {
        super(rutina);
        this.gimnasios = null;

    }

    public List<dtGimnasios> getGimnasios() {
        return gimnasios;
    }

    public void setGimnasios(List<dtGimnasios> gimnasios) {
        this.gimnasios = gimnasios;
    }
    
    

}
