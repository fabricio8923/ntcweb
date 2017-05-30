/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.PersonaTipodocumento;

/**
 *
 * @author fabricio
 */
public interface PersonaTipodocumentoDao {

    public void InsertarPersonaTipodocumento(PersonaTipodocumento ObjPersonaTipodocumentos);

    public void EliminarPersonaTipodocumento(PersonaTipodocumento ObjPersonaTipodocumentos);

    public void ActualizarPersonaTipodocumento(PersonaTipodocumento ObjPersonaTipodocumentos);

    public ArrayList BuscarPersonaTipodocumento(String Consulta);

    public ArrayList LoadTablaPersonaTipodocumentos();
}
