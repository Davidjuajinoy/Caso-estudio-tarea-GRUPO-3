/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto.implementacion;

import com.proyecto.dao.IDependenciaDao;
import com.proyecto.entities.Dependencia;
import com.proyecto.services.IDependenciaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author David Juajinoy
 */
@Service
public class DependenciaServices implements IDependenciaServices {
    @Autowired
    private IDependenciaDao dependenciaDao;

    @Transactional(readOnly = true)
    public List<Dependencia> findAll() {
	return (List<Dependencia>) dependenciaDao.findAll();
    }

    @Transactional(readOnly = false)
    public Dependencia create(Dependencia dependencia) {
	System.out.println(dependencia.getDescripcion());
	return dependenciaDao.save(dependencia);
    }

    @Transactional(readOnly = false)
    public Dependencia update(Dependencia dependencia) {
	return dependenciaDao.save(dependencia);
    }

}
