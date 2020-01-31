/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author BlackSpider
 */

@Data
@Entity(name = "medicospacientes")
public class mMedicoPaciente{
    
    @EmbeddedId
    private mpkMedicoPaciente mpkmedicopaciente;
    
    private String Observacion;
    
}
