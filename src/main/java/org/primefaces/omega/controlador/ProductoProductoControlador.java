/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.primefaces.omega.controlador;

import org.primefaces.omega.modelo.Dao.*;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import org.primefaces.omega.modelo.Dao.Implements.ProductoProductoDaoImplements;
import org.primefaces.omega.modelo.ProductoProducto;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoProductoControlador { 
    private List<ProductoProducto> productoproducto = null;
    private ProductoProducto selectedproductoproducto;
  
    private ProductoProductoDao objProductoProductoDao= new ProductoProductoDaoImplements();

    public ProductoProductoControlador() {
    }

    public List<ProductoProducto> getProductoproducto() {
        return productoproducto = objProductoProductoDao.LoadTablaProductoProductos();
    }

    public ProductoProducto getSelectedproductoproducto() {
        return selectedproductoproducto;
    }

    public void setSelectedproductoproducto(ProductoProducto selectedproductoproducto) {
        this.selectedproductoproducto = selectedproductoproducto;
    }
    public void InsertarProductoProducto(){
    objProductoProductoDao.InsertarProductoProducto(selectedproductoproducto);
    }
    public void ActualizarProductoProducto(){
    objProductoProductoDao.ActualizarProductoProducto(selectedproductoproducto);
    }
    public void EliminarProductoProducto(){
    objProductoProductoDao.EliminarProductoProducto(selectedproductoproducto);
    }
}
