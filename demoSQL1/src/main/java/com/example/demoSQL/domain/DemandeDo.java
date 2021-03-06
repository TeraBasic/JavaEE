package com.example.demoSQL.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * class entity
 * 
 * @author
 * @since
 */
@Entity
@Table(name = "demande")
public class DemandeDo {
	@Id
	private Long serviceDemandeId;
	@Column(length = 32)
	private String compteId;
	@Column(length = 32)
	private String typeService;
	@Column(length = 32)
	private String nomService;
	@Column(length = 64)
	private String natureService;
	@Column(length = 64)
	private Date dateValidDemande;
	@Column(length = 64)
	private String description;
	@Column(length = 64)
	private String descriptionDetail;
	@Column(length = 64)
	private String localisationService;
	@Column(length = 64)
	private String etatService;

	public Long getServiceDemandeId() {
		return this.serviceDemandeId;
	}

	public void setServiceDemandeId(Long serviceDemandeID) {
		this.serviceDemandeId = serviceDemandeID;
	}
	public String getCompteId() {
		return this.compteId;
	}

	public void setCompteId(String compteID) {
		this.compteId = compteID;
	}
	
	public String getTypeService() {
		return this.typeService;
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

	public Date getDateValidDemande() {
		return this.dateValidDemande;
	}

	public void setDateValidDemande(Date date) {
		this.dateValidDemande = date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionDetail() {
		return this.descriptionDetail;
	}

	public void setDescriptionDetail(String descriptionDetail) {
		this.descriptionDetail = descriptionDetail;
	}

	public String getLocalisationService() {
		return this.localisationService;
	}

	public void setLocalisationService(String localisationService) {
		this.localisationService = localisationService;
	}

	public String getEtatService() {
		return this.etatService;
	}

	public void setEtatService(String etaService) {
		this.etatService = etaService;
	}

}
