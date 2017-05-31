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
import org.primefaces.omega.modelo.LogisticaTipodireccion;

/**
 *
 * @author fabricio
 */
public class LogisticaTipodireccionDaoImplements implements LogisticaTipodireccionDao {

    @Override
    public void InsertarLogisticaTipodireccion(LogisticaTipodireccion ObjLogisticaTipodirecciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjLogisticaTipodirecciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarLogisticaTipodireccion(LogisticaTipodireccion ObjLogisticaTipodirecciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjLogisticaTipodirecciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarLogisticaTipodireccion(LogisticaTipodireccion ObjLogisticaTipodirecciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjLogisticaTipodirecciones);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarLogisticaTipodireccion(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaLogisticaTipodireccion = null;
        try {
            ListaLogisticaTipodireccion = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaTipodireccion;
    }

    @Override
    public ArrayList LoadTablaLogisticaTipodirecciones() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From LogisticaTipodireccion";
        ArrayList<LogisticaTipodireccion> ListaLogisticaTipodireccion = new ArrayList<>();

        try {

            ListaLogisticaTipodireccion = (ArrayList<LogisticaTipodireccion>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaTipodireccion;
    }

}
