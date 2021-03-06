/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.View;
import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mReceta;
import com.doxa.recetapp.model.mRecetaDetalle;
import com.doxa.recetapp.repository.rReceta;
import com.doxa.recetapp.repository.rRecetaDetalle;
import com.fasterxml.jackson.annotation.JsonView;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */
@RestController
//@RequestMapping("/receta")
public class cReceta {
    
    @Autowired
    private rReceta rreceta;
    
    @Autowired
    private rRecetaDetalle rrd;
    
    @PostMapping(value = "/receta",produces ="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody void postReceta(@RequestBody mReceta mreceta){

        rreceta.save(mreceta);
        
    }
    
    @GetMapping(value="/recetas/paciente/{pacienteid}", produces ="application/json")
    public @ResponseBody Iterable<mReceta> recetas(@PathVariable Long pacienteid){
             
       mPaciente mpaciente = new mPaciente();
       mpaciente.setPacienteid(pacienteid);

       return rreceta.findByMpaciente(mpaciente, Sort.by(Sort.Direction.DESC, "fchreceta"));
    }
    
    @GetMapping(value = "/recetas/paciente/{pacienteid}/medico/{medicoid}", produces ="application/json")
    public @ResponseBody Iterable<mReceta> recetaspacientemedicos(@PathVariable Long pacienteid, @PathVariable Long medicoid){
        
       mPaciente mpaciente = new mPaciente();
       mpaciente.setPacienteid(pacienteid);
       
       mMedico mmedico = new mMedico();
       mmedico.setMedicoid(medicoid);
       
       return rreceta.findByMpacienteAndMmedico(mpaciente, mmedico,Sort.by(Sort.Direction.DESC, "fchreceta"));
       
    }
    
    @GetMapping(value = "/receta/{recetaid}", produces ="application/json")
    public ResponseEntity<Optional<mReceta>> getReceta(@PathVariable Long recetaid){
    
        Optional<mReceta> omr = rreceta.findById(recetaid);
        
        if (!omr.isPresent()){
        
            return new ResponseEntity(omr, HttpStatus.NOT_FOUND);
            
        }
        
        return new ResponseEntity(omr, HttpStatus.OK);
        
       // return rreceta.findById(recetaid);
        
    }
    
      @GetMapping(value = "/receta/detalles/{recetaid}",produces ="application/json")
      @JsonView({View.SummaryRecetaMedicamento.class})
      public @ResponseBody Iterable<mRecetaDetalle> detalles(@PathVariable Long recetaid){
    
            return rrd.findByReceta(recetaid);
            
      }
}
