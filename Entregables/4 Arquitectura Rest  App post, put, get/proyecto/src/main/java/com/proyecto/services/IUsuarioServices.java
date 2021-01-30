package com.proyecto.services;

import java.util.List;

import com.proyecto.entities.Usuario;

public interface IUsuarioServices {
    public List<Usuario> findAll();
    public Usuario create(Usuario usuario);
}