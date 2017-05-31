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
import org.primefaces.omega.modelo.PersonaEstadocivil;

/**
 *
 * @author fabricio
 */
public class PersonaEstadocivilDaoImplements implements PersonaEstadocivilDao {

    @Override
    public void InsertarPersonaEstadocivil(PersonaEstadocivil ObjPersonaEstadociviles) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjPersonaEstadociviles);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarPersonaEstadocivil(PersonaEstadocivil ObjPersonaEstadociviles) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjPersonaEstadociviles);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarPersonaEstadocivil(PersonaEstadocivil ObjPersonaEstadociviles) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjPersonaEstadociviles);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarPersonaEstadocivil(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaPersonaEstadocivil = null;
        try {
            ListaPersonaEstadocivil = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaEstadocivil;
    }

    @Override
    public ArrayList LoadTablaPersonaEstadociviles() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From PersonaEstadocivil";
        ArrayList<PersonaEstadocivil> ListaPersonaEstadocivil = new ArrayList<>();

        try {

            ListaPersonaEstadocivil = (ArrayList<PersonaEstadocivil>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaEstadocivil;
    }

}
