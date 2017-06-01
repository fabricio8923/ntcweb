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
import org.primefaces.omega.modelo.Dao.Implements.ProductoCategoriaDaoImplements;
import org.primefaces.omega.modelo.ProductoCategoria;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class ProductoCategoriaControlador { 
    private List<ProductoCategoria> productocategoria = null;
    private ProductoCategoria selectedproductocategoria;

    private ProductoCategoriaDao objProductoCategoriaDao= new ProductoCategoriaDaoImplements();

    public ProductoCategoriaControlador() {
    }

    public List<ProductoCategoria> getProductocategoria() {
        return productocategoria = objProductoCategoriaDao.LoadTablaProductoCategorias();
    }

    public ProductoCategoria getSelectedproductocategoria() {
        return selectedproductocategoria;
    }

    public void setSelectedproductocategoria(ProductoCategoria selectedproductocategoria) {
        this.selectedproductocategoria = selectedproductocategoria;
    }
    public void InsertarProductoCategoria(){
    objProductoCategoriaDao.InsertarProductoCategoria(selectedproductocategoria);
    }
    public void ActualizarProductoCategoria(){
    objProductoCategoriaDao.ActualizarProductoCategoria(selectedproductocategoria);
    }
    public void EliminarProductoCategoria(){
    objProductoCategoriaDao.EliminarProductoCategoria(selectedproductocategoria);
    }
 
}
