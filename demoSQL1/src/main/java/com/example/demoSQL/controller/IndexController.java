package com.example.demoSQL.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.LogInService;
import com.example.demoSQL.service.OfferDemandService;

@Controller
public class IndexController {
	@Autowired
	private OfferDemandService offerDemandService;
	@Autowired
    LogInService loginService;
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
    public String showService(ModelMap model){
		List<OfferDo> serviceList = this.offerDemandService.getAllOffer();
		List<DemandeDo> demandeList = this.offerDemandService.getAllDemande();
        //model.put("serviceProList", serviceList);
        //model.put("demandProList", demandeList);
		model.addAttribute("serviceProList", serviceList);
		model.addAttribute("demandProList", demandeList);
        for (OfferDo e : serviceList) {
        	System.out.println(e.getNomService());
        	System.out.println(e.getDescription());       	
        }
        for (DemandeDo e : demandeList) {
        	System.out.println(e.getnomService());
        	System.out.println(e.getDescription());       	
        }
        
		return "index";
    }
	
	@RequestMapping(value="login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model, HttpSession session){
    	if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
    	model.put("id", session.getAttribute("userId"));
        return "home";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String id, @RequestParam String password, HttpSession session){

        boolean isValidUser = loginService.validateUser(id, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    	session.setAttribute("userId", id);
        model.put("username", id);
        model.put("password", password);

        return "home";
    }
    
    @RequestMapping(value="creerCompte", method = RequestMethod.GET)
    public String showRegPage(ModelMap model, HttpSession session){
    	if(session.getAttribute("userId")==null) {
    		return "reg";	
    	}
    	model.put("id", session.getAttribute("userId"));
        return "home";
    }
    @RequestMapping(value="home", method = RequestMethod.GET)
    public String showHome(ModelMap model, HttpSession session) {
    	if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
    	model.put("id", session.getAttribute("userId"));
        return "home";
    }
    
    @RequestMapping(value="creerCompte", method = RequestMethod.POST)
    public String creerCompte(ModelMap model,@RequestParam String userId,@RequestParam String password,@RequestParam String nom,@RequestParam String prenom,@RequestParam String pseudonyme,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String description) {
    	UserDo ud = new UserDo();
    	ud.setId(userId);
    	ud.setPassWord(password);
    	ud.setNom(nom);
    	ud.setPrenom(prenom);
    	ud.setPseudonyme(pseudonyme);
    	ud.setAdresse(adresse);
    	ud.setTelephone(telephone);
    	ud.setDescription(description);
    	ud.setUserType("member");
    	this.loginService.stockUser(ud);   	
    	return "home";
    }

}
