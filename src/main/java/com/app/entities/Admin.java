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
import javax.persistence.Table;
        
/**
 *
 * @author kouam
 */

@Entity
@Table(name = "Admin")
@Data
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idadmin;
    
    @Column(nullable = false, length = 45, unique = true)
    private String username;
    
    @Column(nullable = false, length = 45)
    private String password;
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Set<Client> getClient() {
		return client;
	}

	public void setClient(Set<Client> client) {
		this.client = client;
	}

	@Column(nullable = false, length = 45)
    private String mail;
    
    @Column(nullable = false, length = 13)
    private int telephone;
    
    @ManyToMany(mappedBy = "admins")
    private Set<Client> client = new HashSet<>();
    
    public Admin(Long idadmin, String mail, String password, int telephone, String username) {
        this.idadmin = idadmin;
        this.mail = mail;
        this.password = password;
        this.telephone = telephone;
        this.username = username;
    }

	public Long getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(Long idadmin) {
		this.idadmin = idadmin;
	}
    
}
