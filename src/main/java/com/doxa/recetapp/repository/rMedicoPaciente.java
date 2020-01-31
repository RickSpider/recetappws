/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.repository;

import com.doxa.recetapp.model.mMedicoPaciente;
import com.doxa.recetapp.model.mpkMedicoPaciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BlackSpider
 */
public interface rMedicoPaciente extends CrudRepository<mMedicoPaciente, Long>{
    
    @Query(value ="Select * from medicospacientes m where m.medicoid=?", nativeQuery = true)
    Iterable<mMedicoPaciente> findBymedicoid (Long id);
}
