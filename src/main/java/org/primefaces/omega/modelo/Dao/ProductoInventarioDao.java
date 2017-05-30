/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoInventario;

/**
 *
 * @author fabricio
 */
public interface ProductoInventarioDao {

    public void InsertarProductoInventario(ProductoInventario ObjProductoInventarios);

    public void EliminarProductoInventario(ProductoInventario ObjProductoInventarios);

    public void ActualizarProductoInventario(ProductoInventario ObjProductoInventarios);

    public ArrayList BuscarProductoInventario(String Consulta);

    public ArrayList LoadTablaProductoInventarios();
}
