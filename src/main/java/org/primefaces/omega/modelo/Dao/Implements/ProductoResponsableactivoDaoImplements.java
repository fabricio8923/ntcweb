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
import org.primefaces.omega.modelo.ProductoResponsableactivo;
import org.primefaces.omega.modelo.ProductoTipoproducto;

/**
 *
 * @author fabricio
 */
public class ProductoResponsableactivoDaoImplements implements ProductoResponsableactivoDao{

    @Override
    public void InsertarProductoResponsableactivo(ProductoResponsableactivo ObjProductoResponsableactivos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjProductoResponsableactivos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarProductoResponsableactivo(ProductoResponsableactivo ObjProductoResponsableactivos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjProductoResponsableactivos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarProductoResponsableactivo(ProductoResponsableactivo ObjProductoResponsableactivos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjProductoResponsableactivos);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarProductoResponsableactivo(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaProductoResponsableactivo = null;
        try {
            ListaProductoResponsableactivo = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoResponsableactivo;
    }

    @Override
    public ArrayList LoadTablaProductoResponsableactivos() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From ProductoResponsableactivo";
        ArrayList<ProductoResponsableactivo> ListaProductoResponsableactivo = new ArrayList<>();

        try {

            ListaProductoResponsableactivo = (ArrayList<ProductoResponsableactivo>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoResponsableactivo;
    }

  
}
