package com.example.demoSQL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.service.DemandeDao;
import com.example.demoSQL.service.OfferDao;

@Component
public class Scheduler {
	@Autowired
	private OfferDao offerDao;
	@Autowired
	private DemandeDao demandeDao;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 /**
     * execute 23:59:59
     */
    @Scheduled(cron = "59 59 23 * * ?")
    public void checkEveryDay(){
    	
    	logger.info("Execute every day begin....");
    	long millis=System.currentTimeMillis();
		java.sql.Date currentDate=new java.sql.Date(millis);
		
    	for(DemandeDo dd : demandeDao.findAll()) {
    		if(dd.getDateValidDemande().before(currentDate)) {
    			dd.setEtatService("OBSOLETE");
    			demandeDao.saveAndFlush(dd);
    		}
    	}
    	
    	for(OfferDo od : offerDao.findAll()) {
    		if(od.getDateValidOffert().before(currentDate)) {
    			od.setEtatService("OBSOLETE");
    			offerDao.saveAndFlush(od);
    			
    		}
    	}
		logger.info("Execute every day end !");
    }


}
