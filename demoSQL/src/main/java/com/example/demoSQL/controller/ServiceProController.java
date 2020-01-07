package com.example.demoSQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoSQL.domain.ServiceProDo;
import com.example.demoSQL.service.ServiceProService;

@Controller
@RequestMapping("/servicePro")
public class ServiceProController {
	@Autowired
	private ServiceProService serviceProService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
		List<ServiceProDo> serviceList = this.serviceProService.getAllService();
        model.put("serviceProList", serviceList);
        for (ServiceProDo e : serviceList) {
        	System.out.println(e.getnomService());
        	System.out.println(e.getDescription());
        	
        }
		return "index";
    }

}