package com.proyecto.dao;

import org.springframework.data.repository.CrudRepository;
import com.proyecto.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
}
