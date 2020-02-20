/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.doxa.recetapp.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author BlackSpider
 */

@Entity(name = "Recetas")
@Data
public class mReceta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long recetaid;
    
    @ManyToOne
    @JoinColumn(name="medicoid")
    private mMedico mmedico;
    
    @ManyToOne
    @JoinColumn(name="pacienteid")
    private mPaciente mpaciente;
    
    
    @CreationTimestamp 
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fchreceta;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm");
  
    
    private String diagnostico;
    private String estado;
    
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "recetasdetalles", joinColumns= {@JoinColumn(name = "recetaid", referencedColumnName ="recetaid")})
    private Set<mRecetaDetalles> mlrecetadetalle;
    
    public String getFchreceta() {
        return sdf.format(fchreceta);
    }
    
}
