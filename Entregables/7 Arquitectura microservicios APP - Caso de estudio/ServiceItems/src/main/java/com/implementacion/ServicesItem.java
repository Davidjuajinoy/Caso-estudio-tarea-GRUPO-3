/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.implementacion;

import com.models.Items;
import com.models.Producto;
import com.services.IServicesItem;
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
	List<Producto> productos=Arrays.asList(clienteRest.getForObject("http://localhost:8084/api/productos", Producto[].class));
	return productos.stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
    }

    public Items findById(Long id, Integer cantidad) {
	Map<String, String> pathVariables = new HashMap<String, String>();
	pathVariables.put("id",id.toString());
	Producto producto = clienteRest.getForObject("http://localhost:8084/api/productos/{id}", Producto.class, pathVariables);
	return new Items(producto, cantidad);
    }
    
}
