/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;


import com.implementacion.ServicesItem;
import com.implementacion.ServicesItemFeign;
import com.models.Items;
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
@RequestMapping("/api/item")
public class ItemRestController {

    @Autowired
    private ServicesItem servicesItem;

    @GetMapping("")
    public List<Items> listar() {
	return servicesItem.findAll();
    }

    @GetMapping("/{id}/cantidad/{cantidad}")
    public Items detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
	return servicesItem.findById(id,cantidad);
    }

}
