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
import org.primefaces.omega.modelo.Dao.Implements.ProductoInventarioDaoImplements;
import org.primefaces.omega.modelo.ProductoInventario;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoInventarioControlador { 
    private List<ProductoInventario> productoinventario = null;
    private ProductoInventario selectedproductoinventario;
   
    private ProductoInventarioDao objProductoInventarioDao= new ProductoInventarioDaoImplements();

    public ProductoInventarioControlador() {
    }

    public List<ProductoInventario> getProductoinventario() {
        return productoinventario = objProductoInventarioDao.LoadTablaProductoInventarios();
    }

    public ProductoInventario getSelectedproductoinventario() {
        return selectedproductoinventario;
    }

    public void setSelectedproductoinventario(ProductoInventario selectedproductoinventario) {
        this.selectedproductoinventario = selectedproductoinventario;
    }
    public void InsertarProductoInventario(){
    objProductoInventarioDao.InsertarProductoInventario(selectedproductoinventario);
    }
    public void ActualizarProductoInventario(){
    objProductoInventarioDao.ActualizarProductoInventario(selectedproductoinventario);
    }
    public void EliminarProductoInventario(){
    objProductoInventarioDao.EliminarProductoInventario(selectedproductoinventario);
    }
  
}
