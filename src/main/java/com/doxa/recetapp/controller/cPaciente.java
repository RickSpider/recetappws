/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mPersona;
import com.doxa.recetapp.repository.rPaciente;
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
//@RequestMapping("/paciente")
public class cPaciente {
    
    @Autowired
    private rPaciente rpaciente;
    
    @Autowired
    private rPersona rpersona;
    
    @GetMapping(value = "/paciente/{pacienteid}", produces ="application/json")
    
    public @ResponseBody ResponseEntity<Optional<mPaciente>> paciente (@PathVariable Long pacienteid){

        Optional<mPaciente> omp = rpaciente.findById(pacienteid);
        
        if(omp.isPresent()){
        
             return new ResponseEntity(omp.get(), HttpStatus.OK);
            
        }
           
        
        return new ResponseEntity(null, HttpStatus.NOT_FOUND);
    
        //return rpaciente.findById(pacienteid);
        
    }
    
    @PostMapping(value ="/paciente",produces ="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody void addPaciente(@RequestBody mPaciente mpaciente){
    
        
        
        mPersona persona = mpaciente.getMpersona();
        rpersona.save(persona);
       
        mpaciente.setPacienteid(persona.getPersonaid());
        mpaciente.setMpersona(persona);
       
        
        System.out.println(mpaciente.getPacienteid()+ " "+ mpaciente.getPesocorporal()+ " "+ mpaciente.getGruposanguineo()+" "+mpaciente.getMpersona().getPersonaid());
       
        rpaciente.save(mpaciente);
        
        System.out.println("posteo");
      
        //rpersona.save(mpersona);
        
    }
    
    @PutMapping(value="/paciente",produces ="application/json")
    public @ResponseBody void putMedico(@RequestBody mPaciente mpaciente){
    
        mPersona persona = mpaciente.getMpersona();
        rpersona.save(persona);
        
        mpaciente.setPacienteid(persona.getPersonaid());
        rpaciente.save(mpaciente);
    
    }

    
    
}
