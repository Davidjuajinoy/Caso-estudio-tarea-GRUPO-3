/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.models;

import java.util.Optional;


/**
 *
 * @author David Juajinoy
 */
public class Items {

    private Producto producto;
    
    private Categoria categoria;

    public Items() {
    }

    public Items(Producto producto, Categoria categoria) {
	this.producto = producto;
	this.categoria = categoria;
    }
    
    public Items(Optional<Producto> producto) {
    	this.producto = producto.get();
    	
    }
    
    /*public Items(Producto producto, Integer categoria) {
    	this.producto = producto;
    	this.categoria = categoria;
    }
    
    public Items(Optional<Producto> ver, Integer categoria)
    {
	this.producto= ver.get();
	this.categoria=categoria;
    }
*/
    public Producto getProducto() {
	return producto;
    }

    public void setProducto(Producto producto) {
	this.producto = producto;
    }

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

 
    
    
    
    
    
}
