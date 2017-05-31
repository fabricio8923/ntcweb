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
import org.primefaces.omega.modelo.OrganizacionTrabajador;
import org.primefaces.omega.modelo.PersonaDireccionentidad;

/**
 *
 * @author fabricio
 */
public class PersonaDireccionentidadDaoImplements implements PersonaDireccionentidadDao {

    @Override
    public void InsertarPersonaDireccionentidad(PersonaDireccionentidad ObjPersonaDireccionentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjPersonaDireccionentidades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarPersonaDireccionentidad(PersonaDireccionentidad ObjPersonaDireccionentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjPersonaDireccionentidades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarPersonaDireccionentidad(PersonaDireccionentidad ObjPersonaDireccionentidades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjPersonaDireccionentidades);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarPersonaDireccionentidad(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaPersonaDireccionentidad = null;
        try {
            ListaPersonaDireccionentidad = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaDireccionentidad;
    }

    @Override
    public ArrayList LoadTablaPersonaDireccionentidades() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From PersonaDireccionentidad";
        ArrayList<PersonaDireccionentidad> ListaPersonaDireccionentidad = new ArrayList<>();

        try {

            ListaPersonaDireccionentidad = (ArrayList<PersonaDireccionentidad>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaPersonaDireccionentidad;
    }

}
