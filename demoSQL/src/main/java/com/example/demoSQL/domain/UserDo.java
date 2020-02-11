package com.example.demoSQL.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * class entity
 * @author 
 * @since 
 */
@Entity
@Table(name = "user")
public class UserDo {
	@Id
	@Column(name = "USER_ID",unique=true,columnDefinition="VARCHAR(64)")
	private String userId;
    
    @Column(length = 32)
    private String password;
    @Column(length = 32)
    private String nom;
    @Column(length = 32)
    private String prenom;
    @Column(length = 32)
    private String pseudonyme;
    @Column(length = 32)
    private String adresse;
    @Column(length = 32)
    private String telephone;
    @Column(length = 32)
    private String description;
    @Column(length = 32)
    private String userType;
    
    public String getId() {
    	return this.userId;
    }
    public void setId(String id) {
    	this.userId=id;
    }
    public String getPassWord() {
    	return this.password;
    }
    public void setPassWord(String pass) {
    	this.password = pass;
    }
    public String getNom() {
    	return this.nom;
    }
    public void setNom(String nom) {
    	this.nom = nom;
    }
    public String getPrenom() {
    	return this.prenom;
    }
    public void setPrenom(String prenom) {
    	this.prenom = prenom;
    }
    public String getPseudonyme() {
    	return this.pseudonyme;
    }
    public void setPseudonyme(String pseu) {
    	this.pseudonyme = pseu;
    }
    public String getAdresse() {
    	return this.adresse;
    }
    public void setAdresse(String add) {
    	this.adresse = add;
    }
    public String getTelephone() {
    	return this.telephone;
    }
    public void setTelephone(String tele) {
    	this.telephone = tele;
    }
    public String getDescription() {
    	return this.description;
    }
    public void setDescription(String des) {
    	this.description = des;
    	
    }
    public String getUserType() {
    	return this.userType;
    }
    public void setUserType(String userType) {
    	this.userType = userType;
    	
    }
   
    
}
