/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoProducto;

/**
 *
 * @author fabricio
 */
public interface ProductoProductoDao {

    public void InsertarProductoProducto(ProductoProducto ObjProductoProductos);

    public void EliminarProductoProducto(ProductoProducto ObjProductoProductos);

    public void ActualizarProductoProducto(ProductoProducto ObjProductoProductos);

    public ArrayList BuscarProductoProducto(String Consulta);

    public ArrayList LoadTablaProductoProductos();
}
