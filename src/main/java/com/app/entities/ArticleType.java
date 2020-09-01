/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author kouam
 */
@Entity
@Table(name = "ArticleType")
@Data
public class ArticleType implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idarticletype;
}
