/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity(name="ciudades")
@Data
public class mCiudad {
 
    @Id
    private Long ciudadid;
    private String ciudad;
    
}
