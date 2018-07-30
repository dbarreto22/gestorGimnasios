/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.EJB;

import java.beans.*;
import java.io.Serializable;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.Clases.Usuario;
import org.dataTypes.dtUsuario;


/**
 *
 * @author diego
 */
@Stateless
@Remote(usrRemote.class)
@Local(usrLocal.class)
@LocalBean
public class ejbUsuario implements usrLocal, usrRemote, usrSOAP {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    @PersistenceContext(unitName = "gestorGimnasios-ejbPU")
    private EntityManager em;
    
    public Usuario crearUsuario(Usuario usr){
        em.persist(usr);
        return usr;
    }
    
    public ejbUsuario() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
