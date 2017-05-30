/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoTipoproducto;

/**
 *
 * @author fabricio
 */
public interface ProductoTipoproductoDao {

    public void InsertarProductoTipoproducto(ProductoTipoproducto ObjProductoTipoproductos);

    public void EliminarProductoTipoproducto(ProductoTipoproducto ObjProductoTipoproductos);

    public void ActualizarProductoTipoproducto(ProductoTipoproducto ObjProductoTipoproductos);

    public ArrayList BuscarProductoTipoproducto(String Consulta);

    public ArrayList LoadTablaProductoTipoproductos();
}
