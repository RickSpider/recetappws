/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
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
    
   
    /*@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY )
    @PrimaryKeyJoinColumn  
    private mPaciente mpaciente;*/
   
    
}
