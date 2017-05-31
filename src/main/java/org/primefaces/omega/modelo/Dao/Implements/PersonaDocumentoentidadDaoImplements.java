/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao.Implements;

import org.primefaces.omega.modelo.Dao.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.primefaces.omega.Util.NewHibernateUtil;
import org.primefaces.omega.modelo.PersonaDireccionentidad;
import org.primefaces.omega.modelo.PersonaDocumentoentidad;

/**
 *
 * @author fabricio
 */
public class PersonaDocumentoentidadDaoImplements implements PersonaDocumentoentidadDao {

    @Override
    public void InsertarPersonaDocumentoentidad(PersonaDocumentoentidad ObjPersonaDocumentoentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjPersonaDocumentoentidades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarPersonaDocumentoentidad(PersonaDocumentoentidad ObjPersonaDocumentoentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjPersonaDocumentoentidades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarPersonaDocumentoentidad(PersonaDocumentoentidad ObjPersonaDocumentoentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjPersonaDocumentoentidades);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarPersonaDocumentoentidad(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaPersonaDocumentoentidad = null;
        try {
            ListaPersonaDocumentoentidad = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaDocumentoentidad;
    }

    @Override
    public ArrayList LoadTablaPersonaDocumentoentidades() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From PersonaDocumentoentidad";
        ArrayList<PersonaDocumentoentidad> ListaPersonaDocumentoentidad = new ArrayList<>();

        try {

            ListaPersonaDocumentoentidad = (ArrayList<PersonaDocumentoentidad>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaDocumentoentidad;
    }

}
