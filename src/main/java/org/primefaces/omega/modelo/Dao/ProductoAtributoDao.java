/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoAtributo;

/**
 *
 * @author fabricio
 */
public interface ProductoAtributoDao {

    public void InsertarProductoAtributo(ProductoAtributo ObjProductoAtributos);

    public void EliminarProductoAtributo(ProductoAtributo ObjProductoAtributos);

    public void ActualizarProductoAtributo(ProductoAtributo ObjProductoAtributos);

    public ArrayList BuscarProductoAtributo(String Consulta);

    public ArrayList LoadTablaProductoAtributos();
}
