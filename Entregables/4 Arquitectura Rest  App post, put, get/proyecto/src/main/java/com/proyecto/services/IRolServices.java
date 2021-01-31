package com.proyecto.services;


import java.util.List;

import com.proyecto.entities.Rol;

public interface IRolServices {

	public List<Rol> findAll();
	public Rol create(Rol rol);
	public Rol update(Rol rol);
	
}
