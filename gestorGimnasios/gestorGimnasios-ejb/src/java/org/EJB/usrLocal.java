/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.EJB;

import java.beans.*;
import java.io.Serializable;
import javax.ejb.Local;
import org.Clases.Usuario;

/**
 *
 * @author diego
 */
@Local
public interface usrLocal  {
    
    Usuario crearUsuario(Usuario usr);
    


}
