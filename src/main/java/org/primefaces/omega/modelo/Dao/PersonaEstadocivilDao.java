/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaEstadocivil;

/**
 *
 * @author fabricio
 */
public interface PersonaEstadocivilDao {

    public void InsertarPersonaEstadocivil(PersonaEstadocivil ObjPersonaEstadociviles);

    public void EliminarPersonaEstadocivil(PersonaEstadocivil ObjPersonaEstadociviles);

    public void ActualizarPersonaEstadocivil(PersonaEstadocivil ObjPersonaEstadociviles);

    public ArrayList BuscarPersonaEstadocivil(String Consulta);

    public ArrayList LoadTablaPersonaEstadociviles();
}
