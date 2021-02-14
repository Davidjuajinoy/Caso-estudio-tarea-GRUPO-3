/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author David Juajinoy
 */

@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCTO_PK", nullable = false)
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    @Column(name = "PRECIO", nullable = false)
    private Double precio;
    
    
    @Column(name = "Categoria_fk")
    private Long categoria_fk;
    

    public Producto() {
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

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categoria_fk=" + categoria_fk
				+ "]";
	}


    
    

}