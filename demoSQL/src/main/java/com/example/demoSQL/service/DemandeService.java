package com.example.demoSQL.service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.DemandeDo;


@Service
public class DemandeService {
	@Autowired
    private DemandeDao demandeDao;
	@PersistenceContext
    private EntityManager entityManager;

	
	public void stockDemande(DemandeDo ud) {
		demandeDao.save(ud);
	}
	
	public static boolean checkDate(String dateString) {
		if(dateString==null||dateString.equals("")) {
			return true;
		}
		
		// check date format
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        // Input to be parsed should strictly follow the defined date format
        // above.
        format.setLenient(false);

        try {
            format.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Date " + dateString + " is not valid according to " +
                ((SimpleDateFormat) format).toPattern() + " pattern.");
            return false;
        }
		
		boolean flagDate = true;
		
		
		Date date=Date.valueOf(dateString);
		// check if the date is before today
		long millis=System.currentTimeMillis();
		java.sql.Date currentDate=new java.sql.Date(millis);
		
		if(currentDate.compareTo(date) >= 0) {
	         System.out.println("Date 1 occurs before Date 2");
	         flagDate = false;
	    }

		return flagDate;
	}

}
