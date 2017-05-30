/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoTipoatributo;

/**
 *
 * @author fabricio
 */
public interface ProductoTipoatributoDao {

    public void InsertarProductoTipoatributo(ProductoTipoatributo ObjProductoTipoatributos);

    public void EliminarProductoTipoatributo(ProductoTipoatributo ObjProductoTipoatributos);

    public void ActualizarProductoTipoatributo(ProductoTipoatributo ObjProductoTipoatributos);

    public ArrayList BuscarProductoTipoatributo(String Consulta);

    public ArrayList LoadTablaProductoTipoatributos();
}
