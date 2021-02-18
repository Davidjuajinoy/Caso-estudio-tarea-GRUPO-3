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

    public Items(Categoria categoria,Producto producto) {
	this.categoria = categoria;
	this.producto = producto;
    }
    
    public Items(Producto producto) {
    	
    	this.producto = producto;
        }
    
    public Items(Categoria categoria) {
    	this.categoria = categoria;
        }

    public Items(Optional<Producto> producto) {
    	this.producto = producto.get();
    	
    }
    
    public Producto getProducto() {
	return producto;
    }

    public void setProducto(Producto producto) {
	this.producto = producto;
    }

	/*public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}*/

 
    
    
    
    
    
}
