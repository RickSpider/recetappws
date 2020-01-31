/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.repository.rMedico;
import java.util.Optional;
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
@RequestMapping("/medico")
public class cMedicos {
    
    @Autowired 
    private rMedico rmedico;
    
    @GetMapping("/{id}")
    public @ResponseBody Optional<mMedico> getOneMedico(@PathVariable Long id){
        
        return rmedico.findById(id);

    }
    
  
    
}
