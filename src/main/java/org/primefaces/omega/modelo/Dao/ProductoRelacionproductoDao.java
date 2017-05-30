/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoRelacionproducto;

/**
 *
 * @author fabricio
 */
public interface ProductoRelacionproductoDao {

    public void InsertarProductoRelacionproducto(ProductoRelacionproducto ObjProductoRelacionproductos);

    public void EliminarProductoRelacionproducto(ProductoRelacionproducto ObjProductoRelacionproductos);

    public void ActualizarProductoRelacionproducto(ProductoRelacionproducto ObjProductoRelacionproductos);

    public ArrayList BuscarProductoRelacionproducto(String Consulta);

    public ArrayList LoadTablaProductoRelacionproductos();
}
