/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.proyecto.services;

import com.proyecto.entities.Dependencia;
import java.util.List;

/**
 *
 * @author David Juajinoy
 */
public interface IDependenciaServices {

    
	public List<Dependencia> findAll();
	public Dependencia create(Dependencia dependencia);
	public Dependencia update(Dependencia dependencia);
}
