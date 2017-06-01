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
import org.primefaces.omega.modelo.ProductoTipoproducto;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoTipoproductoControlador { 
    private List<ProductoTipoproducto> productotipoproducto = null;
    private ProductoTipoproducto selectedproductotipoproducto;
 
    private ProductoTipoproductoDao objProductoTipoproductoDao= new ProductoTipoproductoDaoImplements();

    public ProductoTipoproductoControlador() {
    }

    public List<ProductoTipoproducto> getProductotipoproducto() {
        return productotipoproducto;
    }

    public ProductoTipoproducto getSelectedproductotipoproducto() {
        return selectedproductotipoproducto;
    }

    public void setSelectedproductotipoproducto(ProductoTipoproducto selectedproductotipoproducto) {
        this.selectedproductotipoproducto = selectedproductotipoproducto;
    }
 
}
