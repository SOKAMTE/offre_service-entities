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
@Table(name = "Discussion")
@Data
public class Discussion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iddiscussion;
    
    @Column(nullable = false, length = 45)
    private String message;
    
    @ManyToMany(mappedBy = "discussions")
    private Set<Client> client = new HashSet<>();

	public Long getIddiscussion() {
		return iddiscussion;
	}

	public void setIddiscussion(Long iddiscussion) {
		this.iddiscussion = iddiscussion;
	}
}
