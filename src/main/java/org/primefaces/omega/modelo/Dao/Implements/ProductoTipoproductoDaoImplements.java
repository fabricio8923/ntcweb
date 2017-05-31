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
import org.primefaces.omega.modelo.ProductoTipoproducto;

/**
 *
 * @author fabricio
 */
public class ProductoTipoproductoDaoImplements implements ProductoTipoproductoDao{

    @Override
    public void InsertarProductoTipoproducto(ProductoTipoproducto ObjProductoTipoproductos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(ObjProductoTipoproductos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarProductoTipoproducto(ProductoTipoproducto ObjProductoTipoproductos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjProductoTipoproductos);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarProductoTipoproducto(ProductoTipoproducto ObjProductoTipoproductos) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjProductoTipoproductos);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarProductoTipoproducto(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaProductoTipoproducto = null;
        try {
            ListaProductoTipoproducto = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoTipoproducto;
    }

    @Override
    public ArrayList LoadTablaProductoTipoproductos() {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From ProductoTipoproducto";
        ArrayList<ProductoTipoproducto> ListaProductoTipoproducto = new ArrayList<>();

        try {

            ListaProductoTipoproducto = (ArrayList<ProductoTipoproducto>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoTipoproducto;
    }

    
}
