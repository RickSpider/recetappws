/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author BlackSpider
 */
@Entity(name = "Titulos")
@Data
public class mTitulo {
    
    @Id
    private Long tituloid;
    private String titulo;
    
}
