/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaPersona;

/**
 *
 * @author fabricio
 */
public interface PersonaPersonaDao {

    public void InsertarPersonaPersona(PersonaPersona ObjPersonaPersonas);

    public void EliminarPersonaPersona(PersonaPersona ObjPersonaPersonas);

    public void ActualizarPersonaPersona(PersonaPersona ObjPersonaPersonas);

    public ArrayList BuscarPersonaPersona(String Consulta);

    public ArrayList LoadTablaPersonaPersonas();
}
