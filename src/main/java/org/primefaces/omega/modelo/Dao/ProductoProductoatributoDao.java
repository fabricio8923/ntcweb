/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoProductoatributo;

/**
 *
 * @author fabricio
 */
public interface ProductoProductoatributoDao {

    public void InsertarProductoProductoatributo(ProductoProductoatributo ObjProductoProductoatributos);

    public void EliminarProductoProductoatributo(ProductoProductoatributo ObjProductoProductoatributos);

    public void ActualizarProductoProductoatributo(ProductoProductoatributo ObjProductoProductoatributos);

    public ArrayList BuscarProductoProductoatributo(String Consulta);

    public ArrayList LoadTablaProductoProductoatributos();
}
