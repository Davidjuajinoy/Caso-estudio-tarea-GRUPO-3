package com.proyecto.controller;

import com.proyecto.entities.Dependencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.services.IDependenciaServices;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class DependenciaRestController {
    @Autowired
    private IDependenciaServices dependenciaService;

    @GetMapping("/dependencia")
    public List<Dependencia> index() {
	return dependenciaService.findAll();
    }

    @PostMapping("/dependencia")
    public Dependencia create(@RequestBody Dependencia dependencia) {
	return dependenciaService.create(dependencia);
    }
    
    @PutMapping("/dependencia")
    public Dependencia update(@RequestBody Dependencia dependencia) {
    	return dependenciaService.update(dependencia);
    }
    
    
}


