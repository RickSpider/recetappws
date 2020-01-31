/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.model.mMedicoPaciente;
import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mPersona;
import com.doxa.recetapp.model.mReceta;
import com.doxa.recetapp.model.mRecetaDetalle;
import com.doxa.recetapp.repository.rMedico;
import com.doxa.recetapp.repository.rMedicoPaciente;
import com.doxa.recetapp.repository.rPaciente;
import com.doxa.recetapp.repository.rPersona;
import com.doxa.recetapp.repository.rReceta;
import com.doxa.recetapp.repository.rRecetaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
@RequestMapping("/controller")
public class controller {
    
    @Autowired
    private rPersona rpersona;
    
    @Autowired 
    private rPaciente rpaciente;
    
    @Autowired 
    private rMedico rmedico;
    
    @Autowired 
    private rReceta rreceta;
    
    @Autowired
    private rMedicoPaciente rmedicopaciente;
    
    @Autowired rRecetaDetalle rrecetadetalle;
    
    @GetMapping("hello")
    public String hello (){
    
        return "hello";
        
    }
    
    
    @GetMapping("/personas")
    public Iterable<mPersona> personas(){
    
        return rpersona.findAll();
        
    }
    
    @GetMapping("/pacientes")
    public Iterable<mPaciente> pacientes(){
    
        return rpaciente.findAll();
        
    }
    
    @GetMapping("/medicos")
    public Iterable<mMedico> medicos(){
    
        return rmedico.findAll();
        
    }
    
    @GetMapping("/recetas")
    public Iterable<mReceta> Recetas(){
    
        return rreceta.findAll();
        
    }
    
    @GetMapping("/medicopaciente")
    public Iterable<mMedicoPaciente> medicopaciente(){
    
        return rmedicopaciente.findAll();
        
    }
    
    @GetMapping("/recetasdetalles")
    public Iterable<mRecetaDetalle> recetadetalle(){
    
        return rrecetadetalle.findAll();
        
    }
    
}
