/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao;

import com.entities.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author David Juajinoy
 */
public interface IProductoDao extends CrudRepository<Producto,Long>{
    

}
