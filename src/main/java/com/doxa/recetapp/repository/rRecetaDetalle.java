/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.repository;

import com.doxa.recetapp.model.mReceta;
import com.doxa.recetapp.model.mRecetaDetalle;
import com.doxa.recetapp.model.mpkRecetaDetalle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author BlackSpider
 */
public interface rRecetaDetalle extends CrudRepository<mRecetaDetalle, mpkRecetaDetalle>{
    
    @Query(value ="Select * from recetasdetalles r where r.recetaid=?", nativeQuery = true)
    Iterable<mRecetaDetalle> findByReceta (Long recetaid);
    
}
