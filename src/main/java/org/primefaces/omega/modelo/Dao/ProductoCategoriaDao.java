/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoCategoria;

/**
 *
 * @author fabricio
 */
public interface ProductoCategoriaDao {

    public void InsertarProductoCategoria(ProductoCategoria ObjProductoCategorias);

    public void EliminarProductoCategoria(ProductoCategoria ObjProductoCategorias);

    public void ActualizarProductoCategoria(ProductoCategoria ObjProductoCategorias);

    public ArrayList BuscarProductoCategoria(String Consulta);

    public ArrayList LoadTablaProductoCategorias();
}
