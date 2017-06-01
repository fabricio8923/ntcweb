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
import org.primefaces.omega.modelo.ProductoTiporelacion;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoTiporelacionControlador { 
    private List<ProductoTiporelacion> productotiporelacion = null;
    private ProductoTiporelacion selectedproductotiporelacion;
 
    private ProductoTiporelacionDao objProductoTiporelacionDao= new ProductoTiporelacionDaoImplements();

    public ProductoTiporelacionControlador() {
    }

    public List<ProductoTiporelacion> getProductotiporelacion() {
        return productotiporelacion;
    }

    public ProductoTiporelacion getSelectedproductotiporelacion() {
        return selectedproductotiporelacion;
    }

    public void setSelectedproductotiporelacion(ProductoTiporelacion selectedproductotiporelacion) {
        this.selectedproductotiporelacion = selectedproductotiporelacion;
    }
 
}
