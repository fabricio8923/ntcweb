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
import org.primefaces.omega.modelo.Dao.Implements.ProductoRelacionproductoDaoImplements;
import org.primefaces.omega.modelo.ProductoRelacionproducto;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoRelacionproductoControlador { 
    private List< ProductoRelacionproducto>  productorelacionproducto = null;
    private  ProductoRelacionproducto selectedproductorelacionproducto;
 
    private  ProductoRelacionproductoDao objProductoRelacionproductoDao= new ProductoRelacionproductoDaoImplements();

    public ProductoRelacionproductoControlador() {
    }

    public List<ProductoRelacionproducto> getProductorelacionproducto() {
        return productorelacionproducto;
    }

    public ProductoRelacionproducto getSelectedproductorelacionproducto() {
        return selectedproductorelacionproducto;
    }

    public void setSelectedproductorelacionproducto(ProductoRelacionproducto selectedproductorelacionproducto) {
        this.selectedproductorelacionproducto = selectedproductorelacionproducto;
    }
 
}
