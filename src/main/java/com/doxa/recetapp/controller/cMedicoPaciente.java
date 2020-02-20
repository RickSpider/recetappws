/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mMedicoPaciente;
import com.doxa.recetapp.repository.rMedicoPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
@RequestMapping("/medicopaciente")
public class cMedicoPaciente {
    
    @Autowired
    private rMedicoPaciente rmedicopaciente;
    
    @GetMapping("/{id}")
    public @ResponseBody Iterable<mMedicoPaciente> getPacientesxMedicos(@PathVariable Long id){
        
        return rmedicopaciente.findBymedicoid(id);

    }
    
    
}
