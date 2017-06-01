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
import org.primefaces.omega.modelo.Dao.Implements.ProductoTipoatributoDaoImplements;
import org.primefaces.omega.modelo.ProductoTipoatributo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoTipoatributoControlador { 
    private List<ProductoTipoatributo> productotipoatributo = null;
    private ProductoTipoatributo selectedproductotipoatributo;

    private ProductoTipoatributoDao objProductoTipoatributoDao= new ProductoTipoatributoDaoImplements();

    public ProductoTipoatributoControlador() {
    }

    public List<ProductoTipoatributo> getProductotipoatributo() {
        return productotipoatributo = objProductoTipoatributoDao.LoadTablaProductoTipoatributos();
    }

    public ProductoTipoatributo getSelectedproductotipoatributo() {
        return selectedproductotipoatributo;
    }

    public void setSelectedproductotipoatributo(ProductoTipoatributo selectedproductotipoatributo) {
        this.selectedproductotipoatributo = selectedproductotipoatributo;
    }
    public void InsertarProductoTipoatributo(){
    objProductoTipoatributoDao.InsertarProductoTipoatributo(selectedproductotipoatributo);
    }
    public void ActualizarProductoTipoatributo(){
    objProductoTipoatributoDao.ActualizarProductoTipoatributo(selectedproductotipoatributo);
    }
    public void EliminarProductoTipoatributo(){
    objProductoTipoatributoDao.EliminarProductoTipoatributo(selectedproductotipoatributo);
    }
  
}
