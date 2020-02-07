/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity(name = "Personas")
@Data
public class mPersona implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long personaid;
    private String nombre, apellido;
    private String direccion;
    private String telefono, Celular;
    private String ruc, ci;
    private String email;
    private String password;
    private String genero;
    
  /*  @Temporal(TemporalType.DATE)
    private Calendar fchnacimiento;*/
    
   
    /*@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY )
    @PrimaryKeyJoinColumn  
    private mPaciente mpaciente;*/
   
    
   /* public String getFchnacimiento(){
    
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return sdf.format(fchnacimiento);
        
    }*/
    
}
