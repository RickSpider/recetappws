/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity(name = "Pacientes")
@Data
public class mPaciente implements Serializable{
    
    @Id
    private long pacienteid;
    
    
    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
   // @JoinColumn(name="personaid")//, referencedColumnName="personaid")
    @PrimaryKeyJoinColumn 
    private mPersona mpersona; 
 
    private String gruposanguineo;
    
    private String pesocorporal;
    
    
}
