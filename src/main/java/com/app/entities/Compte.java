/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author kouam
 */

@Entity
@Data
public class Compte implements Serializable{
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcompte; 
   
   @Column(nullable = false, length = 45)
    private String username;
    
    @Column(nullable = false, length = 45)
    private String password;
    
   @Temporal(javax.persistence.TemporalType.TIMESTAMP) 
    private Date dateCreation;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP) 
    private Date DateConnexion;
    
    @ManyToOne(optional = true)
    private Client client;
}