/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.dao.IProductoDao;
import com.entities.Producto;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author David Juajinoy
 */
@Service
public class ProductoServices implements IProductoServices {

    @Autowired
    private IProductoDao productoDao;

    @Transactional(readOnly = true)
    public List<Producto> findAll() {
	return (List<Producto>) productoDao.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Producto> findById(Long id) {
	return productoDao.findById(id);
    }

	

  
}
