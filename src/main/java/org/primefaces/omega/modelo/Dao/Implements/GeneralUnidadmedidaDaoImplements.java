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
import org.primefaces.omega.modelo.GeneralUnidadmedida;

/**
 *
 * @author fabricio
 */
public class GeneralUnidadmedidaDaoImplements implements GeneralUnidadmedidaDao {

    @Override
    public void InsertarGeneralUnidadmedida(GeneralUnidadmedida ObjGeneralUnidadmedidas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjGeneralUnidadmedidas);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarGeneralUnidadmedida(GeneralUnidadmedida ObjGeneralUnidadmedidas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjGeneralUnidadmedidas);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarGeneralUnidadmedida(GeneralUnidadmedida ObjGeneralUnidadmedidas) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjGeneralUnidadmedidas);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarGeneralUnidadmedida(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaGeneralUnidadmedida = null;
        try {
            ListaGeneralUnidadmedida = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaGeneralUnidadmedida;
    }

    @Override
    public ArrayList LoadTablaGeneralUnidadmedidas() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From GeneralUnidadmedida";
        ArrayList<GeneralUnidadmedida> ListaGeneralUnidadmedida = new ArrayList<>();

        try {

            ListaGeneralUnidadmedida = (ArrayList<GeneralUnidadmedida>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaGeneralUnidadmedida;
    }

}
