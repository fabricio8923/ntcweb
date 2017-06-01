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
import org.primefaces.omega.modelo.Dao.Implements.ProductoSerieDaoImplements;
import org.primefaces.omega.modelo.ProductoSerie;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoSerieControlador { 
    private List<ProductoSerie> productoserie = null;
    private ProductoSerie selectedproductoserie;

    private ProductoSerieDao objProductoSerieDao= new ProductoSerieDaoImplements();

    public ProductoSerieControlador() {
    }

    public List<ProductoSerie> getProductoserie() {
        return productoserie;
    }

    public ProductoSerie getSelectedproductoserie() {
        return selectedproductoserie;
    }

    public void setSelectedproductoserie(ProductoSerie selectedproductoserie) {
        this.selectedproductoserie = selectedproductoserie;
    }
   
}
