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
import org.primefaces.omega.modelo.Dao.Implements.ProductoModeloDaoImplements;
import org.primefaces.omega.modelo.ProductoModelo;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoModeloControlador { 
    private List<ProductoModelo> productomodelo = null;
    private ProductoModelo selectedproductomodelo;

    private ProductoModeloDao objProductoModeloDao= new ProductoModeloDaoImplements();

    public ProductoModeloControlador() {
    }

    public List<ProductoModelo> getProductomodelo() {
        return productomodelo = objProductoModeloDao.LoadTablaProductoModelos();
    }

    public ProductoModelo getSelectedproductomodelo() {
        return selectedproductomodelo;
    }

    public void setSelectedproductomodelo(ProductoModelo selectedproductomodelo) {
        this.selectedproductomodelo = selectedproductomodelo;
    }
    public void InsertarProductoModelo(){
    objProductoModeloDao.InsertarProductoModelo(selectedproductomodelo);
    }
    public void ActualizarProductoModelo(){
    objProductoModeloDao.ActualizarProductoModelo(selectedproductomodelo);
    }
    public void EliminarProductoModelo(){
    objProductoModeloDao.EliminarProductoModelo(selectedproductomodelo);
    }
}
