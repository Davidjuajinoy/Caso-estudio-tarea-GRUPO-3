/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.api.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author David Juajinoy
 */


@Entity
@Table( name = "ROL" )

public class Rol  implements Serializable {
    
    private static final long serialVersionUID = -6362794385792247263L;
    private int id;
    private String descripcion;
    private String siglaRol;
    private boolean estada;

}
