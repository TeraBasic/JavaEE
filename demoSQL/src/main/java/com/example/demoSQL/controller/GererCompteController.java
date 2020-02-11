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

public class GererCompteController {
	
	
	@Autowired
    GererCompteService gererCompte;
	@RequestMapping(value="modifierCompte", method = RequestMethod.GET)
	public String showModifieComptePage(ModelMap model, HttpSession session){
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
    	}
		model.put("id", session.getAttribute("userId"));
		return "modifierCompte";
    }
	@RequestMapping(value="afficheCompteInfo", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model, HttpSession session){
		String id= (String) session.getAttribute("userId");
		UserDo userCompte = this.gererCompte.getOneUser(id);
		
        model.put("userCompte", userCompte);
        
		return "afficheCompteInfo";
    }
	@RequestMapping(value="modifieCompteSuccess", method = RequestMethod.POST)
    public String creerCompte(ModelMap model,HttpSession session, @RequestParam String nom,@RequestParam String prenom,@RequestParam String pseudonyme,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String description) {
    	UserDo ud = new UserDo();
    	String id= (String) session.getAttribute("userId");
    	ud.setId(id);
    	ud.setNom(nom);
    	ud.setPrenom(prenom);
    	ud.setPseudonyme(pseudonyme);
    	ud.setAdresse(adresse);
    	ud.setTelephone(telephone);
    	ud.setDescription(description);
    	
    	this.gererCompte.updateUser(ud);   	
    	return "modifieCompteSuccess";
    }

}
