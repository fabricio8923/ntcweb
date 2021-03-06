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
import org.primefaces.omega.modelo.Dao.Implements.ProductoProductoatributoDaoImplements;
import org.primefaces.omega.modelo.ProductoProductoatributo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoProductoatributoControlador { 
    private List<ProductoProductoatributo> productoproductoatributo = null;
    private ProductoProductoatributo selectedproductoproductoatributo;

    private ProductoProductoatributoDao objProductoProductoatributoDao= new ProductoProductoatributoDaoImplements();

    public ProductoProductoatributoControlador() {
    }

    public List<ProductoProductoatributo> getProductoproductoatributo() {
        return productoproductoatributo = objProductoProductoatributoDao.LoadTablaProductoProductoatributos();
    }

    public ProductoProductoatributo getSelectedproductoproductoatributo() {
        return selectedproductoproductoatributo;
    }

    public void setSelectedproductoproductoatributo(ProductoProductoatributo selectedproductoproductoatributo) {
        this.selectedproductoproductoatributo = selectedproductoproductoatributo;
    }
    public void InsertarProductoProductoatributo(){
    objProductoProductoatributoDao.InsertarProductoProductoatributo(selectedproductoproductoatributo);
    }
    public void ActualizarProductoProductoatributo(){
    objProductoProductoatributoDao.ActualizarProductoProductoatributo(selectedproductoproductoatributo);
    }
    public void EliminarProductoProductoatributo(){
    objProductoProductoatributoDao.EliminarProductoProductoatributo(selectedproductoproductoatributo);
    }
}
