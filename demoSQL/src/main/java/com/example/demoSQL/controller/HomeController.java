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
		String id= (String) session.getAttribute("userId");
		UserDo u = this.gererCompte.getOneUser(id);
		model.put("id", session.getAttribute("userId"));
		model.put("user", u);
		return "modifierCompte";
    }

	@RequestMapping(value="afficheCompteInfo", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model, HttpSession session){
		String id= (String) session.getAttribute("userId");
		UserDo userCompte = this.gererCompte.getOneUser(id);
		System.out.println(userCompte.getUserId());
        model.put("userCompte", userCompte);
        
		return "afficheCompteInfo";
    }
	@RequestMapping(value="modifieCompteSuccess", method = RequestMethod.POST)
    public String modifieCompte(ModelMap model,HttpSession session,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String description, @RequestParam String mdp) {
		String id= (String) session.getAttribute("userId");
		UserDo ud= this.gererCompte.getOneUser(id);
		
		boolean modifieValid = gererCompte.modifieValid(telephone);
    	if (!modifieValid ) {
             model.put("errorMessage", "input error");
             return "modifierCompte";
        }
		
		ud.setUserId(id);
    	
    	if (adresse!=null&&!adresse.equals("")) {
    		ud.setAdresse(adresse);
    	}
    	if (telephone!=null&&!telephone.equals("")) {
    		ud.setTelephone(telephone);
    	}
    	if (description!=null&&!description.equals("")) {
    		ud.setDescription(description);
    	}
    	if (mdp!=null&&!mdp.equals("")) {
    		ud.setPassword(mdp);
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
    public String addDemandes(ModelMap model,@RequestParam String nomService, @RequestParam String typeService,@RequestParam String natureService, @RequestParam String dateValidDemande, @RequestParam String description, @RequestParam String descriptionDetail,@RequestParam String localisationService, HttpSession session){
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		boolean checkDate = DemandeService.checkDate(dateValidDemande);
    	if (!checkDate) {
             model.put("errorMessage", "date error");
             return "demande";
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
        if(dateValidDemande!=null&&!dateValidDemande.equals("")) {
        	Date date=Date.valueOf(dateValidDemande);
        	demande.setDateValidDemande(date);
        }
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
    public String addOffer(ModelMap model,@RequestParam String nomService, @RequestParam String typeService,@RequestParam String natureService, @RequestParam String dateValidOffert, @RequestParam String description, @RequestParam String descriptionDetail,@RequestParam String localisationService, HttpSession session){
		if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
		boolean checkDate = DemandeService.checkDate(dateValidOffert);
    	if (!checkDate) {
             model.put("errorMessage", "date error");
             return "offer";
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
        if(dateValidOffert!=null&&!dateValidOffert.equals("")) {
        	Date date=Date.valueOf(dateValidOffert);
        	offer.setDateValidOffert(date);
        }
        offer.setDescriptionDetail(descriptionDetail);
        offerService.save(offer);
        return "addOfferSuccess";    
    }


}
