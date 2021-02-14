package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.entities.Categoria;

public interface ICategoriaDao  extends CrudRepository<Categoria, Long>{

}
