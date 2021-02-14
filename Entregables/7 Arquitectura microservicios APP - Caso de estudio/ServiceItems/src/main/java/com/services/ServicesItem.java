/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.models.Categoria;
import com.models.Items;
import com.models.Producto;

import java.util.Arrays;
import java.util.HashMap;
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
	return productos.stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
	*/
		return null;
    
    }

    public Items findById(Long id) {
	Map<String, String> pathVariables = new HashMap<String, String>();
	pathVariables.put("id",id.toString());
	Producto producto = clienteRest.getForObject("http://localhost:53099/api/productos/{id}", Producto.class, pathVariables);
	String categoria_fk= producto.getCategoria_fk();
	Categoria categoria = clienteRest.getForObject("http://localhost:52949/api/categoria/{categoria_fk}", Categoria.class,categoria_fk );
	return new Items(producto, categoria);
    }
    
}
