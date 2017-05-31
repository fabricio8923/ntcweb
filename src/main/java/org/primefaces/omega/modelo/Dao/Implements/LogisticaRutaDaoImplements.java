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
import org.primefaces.omega.modelo.LogisticaRuta;

/**
 *
 * @author fabricio
 */
public class LogisticaRutaDaoImplements implements LogisticaRutaDao {

    @Override
    public void InsertarLogisticaRuta(LogisticaRuta ObjLogisticaRutas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjLogisticaRutas);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarLogisticaRuta(LogisticaRuta ObjLogisticaRutas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjLogisticaRutas);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarLogisticaRuta(LogisticaRuta ObjLogisticaRutas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjLogisticaRutas);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarLogisticaRuta(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaLogisticaRuta = null;
        try {
            ListaLogisticaRuta = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaRuta;
    }

    @Override
    public ArrayList LoadTablaLogisticaRutas() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From LogisticaRuta";
        ArrayList<LogisticaRuta> ListaLogisticaRuta = new ArrayList<>();

        try {

            ListaLogisticaRuta = (ArrayList<LogisticaRuta>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaLogisticaRuta;
    }

}
