package com.proyecto.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "DEPENDENCIA")

public class Dependencia  implements Serializable {


    private static final long serialVersionUID = 22L;
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

    @Id 
    @GeneratedValue( strategy = GenerationType.IDENTITY ) 
    @Column( name = "ID_DEPENDENCIA", nullable = false ) 
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @Column(name = "CODIGO")
    public String getCodigo() {
	return codigo;
    }

    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }

    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }
    
    @Column(name = "CARGO")
    public String getCargo() {
	return cargo;
    }

    public void setCargo(String cargo) {
	this.cargo = cargo;
    }

    @Column(name = "ESTADO")
    public boolean isEstado() {
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
