package com.example.demoSQL.controller;

import java.sql.Date;
//import java.util.Date;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoSQL.domain.AcceptionServiceDo;
import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.PropositionServiceDo;
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.*;

@Controller
public class DetailPageController {
	
	@Autowired
	private OfferDemandService offerDemandService;
	@Autowired
	private ContractService contractService;
	
	
	@RequestMapping(value="detailDemande/{serviceId}", method = RequestMethod.GET)
	public String showDetailDemandePage(ModelMap model, HttpSession session, @PathVariable("serviceId") Long serviceId){
		//model.put("id", serviceId);
		
		DemandeDo d = this.offerDemandService.getOneDemande(serviceId);
		model.put("demande", d);
		return "detailDemande";
	}
	@RequestMapping(value="detailOffer/{serviceId}", method = RequestMethod.GET)
	public String showDetailOfferPage(ModelMap model, HttpSession session, @PathVariable("serviceId") Long serviceId){
		//model.put("id", serviceId);
		
	    OfferDo o = this.offerDemandService.getOneOffer(serviceId);
		model.put("offer", o);
		return "detailOffer";
	}
	
	
	/**
	 * 
	 * My demande offer
	 */
	@RequestMapping(value="detailMyDemande/{demandeId}", method = RequestMethod.GET)
	public String showDetailMyDemandePage(ModelMap model, HttpSession session, @PathVariable("demandeId") Long demandeId){
		//model.put("id", serviceId);
		
		DemandeDo d = this.offerDemandService.getOneDemande(demandeId);
		model.put("demande", d);
		return "detailMyDemande";
	}
	@RequestMapping(value="detailMyOffer/{offerId}", method = RequestMethod.GET)
	public String showDetailMyOfferPage(ModelMap model, HttpSession session, @PathVariable("offerId") Long offerId){
		//model.put("id", serviceId);
		
	    OfferDo o = this.offerDemandService.getOneOffer(offerId);
		model.put("offer", o);
		return "detailMyOffer";
	}
	
	@RequestMapping(value="modifierMyDemande/{demandeId}", method = RequestMethod.GET)
	public String modifierMyDemandePage(ModelMap model, HttpSession session, @PathVariable("demandeId") Long demandeId){
		//model.put("id", serviceId);
		
		DemandeDo d = this.offerDemandService.getOneDemande(demandeId);
		model.put("demande", d);
		//model.put("demandeId", demandeId);
		return "modifierMyDemande";
	}
	
	@RequestMapping(value="modifierMyOffer/{offerId}", method = RequestMethod.GET)
	public String modifierMyOfferPage(ModelMap model, HttpSession session, @PathVariable("offerId") Long offerId){
		//model.put("id", serviceId);
		
		OfferDo o = this.offerDemandService.getOneOffer(offerId);
		model.put("offer", o);
		//model.put("offerId", offerId);
		return "modifierMyOffer";
	}
	
	@RequestMapping(value="modifierMyOffer/modifierOfferSuccess", method = RequestMethod.POST)
	public String modifierMyOffer(ModelMap model, HttpSession session, @RequestParam Long offerId,@RequestParam String compteId,
			@RequestParam String typeService,@RequestParam String nomService,@RequestParam String natureService,@RequestParam Date dateValidOffert,
			@RequestParam String description,@RequestParam String descriptionDetail,@RequestParam String localisationService,@RequestParam String etatService){
		//model.put("id", serviceId);
		OfferDo od = new OfferDo();
		od.setOfferId(offerId);
		od.setCompteId(compteId);
		od.setTypeService(typeService);
		od.setNomService(nomService);
		od.setNatureService(natureService);
		od.setDateValidOffert(dateValidOffert);
		od.setDescription(description);
		od.setDescriptionDetail(descriptionDetail);
		od.setLocalisationService(localisationService);
		od.setEtatService(etatService);
		offerDemandService.updateOffer(od);
		
		return "modifierSuccess";
	}
	
