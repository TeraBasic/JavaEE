package com.example.demoSQL.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.UserDo;


@Repository
public interface DemandeDao extends JpaRepository<DemandeDo, Long> {

	@Query("SELECT d FROM DemandeDo d WHERE d.typeService =?1")
	public List<DemandeDo> findByTypeService(String typeService);
	
	@Query("SELECT d FROM DemandeDo d WHERE d.natureService =?1")
	public List<DemandeDo> findByNatureService(String natureService);
	
	@Query("SELECT d FROM DemandeDo d JOIN UserDo u ON d.compteId=u.userId WHERE u.pseudonyme =?1")
	public List<DemandeDo> findByUserPseudonyme(String pseudonyme);
	
	@Query("SELECT d FROM DemandeDo d  WHERE d.compteId =?1")
	public List<DemandeDo> findByUserCompte(String compteId);
	
	@Query("SELECT d FROM DemandeDo d WHERE d.description =?1")
	public List<DemandeDo> findByDescription(String description);
	
	@Query("SELECT d FROM DemandeDo d WHERE d.localisationService =?1")
	public List<DemandeDo> findByLocalisationService(String localisationService);
	
	@Query("SELECT d FROM DemandeDo d WHERE d.descriptionDetail =?1")
	public List<DemandeDo> findByDescriptionDetail(String descriptionDetail);

	@Query("SELECT d FROM DemandeDo d WHERE d.dateValidDemande =?1")
	public List<DemandeDo> findByDateValidDemande(Date dateValidDemande);
	
	@Query("SELECT d FROM DemandeDo d WHERE d.etatService =?1")
	public List<DemandeDo> findByEtatDemande(String etat);
	
	
}
