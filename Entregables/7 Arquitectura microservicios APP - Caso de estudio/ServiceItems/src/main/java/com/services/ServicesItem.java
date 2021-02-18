/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.models.Categoria;
import com.models.Items;
import com.models.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author David Juajinoy
 */
@Service
public class ServicesItem implements IServicesItem {

    @Autowired
    private RestTemplate clienteRest;
    public List<Items> findAll() {
    	System.out.println("Este **** no sirve por la url");
    
    	/*  	 
	List<Producto> productos=Arrays.asList(clienteRest.getForObject("http://localhost:53099/api/productos", Producto[].class));
	return productos.stream().map(p -> new Items(p, 1)).collect(Collectors.toList());\
	*/
    	
//    	Producto producto = clienteRest.getForObject("http://localhost:49795/api/productos/", Producto.class);
//    	String categoria_fk= producto.getCategoria_fk();
//    	Categoria categoria = clienteRest.getForObject("http://localhost:49802/api/categoria/{categoria_fk}", Categoria.class,categoria_fk );
    	
   
    	
//    	List<im>
		return null;
    
    }

    public List<Items> findById(Long id) {

	Categoria categoria = clienteRest.getForObject("http://localhost:51740/api/categoria/{id}", Categoria.class,id );
	List<Producto> arrayProductos=Arrays.asList(clienteRest.getForObject("http://localhost:51717/api/productos", Producto[].class));
	
	List<Producto> productosFull = new LinkedList<>();

	for (Producto producto : arrayProductos) {
		if (id ==producto.getCategoria_fk())  {
			productosFull.add(new Producto(producto.getId(),producto.getNombre(),producto.getPrecio(),producto.getCategoria_fk(),categoria)); 
		}
	}	
		
		return productosFull.stream().map(p -> new Items(p)).collect(Collectors.toList());
    }
    
}
