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
    private String categoria_fk;

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

	public String getCategoria_fk() {
		return categoria_fk;
	}

	public void setCategoria_fk(String categoria_fk) {
		this.categoria_fk = categoria_fk;
	}
    
    
    
    
}
