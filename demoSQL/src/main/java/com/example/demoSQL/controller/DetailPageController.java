package com.example.demoSQL.controller;

import java.sql.Date;
//import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
