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
import org.primefaces.omega.modelo.Dao.Implements.ProductoMarcaDaoImplements;
import org.primefaces.omega.modelo.ProductoMarca;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoMarcaControlador { 
    private List<ProductoMarca> productomarca = null;
    private ProductoMarca selectedproductomarca;
 
    private ProductoMarcaDao objProductoMarcaDao= new ProductoMarcaDaoImplements();

    public ProductoMarcaControlador() {
    }

    public List<ProductoMarca> getProductomarca() {
        return productomarca = objProductoMarcaDao.LoadTablaProductoMarcas();
    }

    public ProductoMarca getSelectedproductomarca() {
        return selectedproductomarca;
    }

    public void setSelectedproductomarca(ProductoMarca selectedproductomarca) {
        this.selectedproductomarca = selectedproductomarca;
    }
    public void InsertarProductoMarca(){
    objProductoMarcaDao.InsertarProductoMarca(selectedproductomarca);
    }
    public void ActualizarProductoMarca(){
    objProductoMarcaDao.ActualizarProductoMarca(selectedproductomarca);
    }
    public void EliminarProductoMarca(){
    objProductoMarcaDao.EliminarProductoMarca(selectedproductomarca);
    }

   
}
