/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoResponsableactivo;

/**
 *
 * @author fabricio
 */
public interface ProductoResponsableactivoDao {

    public void InsertarProductoResponsableactivo(ProductoResponsableactivo ObjProductoResponsableactivos);

    public void EliminarProductoResponsableactivo(ProductoResponsableactivo ObjProductoResponsableactivos);

    public void ActualizarProductoResponsableactivo(ProductoResponsableactivo ObjProductoResponsableactivos);

    public ArrayList BuscarProductoResponsableactivo(String Consulta);

    public ArrayList LoadTablaProductoResponsableactivos();
}
