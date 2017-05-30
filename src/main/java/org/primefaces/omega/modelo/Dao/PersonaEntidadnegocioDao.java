/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaEntidadnegocio;

/**
 *
 * @author fabricio
 */
public interface PersonaEntidadnegocioDao {

    public void InsertarPersonaEntidadnegocio(PersonaEntidadnegocio ObjPersonaEntidadnegocios);

    public void EliminarPersonaEntidadnegocio(PersonaEntidadnegocio ObjPersonaEntidadnegocios);

    public void ActualizarPersonaEntidadnegocio(PersonaEntidadnegocio ObjPersonaEntidadnegocios);

    public ArrayList BuscarPersonaEntidadnegocio(String Consulta);

    public ArrayList LoadTablaPersonaEntidadnegocios();
}
