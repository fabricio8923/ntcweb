/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.modelo.Dao;

import java.util.ArrayList;
import org.primefaces.omega.modelo.ProductoTiporelacion;

/**
 *
 * @author fabricio
 */
public interface ProductoTiporelacionDao {

    public void InsertarProductoTiporelacion(ProductoTiporelacion ObjProductoTiporelaciones);

    public void EliminarProductoTiporelacion(ProductoTiporelacion ObjProductoTiporelaciones);

    public void ActualizarProductoTiporelacion(ProductoTiporelacion ObjProductoTiporelaciones);

    public ArrayList BuscarProductoTiporelacion(String Consulta);

    public ArrayList LoadTablaProductoTiporelaciones();
}
