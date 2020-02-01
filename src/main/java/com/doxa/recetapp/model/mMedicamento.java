/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import com.fasterxml.jackson.annotation.JsonView;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity(name="medicamentos")
@Data
class mMedicamento {
    
    @Id
    @JsonView({View.SummaryRecetaMedicamento.class})
    private Long medicamentoid;
    
    @JsonView({View.SummaryRecetaMedicamento.class})
    private String medicamento;
    
    @JsonView({View.SummaryRecetaMedicamento.class})
    private String observacion;
    
}
