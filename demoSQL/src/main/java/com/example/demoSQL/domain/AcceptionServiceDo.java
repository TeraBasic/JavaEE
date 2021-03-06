package com.example.demoSQL.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AcceptionService")
public class AcceptionServiceDo {
	@Id
	private Long offerId;
	@Column(length = 32)
	private String compteId;
	@Column(length = 32)
	private String acceptCompte;
	@Column(length = 256)
	private String message;
	
	public Long getOfferId() {
		return this.offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	public String getCompteId() {
		return this.compteId;
	}
	public void setCompteId(String compteId) {
		this.compteId = compteId;
	}
	public String getAcceptCompte() {
		return this.acceptCompte;
	}
	public void setAcceptCompte(String compte) {
		this.acceptCompte = compte;
	}
	public void setMessage(String mess) {
		this.message = mess;
	}
	public String getMessage() {
		return this.message;
	}
}
