/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mPersona;
import com.doxa.recetapp.repository.rPaciente;
import com.doxa.recetapp.repository.rPersona;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/paciente")
public class cPaciente {
    
    @Autowired
    private rPaciente rpaciente;
    
    @Autowired
    private rPersona rpersona;
    
    @GetMapping("/{pacienteid}")
    public @ResponseBody Optional<mPaciente> paciente (@PathVariable Long pacienteid){
    
        return rpaciente.findById(pacienteid);
        
    }
    
    @PostMapping("/")
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
    
}
