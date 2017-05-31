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
import org.primefaces.omega.modelo.GeneralMotivoactividad;

/**
 *
 * @author fabricio
 */
public class GeneralMotivoactividadDaoImplements implements GeneralMotivoactividadDao {

    @Override
    public void InsertarGeneralMotivoactividad(GeneralMotivoactividad ObjGeneralMotivoactividades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjGeneralMotivoactividades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarGeneralMotivoactividad(GeneralMotivoactividad ObjGeneralMotivoactividades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjGeneralMotivoactividades);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarGeneralMotivoactividad(GeneralMotivoactividad ObjGeneralMotivoactividades) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjGeneralMotivoactividades);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarGeneralMotivoactividad(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaGeneralMotivoactividad = null;
        try {
            ListaGeneralMotivoactividad = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaGeneralMotivoactividad;
    }

    @Override
    public ArrayList LoadTablaGeneralMotivoactividades() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From GeneralMotivoactividad";
        ArrayList<GeneralMotivoactividad> ListaGeneralMotivoactividad = new ArrayList<>();

        try {

            ListaGeneralMotivoactividad = (ArrayList<GeneralMotivoactividad>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaGeneralMotivoactividad;
    }

}
