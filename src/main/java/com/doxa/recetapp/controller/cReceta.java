/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.View;
import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mReceta;
import com.doxa.recetapp.model.mRecetaDetalle;
import com.doxa.recetapp.repository.rReceta;
import com.doxa.recetapp.repository.rRecetaDetalle;
import com.fasterxml.jackson.annotation.JsonView;
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
@RequestMapping("/receta")
public class cReceta {
    
    @Autowired
    private rReceta rreceta;
    
    @Autowired
    private rRecetaDetalle rrd;
    
    @GetMapping("/paciente/{pacienteid}")
    public @ResponseBody Iterable<mReceta> recetas(@PathVariable Long pacienteid){
        
       mPaciente mpaciente = new mPaciente();
       mpaciente.setPacienteid(pacienteid);
       
       return rreceta.findByMpaciente(mpaciente);
       
    }
    
      @GetMapping("/detalles/{recetaid}")
      @JsonView({View.SummaryRecetaMedicamento.class})
      public @ResponseBody Iterable<mRecetaDetalle> detalles(@PathVariable Long recetaid){
    
       
       return rrd.findByReceta(recetaid);
       
          
      }
}
