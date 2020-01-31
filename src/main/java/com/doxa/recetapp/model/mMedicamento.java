/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author BlackSpider
 */
@Entity(name="medicamentos")
class mMedicamento {
    
    @Id
    private Long medicamentoid;
    private String medicamento;
    private String observacion;
    
}
