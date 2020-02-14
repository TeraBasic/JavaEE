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
import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.PropositionServiceDo;
import com.example.demoSQL.service.*;

@Controller
public class ServiceDetailController {
	
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
		ps.setServiceId(serviceDemandeId);
		ps.setCompte(demandeCompte);
		ps.setProposeCompte(proposeCompte);
		ps.setMessage(message);
		contractService.stockPsDo(ps);
		return "home";
	}
	
}
