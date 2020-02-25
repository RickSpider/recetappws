/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.model.mPersona;
import com.doxa.recetapp.repository.rMedico;
import com.doxa.recetapp.repository.rPersona;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
//@RequestMapping("/medico")
public class cMedicos {
    
    @Autowired 
    private rMedico rmedico;
    
    @Autowired
    private rPersona rpersona;
    
    @GetMapping("/medico/{id}")
    public @ResponseBody ResponseEntity<Optional<mMedico>> getOneMedico(@PathVariable Long id){
        
        Optional<mMedico> omm = rmedico.findById(id);
        
        if(!omm.isPresent()){
        
            return new ResponseEntity(omm, HttpStatus.NOT_FOUND);
            
        }
        
        return new ResponseEntity(omm, HttpStatus.OK);
        
        //return rmedico.findById(id);

    }
    
    @PostMapping(value="/medicos",produces ="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody void postMedico(@RequestBody mMedico mmedico){
    
        mPersona persona = mmedico.getMpersona();
        rpersona.save(persona);
        
        mmedico.setMedicoid(persona.getPersonaid());
        rmedico.save(mmedico);
        
    }
    
    @PutMapping(value="/medicos",produces ="application/json")
    public @ResponseBody void putMedico(@RequestBody mMedico mmedico){
    
        mPersona persona = mmedico.getMpersona();
        rpersona.save(persona);
        
        mmedico.setMedicoid(persona.getPersonaid());
        rmedico.save(mmedico);
    
    }
    
  
    
}
