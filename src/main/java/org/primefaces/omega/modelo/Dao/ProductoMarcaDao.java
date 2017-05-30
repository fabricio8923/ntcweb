/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoMarca;

/**
 *
 * @author fabricio
 */
public interface ProductoMarcaDao {

    public void InsertarProductoMarca(ProductoMarca ObjProductoMarcas);

    public void EliminarProductoMarca(ProductoMarca ObjProductoMarcas);

    public void ActualizarProductoMarca(ProductoMarca ObjProductoMarcas);

    public ArrayList BuscarProductoMarca(String Consulta);

    public ArrayList LoadTablaProductoMarcas();
}
