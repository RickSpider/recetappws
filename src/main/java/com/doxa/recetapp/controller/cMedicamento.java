/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mMedicamento;
import com.doxa.recetapp.repository.rMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
//@RequestMapping("/medicamento")
public class cMedicamento {
    
    @Autowired
    private rMedicamento rmedicamento;
    
    @GetMapping(value = "/medicamentos",produces ="application/json")
    public Iterable<mMedicamento> getMedicamento(){
    
        return rmedicamento.findAll();
        
    }
    
}