	@RequestMapping(value="modifierMyDemande/modifierDemandeSuccess", method = RequestMethod.POST)
	public String modifierMyDemande(ModelMap model, HttpSession session, @RequestParam Long serviceDemandeId,@RequestParam String compteId,
			@RequestParam String typeService,@RequestParam String nomService,@RequestParam String natureService,@RequestParam Date dateValidDemande,
			@RequestParam String description,@RequestParam String descriptionDetail,@RequestParam String localisationService,@RequestParam String etatService){
		//model.put("id", serviceId);
		DemandeDo dd = new DemandeDo();
		dd.setServiceDemandeId(serviceDemandeId);
		dd.setCompteId(compteId);
		dd.setTypeService(typeService);
		dd.setnomService(nomService);
		dd.setNatureService(natureService);
		dd.setDateValidDemande(dateValidDemande);
		dd.setDescription(description);
		dd.setDescriptionDetail(descriptionDetail);
		dd.setLocalisationService(localisationService);
		dd.setEtatService(etatService);
		this.offerDemandService.updateDemande(dd);
		return "modifierSuccess";
	}
	
	
	
	/**
	 * 
	 * 
	 */
	
	@RequestMapping(value="proposeService/{serviceId}/{demandeCompte}", method = RequestMethod.GET)
	public String showProposeOfferPage(ModelMap model, HttpSession session, @PathVariable("serviceId") Long serviceId,@PathVariable("demandeCompte") String demandeCompte){
		//model.put("id", serviceId);
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		model.put("serviceId", serviceId);
		model.put("demandeCompte", demandeCompte);
		model.put("proposeCompte", session.getAttribute("userId"));
		return "proposeService";
	}
	
	@RequestMapping(value="proposeService/{serviceId}/{demandeCompte}", method = RequestMethod.POST)
	public String proposeOffer(ModelMap model, @RequestParam Long serviceDemandeId, @RequestParam String demandeCompte, @RequestParam String proposeCompte,@RequestParam String message){
		//model.put("id", serviceId);
		PropositionServiceDo ps = new PropositionServiceDo();
		ps.setServiceDemandeId(serviceDemandeId);
		ps.setDemandCompte(demandeCompte);
		ps.setProposeCompte(proposeCompte);
		ps.setMessage(message);
		contractService.stockPsDo(ps);
		return "home";
	}
	
	@RequestMapping(value="detailContractPerson/{proposeCompte}", method = RequestMethod.GET)
	public String showDetailPersonPage(ModelMap model, HttpSession session, @PathVariable("proposeCompte") String proposeCompte){
		//model.put("id", serviceId);
		
	    UserDo ud = contractService.getUser(proposeCompte);
		model.put("userCompte", ud);
		return "detailPersonInfo";
	}
	
	@RequestMapping(value="acceptService/{offerId}/{compteId}", method = RequestMethod.GET)
	public String showAcceptOfferPage(ModelMap model, HttpSession session, @PathVariable("offerId") Long offerId,@PathVariable("compteId") String compteId){
		//model.put("id", serviceId);
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		model.put("offerId", offerId);
		model.put("compteId", compteId);
		model.put("acceptCompte", session.getAttribute("userId"));
		return "acceptService";
	}
	
	@RequestMapping(value="acceptService/{offerId}/{compteId}", method = RequestMethod.POST)
	public String acceptOffer(ModelMap model, @RequestParam Long offerId, @RequestParam String compteId, @RequestParam String acceptCompte,@RequestParam String message){
		//model.put("id", serviceId);
		AcceptionServiceDo as = new AcceptionServiceDo();
		as.setOfferId(offerId);
		as.setCompteId(compteId);
		as.setAcceptCompte(acceptCompte);
		as.setMessage(message);
		contractService.stockAcceptionDo(as);
		return "home";
	}
	
}
