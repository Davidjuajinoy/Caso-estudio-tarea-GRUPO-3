/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.clientes.ProductoClienteRest;
import com.models.Items;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author David Juajinoy
 */
@Service
@Primary
public class ServicesItemFeign implements IServicesItem {

    @Autowired
    private ProductoClienteRest clienteFeing;
    
    public List<Items> findAll() {
    System.out.println("llega hasta aca");
	//return clienteFeing.listar().stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
    	return null;
    }

    public List<Items> findById(Long id) {
    	System.out.println("aqui");	
    	return null;
    }

}
