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
import org.primefaces.omega.modelo.ProductoActivo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoActivoControlador { 
    private List<ProductoActivo> productoactivo = null;
    private ProductoActivo selectedproductoactivo;
 
    private ProductoActivoDao objProductoActivoDao= new ProductoActivoDaoImplements();

    public ProductoActivoControlador() {
    }

    public List<ProductoActivo> getProductoactivo() {
        return productoactivo;
    }

    public ProductoActivo getSelectedproductoactivo() {
        return selectedproductoactivo;
    }

    public void setSelectedproductoactivo(ProductoActivo selectedproductoactivo) {
        this.selectedproductoactivo = selectedproductoactivo;
    }
   

    
}
