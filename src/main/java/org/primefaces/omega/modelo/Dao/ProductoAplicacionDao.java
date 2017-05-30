/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoAplicacion;

/**
 *
 * @author fabricio
 */
public interface ProductoAplicacionDao {

    public void InsertarProductoAplicacion(ProductoAplicacion ObjProductoAplicaciones);

    public void EliminarProductoAplicacion(ProductoAplicacion ObjProductoAplicaciones);

    public void ActualizarProductoAplicacion(ProductoAplicacion ObjProductoAplicaciones);

    public ArrayList BuscarProductoAplicacion(String Consulta);

    public ArrayList LoadTablaProductoAplicaciones();
}
