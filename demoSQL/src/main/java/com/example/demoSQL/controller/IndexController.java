package com.example.demoSQL.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String showLoginPage(ModelMap model){
		List<OfferDo> serviceList = this.offerDemandService.getAllOffer();
        model.put("serviceProList", serviceList);
        for (OfferDo e : serviceList) {
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
        return "successLogin";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String id, @RequestParam String password, HttpSession session){

        boolean isValidUser = loginService.validateUser(id, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        //登录成功, 把session的userId设为id
    	session.setAttribute("userId", id);

        model.put("username", id);
        model.put("password", password);

        return "successLogin";
    }
    
    @RequestMapping(value="creerCompte", method = RequestMethod.GET)
    public String showRegPage(ModelMap model, HttpSession session){
    	if(session.getAttribute("userId")==null) {
    		return "reg";	
    	}
    	model.put("id", session.getAttribute("userId"));
        return "successLogin";
    }
    
    @RequestMapping(value="creerCompte", method = RequestMethod.POST)
    public String creerCompte(ModelMap model,@RequestParam String userId,@RequestParam String password,@RequestParam String nom,@RequestParam String prenom,@RequestParam String pseudonyme,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String description) {
    	UserDo ud = new UserDo();
    	ud.setId(userId);
    	ud.setPassWord(password);
    	ud.setNom(nom);
    	ud.setPrenom(prenom);
    	ud.setPseudonyme(pseudonyme);
    	ud.setAddresse(adresse);
    	ud.setTelephone(telephone);
    	ud.setDescription(description);
    	this.loginService.stockUser(ud);   	
    	return "successLogin";
    }

}
