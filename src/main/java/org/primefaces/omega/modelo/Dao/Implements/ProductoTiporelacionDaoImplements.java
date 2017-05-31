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
import org.primefaces.omega.modelo.ProductoTiporelacion;

/**
 *
 * @author fabricio
 */
public class ProductoTiporelacionDaoImplements implements ProductoTiporelacionDao {
    

    @Override
    public void InsertarProductoTiporelacion(ProductoTiporelacion objProductoTiporelaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.save(objProductoTiporelaciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public void EliminarProductoTiporelacion(ProductoTiporelacion ObjProductoTiporelaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.delete(ObjProductoTiporelaciones);
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
    }

    @Override
    public void ActualizarProductoTiporelacion(ProductoTiporelacion ObjProductoTiporelaciones) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        try {

            s.update(ObjProductoTiporelaciones);
            transaccion.commit();

        } catch (Exception err) {
            transaccion.rollback();
        } finally {
            s.close();
        }
    }

    @Override
    public ArrayList BuscarProductoTiporelacion(String Consulta) {
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        ArrayList ListaProductoTiporelacion = null;
        try {
            ListaProductoTiporelacion = (ArrayList) (List) s.createQuery(Consulta).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoTiporelacion;
    }

    @Override
    public ArrayList LoadTablaProductoTiporelaciones() {
        
        Session s = NewHibernateUtil.getSession();
        Transaction transaccion = s.beginTransaction();
        String query = "From ProductoTiporelacion";
        ArrayList<ProductoTiporelacion> ListaProductoTiporelacion = new ArrayList<>();

        try {

            ListaProductoTiporelacion = (ArrayList<ProductoTiporelacion>) s.createQuery(query).list();
            transaccion.commit();

        } catch (Exception err) {

            transaccion.rollback();

        } finally {
            s.close();
        }
        return ListaProductoTiporelacion;
    }

    @Override
    public void buscar_dos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar_tres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
