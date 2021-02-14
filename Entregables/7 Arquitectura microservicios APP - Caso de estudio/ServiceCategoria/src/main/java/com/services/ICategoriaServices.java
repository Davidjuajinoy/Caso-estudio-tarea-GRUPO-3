package com.services;

import java.util.List;
import java.util.Optional;

import com.entities.Categoria;



public interface ICategoriaServices {

    public List<Categoria> findAll();

    public Optional<Categoria> findById(Long id);
}
