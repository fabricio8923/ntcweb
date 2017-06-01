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
import org.primefaces.omega.modelo.Dao.Implements.ProductoResponsableactivoDaoImplements;
import org.primefaces.omega.modelo.ProductoResponsableactivo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoResponsableactivoControlador { 
    private List<ProductoResponsableactivo> productoresponsableactivo = null;
    private ProductoResponsableactivo selectedproductoresponsableactivo;

    private ProductoResponsableactivoDao objProductoResponsableactivoDao= new ProductoResponsableactivoDaoImplements();

    public ProductoResponsableactivoControlador() {
    }

    public List<ProductoResponsableactivo> getProductoresponsableactivo() {
        return productoresponsableactivo;
    }

    public ProductoResponsableactivo getSelectedproductoresponsableactivo() {
        return selectedproductoresponsableactivo;
    }

    public void setSelectedproductoresponsableactivo(ProductoResponsableactivo selectedproductoresponsableactivo) {
        this.selectedproductoresponsableactivo = selectedproductoresponsableactivo;
    }
  
}
