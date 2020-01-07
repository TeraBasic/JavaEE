package com.example.demoSQL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.example.demoSQL.service.*;
@Controller
@RequestMapping("/offer") //url

public class OfferController {

	@Autowired
    OfferService offerService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String showOfferPage(ModelMap model){
        return "offer";
    }
}
