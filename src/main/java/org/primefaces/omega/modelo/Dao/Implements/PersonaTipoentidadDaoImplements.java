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
import org.primefaces.omega.modelo.PersonaTipoentidad;

/**
 *
 * @author fabricio
 */
public class PersonaTipoentidadDaoImplements implements PersonaTipoentidadDao {

    @Override
    public void InsertarPersonaTipoentidad(PersonaTipoentidad ObjPersonaTipoentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjPersonaTipoentidades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarPersonaTipoentidad(PersonaTipoentidad ObjPersonaTipoentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjPersonaTipoentidades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarPersonaTipoentidad(PersonaTipoentidad ObjPersonaTipoentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjPersonaTipoentidades);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarPersonaTipoentidad(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaPersonaTipoentidad = null;
        try {
            ListaPersonaTipoentidad = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaTipoentidad;
    }

    @Override
    public ArrayList LoadTablaPersonaTipoentidades() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From PersonaTipoentidad";
        ArrayList<PersonaTipoentidad> ListaPersonaTipoentidad = new ArrayList<>();

        try {

            ListaPersonaTipoentidad = (ArrayList<PersonaTipoentidad>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaTipoentidad;
    }

}
