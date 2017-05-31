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
import org.primefaces.omega.modelo.ProductoSerie;
import org.primefaces.omega.modelo.ProductoTipoproducto;

/**
 *
 * @author fabricio
 */
public class ProductoSerieDaoImplements implements ProductoSerieDao {

    @Override
    public void InsertarProductoSerie(ProductoSerie ObjProductoSeries) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjProductoSeries);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarProductoSerie(ProductoSerie ObjProductoSeries) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjProductoSeries);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarProductoSerie(ProductoSerie ObjProductoSeries) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjProductoSeries);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarProductoSerie(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaProductoSerie = null;
        try {
            ListaProductoSerie = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoSerie;
    }

    @Override
    public ArrayList LoadTablaProductoSeries() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From ProductoSerie";
        ArrayList<ProductoSerie> ListaProductoSerie = new ArrayList<>();

        try {

            ListaProductoSerie = (ArrayList<ProductoSerie>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoSerie;
    }

 
}
