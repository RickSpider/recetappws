/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */

@Entity
@Table(name = "Medicos")
@Data
public class mMedico {
    
    @Id
    private Long medicoid;
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private mPersona mpersona;
    
    @ManyToOne
    @JoinColumn(name="tituloid")
    private mTitulo mtitulo;  
    
    private String nroregistro;
    private Boolean certificado;
    
    
}
