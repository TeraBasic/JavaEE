package com.example.demoSQL.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * class offerDo
 * create the table of offer in the database
 * @author 
 * @since 
 */
@Entity
@Table(name = "offer")
public class OfferDo {
	@Id
    private Long offerId;
	@Column
    private String compteId;   
    @Column(length = 32)
    private String typeService;
    @Column(length = 32)
    private String reference;
    @Column(length = 32)
    private String nomService;
    @Column(length = 64)
    private String natureService;
    @Column(length = 64)
    private String dateValidOffert;
    @Column(length = 64)
    private String description;
    @Column(length = 64)
    private String descriptionDetail;
    @Column(length = 64)
    private String localisationService;
    @Column(length = 64)
    private String etatService;
    
    public Long getOfferId() {
        return this.offerId;
    }

    public void setOfferId(long offerID2) {
        this.offerId = offerID2;
    }
    
    public String getCompteId() {
        return this.compteId;
    }

    public void setCompteId(String compteId) {
        this.compteId = compteId;
    }
    
    public String getTypeService() {
        return this.typeService;
    }
    public String getReference() {
    	return this.reference;
    }
    public void setReference(String ref) {
    	this.reference = ref;
    }
    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
    
    public String getnomService() {
        return this.nomService;
    }

    public void setnomService(String nomService) {
        this.nomService = nomService;
    }
    
    public String getNatureService() {
    	return this.natureService;
    }
    
    public void setNatureService(String natureService) {
    	this.natureService = natureService;
    }
    
    
    public String getDateValideOffert() {
    	return this.dateValidOffert;
    }
    public void setDateValideOffert(String dateValidOffert2) {
    	this.dateValidOffert = dateValidOffert2;
    }
    
    public String getDescription() {
    	return this.description;
    }
    public void setDescription( String description) {
    	this.description = description;
    }
    
    public String getDescriptionDetail() {
    	return this.descriptionDetail;
    }
    public void setDescriptionDetail(String descriptionD) {
    	this.descriptionDetail = descriptionD;
    }
    
    public String getLocalisationService() {
    	return this.localisationService;
    }
    public void setLocalisationService(String localisationService) {
    	this.localisationService =  localisationService;
    }
    
    public String getEtatService() {
    	return this.etatService;
    }
    public void setEtatService(String etaService) {
    	this.etatService = etaService;
    }
}
