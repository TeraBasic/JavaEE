package com.example.demoSQL.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.service.*;
@Controller


public class OfferController {
	long offerID = 0;

	@Autowired
    private OfferDao offerService;
	
	@RequestMapping(value="offer", method = RequestMethod.GET)
	public String showOfferPage(ModelMap model, HttpSession session){
		if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
		model.put("id", session.getAttribute("userId"));
		return "offer";
    }

	@RequestMapping(value="offer/addOfferSuccesful", method = RequestMethod.POST)
    public String addDemandes(ModelMap model,@RequestParam String nomService, @RequestParam String typeService,@RequestParam String natureService, @RequestParam Date dateValidOffert, @RequestParam String description, @RequestParam String descriptionDetail,@RequestParam String localisationService, HttpSession session){
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
        return "addOfferSuccesful";    
    }
}