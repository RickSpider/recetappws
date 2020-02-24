/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mCiudad;
import com.doxa.recetapp.repository.rCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
@RequestMapping("/ciudad")
public class cCiudad {
    
    @Autowired
    private rCiudad rciudad;
    
    @GetMapping(produces ="application/json")
    private Iterable<mCiudad> getCiudad(){
    
        return rciudad.findAll();
        
    }
    
}
