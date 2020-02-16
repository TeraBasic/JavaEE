package com.example.demoSQL.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PropositionService")
public class PropositionServiceDo {
	@Id
	private Long serviceDemandeId;
	@Column(length = 32)
	private String demandCompte;
	@Column(length = 32)
	private String proposeCompte;
	@Column(length = 256)
	private String message;
	
	public Long getServiceDemandeId() {
		return this.serviceDemandeId;
	}
	public void setServiceDemandeId(Long id) {
		this.serviceDemandeId = id; 
	}
	public String getDemandCompte() {
		return this.demandCompte;
	}
	public void setDemandCompte(String compte) {
		this.demandCompte = compte;
	}
	public String getProposeCompte() {
		return this.proposeCompte;
	}
	public void setProposeCompte(String proposeCompte) {
		this.proposeCompte = proposeCompte;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String mess) {
		this.message = mess;
	}
}
