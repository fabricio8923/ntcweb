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
import org.primefaces.omega.modelo.Dao.Implements.ProductoAtributoDaoImplements;
import org.primefaces.omega.modelo.ProductoAtributo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoAtributoControlador { 
    private List<ProductoAtributo> productoatributo = null;
    private ProductoAtributo selectedproductoatributo;
 
    private ProductoAtributoDao objProductoAtributoDao= new ProductoAtributoDaoImplements();

    public ProductoAtributoControlador() {
    }

    public List<ProductoAtributo> getProductoatributo() {
        return productoatributo;
    }

    public ProductoAtributo getSelectedproductoatributo() {
        return selectedproductoatributo;
    }

    public void setSelectedproductoatributo(ProductoAtributo selectedproductoatributo) {
        this.selectedproductoatributo = selectedproductoatributo;
    }
    

}
