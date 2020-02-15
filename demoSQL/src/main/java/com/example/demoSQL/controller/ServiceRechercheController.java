package com.example.demoSQL.controller;

import java.sql.Date;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.service.*;

@Controller

public class ServiceRechercheController {
	@Autowired
	private RechercheService rechercheService;
	
	@RequestMapping(value="rechercheDemande", method = RequestMethod.GET)
	public String showRecherchePage(ModelMap model, HttpSession session){
		//model.put("id", serviceId);
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		model.put("id", session.getAttribute("userId"));
		
		return "rechercheDemande";
	}
	
	@RequestMapping(value="recherche/infoDeRechercheDemande", method = RequestMethod.POST)
	public String showInfoDeRechercheDemande(ModelMap model, HttpSession session, @RequestParam String idDemande, @RequestParam String typeService,@RequestParam String natureService,@RequestParam String compteId,@RequestParam String localisationService, @RequestParam String description,@RequestParam String descriptionDetail, @RequestParam String dateValidDemande ){
		List<DemandeDo> d = new ArrayList<DemandeDo>();
		
		if (idDemande!=null&&!idDemande.equals("")) {
			DemandeDo de = this.rechercheService.getOneDemandeById(Long. parseLong(idDemande));
			d.add(de);
			System.out.println(idDemande);
			System.out.println(de.getDescription());
		}
		if (typeService!=null&&!typeService.equals("")) {
			System.out.println("diaonima");
			d=retainList(d,this.rechercheService.getOneDemandeByTypeService(typeService));
			
		}
		
		if (natureService!=null&&!natureService.equals("")) {
			System.out.println("kk");
			// List<DemandeDo> d = this.rechercheService.getOneDemandeByNatureService(natureService);
			d=retainList(d,this.rechercheService.getOneDemandeByNatureService(natureService));
			
		}
		if (compteId!=null&&!compteId.equals("")) {
			// List<DemandeDo> d = this.rechercheService.getOneDemandeByUserCompte(compteId);
			d=retainList(d,this.rechercheService.getOneDemandeByUserCompte(compteId));
		}
		if (localisationService!=null&&!localisationService.equals("")) {
			d=retainList(d,this.rechercheService.getOneDemandeByLocalisationService(localisationService));
		}
		if (description!=null&&!description.equals("")) {
			d=retainList(d,this.rechercheService.getOneDemandeByDescrption(description));
		}
		if (descriptionDetail!=null&&!descriptionDetail.equals("")) {
			
			d=retainList(d,this.rechercheService.getOneDemandeByDescriptionDetail(descriptionDetail));
		}
		if (dateValidDemande!=null&&!dateValidDemande.equals("")) {
			Date date=Date.valueOf(dateValidDemande);
			d=retainList(d,this.rechercheService.getOneDemandeByDateValidDemande(date));
		}
		model.put("demandeList", d);
		
		return "infoDeRechercheDemande";
	}
	public List<DemandeDo> retainList (List<DemandeDo> d1,List<DemandeDo> d2){
		if(d1.size()==0) {
			d1.addAll(d2);
			
		}else {
			d1.retainAll(d2);
		}
		return d1;
	}

}
