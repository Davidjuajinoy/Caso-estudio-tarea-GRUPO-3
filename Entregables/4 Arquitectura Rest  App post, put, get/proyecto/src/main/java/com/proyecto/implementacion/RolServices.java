/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto.implementacion;

import com.proyecto.dao.IRolDao;
import com.proyecto.entities.Rol;
import com.proyecto.services.IRolServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author David Juajinoy
 */
@Service
public class RolServices implements IRolServices {

    @Autowired
    private IRolDao rolDao;

    @Transactional(readOnly = true)
    public List<Rol> findAll() {
	return (List<Rol>) rolDao.findAll();
    }

    @Transactional(readOnly = false)
    public Rol create(Rol rol) {
	return rolDao.save(rol);
    }

    @Transactional(readOnly = false)
    public Rol update(Rol rol) {
	return rolDao.save(rol);
    }

}
