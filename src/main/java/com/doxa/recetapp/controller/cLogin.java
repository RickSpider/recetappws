/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.controller;

import com.doxa.recetapp.model.mLogin;
import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mPersona;
import com.doxa.recetapp.repository.rMedico;
import com.doxa.recetapp.repository.rPaciente;
import com.doxa.recetapp.repository.rPersona;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackSpider
 */

@RestController
@RequestMapping("/login")
public class cLogin {
    
    @Autowired
    private rPaciente rpaciente;
    
    @Autowired
    private rMedico rmedico;
    
    @Autowired
    private rPersona rpersona;
    
    @PostMapping
    public @ResponseBody mLogin login(@RequestBody mLogin mlogin ){
    
        Optional<mPersona> mpersona = rpersona.findByCi(mlogin.getUsername());
        
        if (mpersona.isPresent()){
        
            if (mlogin.isMedico()){
                
                Optional<mMedico> mmedico = rmedico.findById(mpersona.get().getPersonaid());
                
                if(mmedico.isPresent()){
                
                    mlogin.setId(mmedico.get().getMedicoid());
                    
                    return mlogin;
                    
                }
                
            }else{
            
                Optional<mPaciente> mpaciente = rpaciente.findById(mpersona.get().getPersonaid());
                
                if(mpaciente.isPresent()){
                
                    mlogin.setId(mpaciente.get().getPacienteid());
                    
                    return mlogin;
                    
                }
                
            }
            
        }
        
        return null;

    }
    
    
    
    
}
