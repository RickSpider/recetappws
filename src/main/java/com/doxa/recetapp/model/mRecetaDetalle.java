/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Data
@Entity(name="recetasdetalles")
public class mRecetaDetalle {
    
    @EmbeddedId
    private mpkRecetaDetalle mpkrecetasdetalles;
    
    private String indicaciones;
    private String dosis;
    
}
