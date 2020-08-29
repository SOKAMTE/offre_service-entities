/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entities;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import java.util.Set;
import javax.persistence.ManyToMany;
        
/**
 *
 * @author kouam
 */

@Entity
@Data
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idadmin;
    
    @Column(nullable = false, length = 45)
    private String username;
    
    @Column(nullable = false, length = 45)
    private String password;
    
    @Column(nullable = false, length = 45)
    private String mail;
    
    @Column(nullable = false, length = 13)
    private int telephone;
    
    @ManyToMany(mappedBy = "admins")
    private Set<Client> client = new HashSet<>();
}
