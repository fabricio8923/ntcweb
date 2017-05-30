/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoSerie;

/**
 *
 * @author fabricio
 */
public interface ProductoSerieDao {

    public void InsertarProductoSerie(ProductoSerie ObjProductoSeries);

    public void EliminarProductoSerie(ProductoSerie ObjProductoSeries);

    public void ActualizarProductoSerie(ProductoSerie ObjProductoSeries);

    public ArrayList BuscarProductoSerie(String Consulta);

    public ArrayList LoadTablaProductoSeries();
}
