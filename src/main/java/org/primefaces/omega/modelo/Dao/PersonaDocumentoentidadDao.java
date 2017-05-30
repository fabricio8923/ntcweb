/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaDocumentoentidad;

/**
 *
 * @author fabricio
 */
public interface PersonaDocumentoentidadDao {

    public void InsertarPersonaDocumentoentidad(PersonaDocumentoentidad ObjPersonaDocumentoentidades);

    public void EliminarPersonaDocumentoentidad(PersonaDocumentoentidad ObjPersonaDocumentoentidades);

    public void ActualizarPersonaDocumentoentidad(PersonaDocumentoentidad ObjPersonaDocumentoentidades);

    public ArrayList BuscarPersonaDocumentoentidad(String Consulta);

    public ArrayList LoadTablaPersonaDocumentoentidades();
}
