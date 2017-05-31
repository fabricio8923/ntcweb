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
import org.primefaces.omega.modelo.ProductoTipoatributo;
import org.primefaces.omega.modelo.ProductoTipoproducto;

/**
 *
 * @author fabricio
 */
public class ProductoTipoatributoDaoImplements implements ProductoTipoatributoDao{

    @Override
    public void InsertarProductoTipoatributo(ProductoTipoatributo ObjProductoTipoatributos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjProductoTipoatributos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarProductoTipoatributo(ProductoTipoatributo ObjProductoTipoatributos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjProductoTipoatributos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarProductoTipoatributo(ProductoTipoatributo ObjProductoTipoatributos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjProductoTipoatributos);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarProductoTipoatributo(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaProductoTipoatributo = null;
        try {
            ListaProductoTipoatributo = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoTipoatributo;
    }

    @Override
    public ArrayList LoadTablaProductoTipoatributos() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From ProductoTipoatributo";
        ArrayList<ProductoTipoatributo> ListaProductoTipoatributo = new ArrayList<>();

        try {

            ListaProductoTipoatributo = (ArrayList<ProductoTipoatributo>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoTipoatributo;
    }

   
}
