/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mTitulo;
import com.doxa.recetapp.repository.rTitulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
@RequestMapping("/titulo")
public class cTitulo {
    
    @Autowired
    private rTitulo rtitulo;
    
    @GetMapping(produces ="application/json")
    public Iterable<mTitulo> getTitulo(){
    
        return rtitulo.findAll();
        
    }
    
}
