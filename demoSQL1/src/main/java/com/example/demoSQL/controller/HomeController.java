package com.example.demoSQL.controller;


import java.sql.Date;
//import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.*;
@Controller

public class HomeController {
	Long serviceDemandeId=(long) 0;
	long offerID = 0;
	@Autowired
    DemandeService demandeService;
	@Autowired
    GererCompteService gererCompte;
	@Autowired
    private OfferDao offerService;
	
	@RequestMapping(value="modifierCompte", method = RequestMethod.GET)
	public String showModifieComptePage(ModelMap model, HttpSession session){
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		model.put("id", session.getAttribute("userId"));
		return "modifierCompte";
    }
	@RequestMapping(value="afficheCompteInfo", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model, HttpSession session){
		String id= (String) session.getAttribute("userId");
		UserDo userCompte = this.gererCompte.getOneUser(id);
		System.out.println(userCompte.getId());
        model.put("userCompte", userCompte);
        
		return "afficheCompteInfo";
    }
	@RequestMapping(value="modifieCompteSuccess", method = RequestMethod.POST)
    public String modifieCompte(ModelMap model,HttpSession session, @RequestParam String nom,@RequestParam String prenom,@RequestParam String pseudonyme,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String description) {
		String id= (String) session.getAttribute("userId");
		UserDo ud= this.gererCompte.getOneUser(id);
    	
    	ud.setId(id);
    	if (nom!=null) {
    		ud.setNom(nom);
    	}
    	if (prenom!=null) {
    		ud.setPrenom(prenom);
    	}
    	if (pseudonyme!=null) {
    		ud.setPseudonyme(pseudonyme);
    	}
    	if (adresse!=null) {
    		ud.setAdresse(adresse);
    	}
    	if (telephone!=null) {
    		ud.setTelephone(telephone);
    	}
    	if (description!=null) {
    		ud.setDescription(description);
    	}
    	
    	model.put("userCompte", ud);
    	this.gererCompte.updateUser(ud);   	
    	return "modifieCompteSuccess";
    }
	
	@RequestMapping(value="demande", method = RequestMethod.GET)
	public String showDemandePage(ModelMap model, HttpSession session){
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		model.put("id", session.getAttribute("userId"));
		return "demande";
    }
	
	@RequestMapping(value="demande/addDemandeSuccess", method = RequestMethod.POST)
    public String addDemandes(ModelMap model,@RequestParam String nomService, @RequestParam String typeService,@RequestParam String natureService, @RequestParam Date dateValidDemande, @RequestParam String description, @RequestParam String descriptionDetail,@RequestParam String localisationService, HttpSession session){
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		String etatService="A VALIDER";
		DemandeDo demande = new DemandeDo();
		serviceDemandeId++;
		String userId = (String) session.getAttribute("userId");
        demande.setServiceDemandeId(serviceDemandeId);
        demande.setCompteId(userId);
        demande.setnomService(nomService);
        demande.setTypeService(typeService);
        demande.setNatureService(natureService);
        demande.setLocalisationService(localisationService);
        demande.setEtatService(etatService);
        demande.setDescription(description);
        demande.setDateValidDemande(dateValidDemande);
        demande.setDescriptionDetail(descriptionDetail);
        this.demandeService.stockDemande(demande);
        return "addDemandeSuccess";

    
    }
	
	@RequestMapping(value="offer", method = RequestMethod.GET)
	public String showOfferPage(ModelMap model, HttpSession session){
		if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
		model.put("id", session.getAttribute("userId"));
		return "offer";
    }

	@RequestMapping(value="offer/addOfferSuccesful", method = RequestMethod.POST)
    public String addOffer(ModelMap model,@RequestParam String nomService, @RequestParam String typeService,@RequestParam String natureService, @RequestParam Date dateValidOffert, @RequestParam String description, @RequestParam String descriptionDetail,@RequestParam String localisationService, HttpSession session){
		if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
		
		OfferDo offer = new OfferDo();
		offerID++;
		String userId = (String) session.getAttribute("userId");
        offer.setOfferId(offerID);
        offer.setCompteId(userId);
        offer.setNomService(nomService);
        offer.setTypeService(typeService);
        offer.setNatureService(natureService);
        offer.setLocalisationService(localisationService);
        offer.setEtatService("A_VALIDER");
        offer.setDescription(description);
        offer.setDateValidOffert(dateValidOffert);
        offer.setDescriptionDetail(descriptionDetail);
        offerService.save(offer);
        return "addOfferSuccess";    
    }


}
