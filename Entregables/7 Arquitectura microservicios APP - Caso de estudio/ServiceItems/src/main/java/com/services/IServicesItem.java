/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.models.Categoria;
import com.models.Items;
import java.util.List;

/**
 *
 * @author David Juajinoy
 */
public interface IServicesItem {

    public List<Items> findAll();
    
    public Items findById(Long id);
}
