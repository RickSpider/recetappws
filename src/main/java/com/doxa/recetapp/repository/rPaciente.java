/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.repository;

import com.doxa.recetapp.model.mPaciente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BlackSpider
 */
public interface rPaciente extends CrudRepository <mPaciente, Long> {
   
    
}
