/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.repository;

import com.doxa.recetapp.model.mMedico;
import com.doxa.recetapp.model.mPaciente;
import com.doxa.recetapp.model.mReceta;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BlackSpider
 */
public interface rReceta extends CrudRepository<mReceta, Long> {
    
    Iterable<mReceta> findByMpaciente(mPaciente mpaciente, Sort sort);
    Iterable<mReceta> findByMpacienteAndMmedico (mPaciente mpaciente, mMedico mmedico, Sort sort);
 }
