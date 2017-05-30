/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoModelo;

/**
 *
 * @author fabricio
 */
public interface ProductoModeloDao {

    public void InsertarProductoModelo(ProductoModelo ObjProductoModelos);

    public void EliminarProductoModelo(ProductoModelo ObjProductoModelos);

    public void ActualizarProductoModelo(ProductoModelo ObjProductoModelos);

    public ArrayList BuscarProductoModelo(String Consulta);

    public ArrayList LoadTablaProductoModelos();
}
