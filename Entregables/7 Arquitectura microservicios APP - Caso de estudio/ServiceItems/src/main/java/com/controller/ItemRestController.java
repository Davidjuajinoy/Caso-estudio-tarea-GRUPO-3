/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;



import com.models.Items;
import com.services.IServicesItem;
import com.services.ServicesItem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author David Juajinoy
 */
@RestController
@RequestMapping("/api/catalogo")
public class ItemRestController {

    @Autowired
    private ServicesItem servicesItem;

    @GetMapping("")
    public List<Items> listar() {
    	System.out.println("XdDDD");
    	return servicesItem.findAll();
    }

    @GetMapping("/categoria/{id}")
    public List<Items> detalle(@PathVariable Long id) {
	return servicesItem.findById(id);
    }

}
