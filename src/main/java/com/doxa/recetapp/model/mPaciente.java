/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author BlackSpider
 */
@Entity(name = "Pacientes")
@Data
public class mPaciente{
    
    @Id
    private long pacienteid;
        
    @OneToOne
    @PrimaryKeyJoinColumn
    private mPersona mpersona; 
 
    private String gruposanguineo;
    
    private String pesocorporal;
    
    
}
