/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.clientes;

import com.models.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author David Juajinoy
 */
@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {

	@GetMapping("")
	public List<Producto> listar();
	
	@GetMapping("/{id}")
	public Optional<Producto> ver(@PathVariable Long id);
}
