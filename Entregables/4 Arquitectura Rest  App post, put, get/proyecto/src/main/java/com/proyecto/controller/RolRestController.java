package com.proyecto.controller;

import com.proyecto.entities.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.services.IRolServices;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class RolRestController {
    @Autowired
    private IRolServices rolService;

    @GetMapping("/rol")
    public List<Rol> index() {
	return rolService.findAll();
    }

    @PostMapping("/rol")
    public Rol create(@RequestBody Rol rol) {
    	return rolService.create(rol);
    }
    
    @PutMapping("/rol")
    public Rol update(@RequestBody Rol rol) {
    	return rolService.update(rol);
    }
    
    
}


