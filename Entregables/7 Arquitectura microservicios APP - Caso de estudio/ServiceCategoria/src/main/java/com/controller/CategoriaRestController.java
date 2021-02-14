package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Categoria;
import com.services.ICategoriaServices;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaRestController {
	
	@Autowired
	private ICategoriaServices categoriaServices;
	
	 @GetMapping("")
    public List<Categoria> listar() {
    	System.out.println("Service Categorias");
    	System.out.println(" ");
	return categoriaServices.findAll();
    }
	    
    @GetMapping("/{id}")
    public Optional<Categoria> ver(@PathVariable Long id)
    {
	return categoriaServices.findById(id);
    }
}
