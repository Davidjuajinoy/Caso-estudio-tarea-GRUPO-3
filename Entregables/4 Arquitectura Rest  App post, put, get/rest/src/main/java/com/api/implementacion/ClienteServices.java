/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.api.implementacion;

import com.api.dao.IUsuarioDao;
import com.api.entities.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author David Juajinoy
 */

@Service
public class ClienteServices implements IUsuarioServices {

    @Autowired
    private IUsuarioDao clienteDao;

    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
	return (List<Usuario>) clienteDao.findAll();
    }

    @Transactional(readOnly = true)
    public Usuario create(Usuario usuario) {
	System.out.println(usuario.getDependencia());
	return clienteDao.save(usuario);
    }
    
    

}
