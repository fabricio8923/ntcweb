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
import org.primefaces.omega.modelo.ProductoAplicacion;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoAplicacionControlador { 
    private List< ProductoAplicacion>  productoaplicacion = null;
    private  ProductoAplicacion selectedproductoaplicacion;
  
    private  ProductoAplicacionDao objProductoAplicacionDao= new ProductoAplicacionDaoImplements();

    public ProductoAplicacionControlador() {
    }

    public List<ProductoAplicacion> getProductoaplicacion() {
        return productoaplicacion;
    }

    public ProductoAplicacion getSelectedproductoaplicacion() {
        return selectedproductoaplicacion;
    }

    public void setSelectedproductoaplicacion(ProductoAplicacion selectedproductoaplicacion) {
        this.selectedproductoaplicacion = selectedproductoaplicacion;
    }
   
   
}
