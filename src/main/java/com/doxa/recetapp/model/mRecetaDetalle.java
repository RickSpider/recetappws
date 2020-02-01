/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
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
    @JsonView({View.SummaryRecetaMedicamento.class})
    private mpkRecetaDetalle mpkrecetadetalle;
    
    @JsonView({View.SummaryRecetaMedicamento.class})
    private String indicaciones;
    
    @JsonView({View.SummaryRecetaMedicamento.class})
    private String dosis;

}
