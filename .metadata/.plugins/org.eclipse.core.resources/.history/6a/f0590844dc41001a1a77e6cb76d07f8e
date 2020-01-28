package com.example.demoSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoSQL.domain.OfferDo_Y;
import com.example.demoSQL.service.OfferService_Y;

@Controller
@RequestMapping("/servicePro")
public class ServiceProController {
	@Autowired
	private OfferService_Y offerService_Y;
	
	@RequestMapping(value="", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
		List<OfferDo_Y> serviceList = this.offerService_Y.getAllService();
        model.put("serviceProList", serviceList);
        for (OfferDo_Y e : serviceList) {
        	System.out.println(e.getnomService());
        	System.out.println(e.getDescription());
        	
        }
		return "showService";
    }

}
