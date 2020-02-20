/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Embeddable
@Data
public class mRecetaDetalles {
    
        @ManyToOne
        @JoinColumn(name="medicamentoid")
        private mMedicamento mmedicamento;

        private String indicaciones;

        private String dosis;
    
}
