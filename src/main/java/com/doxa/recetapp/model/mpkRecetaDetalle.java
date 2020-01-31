/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Data
@Embeddable
public class mpkRecetaDetalle implements Serializable {
    
       @ManyToOne
       @JoinColumn(name="recetaid")
       private mReceta mreceta;
       
       @ManyToOne
       @JoinColumn(name="medicamentoid")
       private mMedicamento mmedicamento;
    
}
