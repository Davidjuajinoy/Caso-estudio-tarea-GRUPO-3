package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ICategoriaDao;
import com.entities.Categoria;


@Service
public class CategoriaServices implements ICategoriaServices{

	@Autowired
	private ICategoriaDao categoriaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Categoria> findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id);
	}

}
