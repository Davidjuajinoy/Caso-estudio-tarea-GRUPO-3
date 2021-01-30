/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.api.entities;



/**
 *
 * @author David Juajinoy
 */

public class Dependencia {
    private int id;
    private String codigo;
    private String descripcion;
    private String cargo;
    private boolean estado;

    public Dependencia() {
    }

    public Dependencia(int id, String codigo, String descripcion, String cargo, boolean estado) {
	this.id = id;
	this.codigo = codigo;
	this.descripcion = descripcion;
	this.cargo = cargo;
	this.estado = estado;
    }

    
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getCodigo() {
	return codigo;
    }

    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public String getCargo() {
	return cargo;
    }

    public void setCargo(String cargo) {
	this.cargo = cargo;
    }

    public boolean getEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }

    @Override
    public String toString() {
	return "Dependencia{" + "id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", cargo=" + cargo + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
    
    
}
