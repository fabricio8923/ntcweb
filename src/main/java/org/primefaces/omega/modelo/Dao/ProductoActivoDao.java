/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoActivo;

/**
 *
 * @author fabricio
 */
public interface ProductoActivoDao {

    public void InsertarProductoActivo(ProductoActivo ObjProductoActivos);

    public void EliminarProductoActivo(ProductoActivo ObjProductoActivos);

    public void ActualizarProductoActivo(ProductoActivo ObjProductoActivos);

    public ArrayList BuscarProductoActivo(String Consulta);

    public ArrayList LoadTablaProductoActivos();
}
