package com.proyecto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.entities.Usuario;
import com.proyecto.services.IUsuarioServices;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioServices usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> index() {
	return usuarioService.findAll();
    }

    @PostMapping("/usuarios")
    public Usuario create(@RequestBody Usuario usuario) {
	return usuarioService.create(usuario);
    }
    
    @PutMapping("/usuarios")
    public Usuario update(@RequestBody Usuario usuario) {
    	return usuarioService.update(usuario);
    }
    
    
}


