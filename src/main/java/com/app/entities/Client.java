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
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author kouam
 */

@Entity
@Table(name = "Client")
@Data
public class Client implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idclient;
    
    @Column(nullable = false, length = 30, unique = true)
    private String nom;
    
    @Column(nullable = false, length = 13)
    private int telephone;
    
    @Column(nullable = false, length = 45)
    private String mail;
     
    @Column(nullable = true, length = 30)
    private String ville;
    
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
    CascadeType.MERGE
    })
    @JoinTable(name = "ClientAdmin",
        joinColumns = @JoinColumn(name = "idclient"),
        inverseJoinColumns = @JoinColumn(name = "idadmin")
    )
    private Set<Admin> admins = new HashSet<>();
    
    @ManyToMany(cascade = {
    CascadeType.PERSIST,
    CascadeType.MERGE
    })
    @JoinTable(name = "ClientDiscussion",
        joinColumns = @JoinColumn(name = "idclient"),
        inverseJoinColumns = @JoinColumn(name = "iddiscussion")
    )
    private Set<Discussion> discussions = new HashSet<>();
}
