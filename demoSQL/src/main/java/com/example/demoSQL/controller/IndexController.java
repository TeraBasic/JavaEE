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

import com.example.demoSQL.domain.AcceptionServiceDo;
import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.PropositionServiceDo;
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.ContractService;
import com.example.demoSQL.service.LogInService;
import com.example.demoSQL.service.OfferDemandService;

@Controller
public class IndexController {
	@Autowired
	private OfferDemandService oDServiece;
	@Autowired
    LogInService loginService;
	@Autowired
	ContractService conser;
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
    public String showService(ModelMap model){
		List<OfferDo> serviceList = this.oDServiece.getAllOffer();
		List<DemandeDo> demandeList = this.oDServiece.getAllDemande();
		model.addAttribute("serviceProList", serviceList);
		model.addAttribute("demandProList", demandeList);
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
    	String userCompte = session.getAttribute("userId").toString();
    	model.put("id", userCompte);
    	model.addAttribute("demandList", this.oDServiece.getAllDemandOneUser(userCompte));
    	model.addAttribute("offerList", this.oDServiece.getAllOfferOneUser(userCompte));
    	
    	System.out.println(this.oDServiece.getAllDemandOneUser(userCompte).size());
    	System.out.println(this.oDServiece.getAllOfferOneUser(userCompte).size());
        return "home";
    }
    
    @RequestMapping(value="creerCompte", method = RequestMethod.POST)
    public String creerCompte(ModelMap model,@RequestParam String userId,@RequestParam String password,@RequestParam String nom,@RequestParam String prenom,@RequestParam String pseudonyme,@RequestParam String adresse,@RequestParam String telephone,@RequestParam String description) {
    	boolean registerValid = loginService.registerValid(nom, prenom,telephone,userId);
    	if (!registerValid) {
             model.put("errorMessage", "information input error");
             return "reg";
        }
    	UserDo ud = new UserDo();
    	ud.setUserId(userId);
    	ud.setPassword(password);
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
    
    @RequestMapping(value="notification", method = RequestMethod.GET)
    public String showNotification(ModelMap model, HttpSession session) {
    	if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
    	
    	List<PropositionServiceDo> listPro = conser.getPrositions(session.getAttribute("userId").toString());
    	List<AcceptionServiceDo> listAcc = conser.getAcception(session.getAttribute("userId").toString());
    	model.addAttribute("listpropositionService", listPro);
    	model.addAttribute("listAcc", listAcc);
    	
        return "notification";
    }
    

}
