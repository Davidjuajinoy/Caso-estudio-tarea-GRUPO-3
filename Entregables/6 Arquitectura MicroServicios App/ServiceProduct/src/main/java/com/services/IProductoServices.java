/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.entities.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author David Juajinoy
 */
public interface IProductoServices {
    public List<Producto> findAll();

    public Optional<Producto> findById(Long id);

    
}
