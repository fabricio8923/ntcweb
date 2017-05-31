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
import org.primefaces.omega.modelo.PersonaPersona;

/**
 *
 * @author fabricio
 */
public class PersonaPersonaDaoImplements implements PersonaPersonaDao {

    @Override
    public void InsertarPersonaPersona(PersonaPersona ObjPersonaPersonas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjPersonaPersonas);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarPersonaPersona(PersonaPersona ObjPersonaPersonas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjPersonaPersonas);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarPersonaPersona(PersonaPersona ObjPersonaPersonas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjPersonaPersonas);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarPersonaPersona(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaPersonaPersona = null;
        try {
            ListaPersonaPersona = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaPersona;
    }

    @Override
    public ArrayList LoadTablaPersonaPersonas() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From PersonaPersona";
        ArrayList<PersonaPersona> ListaPersonaPersona = new ArrayList<>();

        try {

            ListaPersonaPersona = (ArrayList<PersonaPersona>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaPersona;
    }

}
