package com.example.demoSQL.controller;


import java.sql.Date;
//import java.util.Date;

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
import com.example.demoSQL.service.*;
@Controller
public class DemandeController {
	Long serviceDemandeId=(long) 0;
	 
	@Autowired
    DemandeService demandeService;

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

}
