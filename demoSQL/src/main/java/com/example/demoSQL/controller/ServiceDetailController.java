package com.example.demoSQL.controller;

import java.sql.Date;
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
public class ServiceDetailController {
	
	@Autowired
	private OfferDemandService offerDemandService;

	@RequestMapping(value="detailDemande/{serviceId}", method = RequestMethod.GET)
	public String showDetailPage(ModelMap model, HttpSession session, @PathVariable("serviceId") Long serviceId){
		//model.put("id", serviceId);
		
		DemandeDo d = this.offerDemandService.getOneDemande(serviceId);
		model.put("demande", d);
		return "detailDemande";
	}
}
