/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    
    @ManyToOne
    @JoinColumn(name="ciudadid")
    private mCiudad mciudad;
    
    @Temporal(TemporalType.DATE)
    private Calendar fchnacimiento;
    
}
