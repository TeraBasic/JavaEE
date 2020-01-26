package com.example.demoSQL.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.demoSQL.service.*;

@Controller
@RequestMapping("/login")
public class LogInController {

    @Autowired
    LogInService service;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model, HttpSession session){
    	if(session.getAttribute("userId")==null) {
    		return "login";	
    	}
    	model.put("id", session.getAttribute("userId"));
        return "successLogin";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String id, @RequestParam String password, HttpSession session){

        boolean isValidUser = service.validateUser(id, password);

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

}
