/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.models;

/**
 *
 * @author David Juajinoy
 */
public class Producto {

    private Long id;
    private String nombre;
    private Double precio;
    private Long categoria_fk;
    private Categoria categoria; 
    
    public Producto() {
		// TODO Auto-generated constructor stub
	}

    
    public Producto(Long id, String nombre, Double precio, Long categoria_fk ,Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria_fk = categoria_fk;
		this.categoria = categoria;
	}

	public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public Double getPrecio() {
	return precio;
    }

    public void setPrecio(Double precio) {
	this.precio = precio;
    }

	public Long getCategoria_fk() {
		return categoria_fk;
	}

	public void setCategoria_fk(Long categoria_fk) {
		this.categoria_fk = categoria_fk;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
    
    
    
}
