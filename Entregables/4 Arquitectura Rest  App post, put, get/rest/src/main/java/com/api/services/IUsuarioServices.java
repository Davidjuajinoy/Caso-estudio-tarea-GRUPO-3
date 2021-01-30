/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.api.services;

import com.api.entities.Usuario;
import java.util.List;

/**
 *
 * @author David Juajinoy
 */
public interface IUsuarioServices {
    public List<Usuario> findAll();
    
    public Usuario create(Usuario usuario);
}
