/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.entities.Producto;
import com.services.IProductoServices;
import java.util.List;
import java.util.Optional;
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
@RequestMapping("/api/productos")
public class ProductosRestController {

    @Autowired
    private IProductoServices productoService;

    @GetMapping("")
    public List<Producto> listar() {
	return productoService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Producto> ver(@PathVariable Long id)
    {
	return productoService.findById(id);
    }
    
}
