package com.example.demoSQL.service;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoSQL.domain.UserDo;



@Service
public class LogInService {
	@Autowired
    private UserDao userDao;
	@PersistenceContext
    private EntityManager entityManager;

	
	public boolean validateUser(String id, String password) {
		//UserDo userDo = userDao.getOne(id);
		UserDo userDo = entityManager.find(UserDo.class, id);
		return userDo.getPassword().equals(password);
		//return true;
	}
	public boolean registerValid(String nom, String prenom, String telephone, String email) {
		boolean fnom=true, fprenom=true, ftelephone=true, femail=true, fid=true ;
		
		
		//check the email already exist or not
		/*UserDo userDo = entityManager.find(UserDo.class, id);
	    fid = !(userDo.getUserId().equals(id));
	    */
	   
	    //check the email format
	    String pattern1 = "^\\w+((-\\w+)|(\\.\\w+))*@\\w+(\\.\\w{2,3}){1,3}$";
		Pattern pattern = Pattern.compile(pattern1); 
		Matcher mat = pattern.matcher(email); 
	    
		if (!mat.matches()) { 
            femail = false; 
        } 
		//check telephone format
		for (int i = 0; i < telephone.length(); i++) {
            if (!Character.isDigit(telephone.charAt(i))) {
                ftelephone=false;
            }
        }
		//check nom format
		for (int i = 0; i < nom.length(); i++) {
            if (!Character.isLetter(nom.charAt(i))) {
                fnom=false;
            }
        }
		//check prenom format
		for (int i = 0; i < prenom.length(); i++) {
            if (!Character.isLetter(prenom.charAt(i))) {
                fprenom=false;
            }
        }
		
		return fnom&&fprenom&&ftelephone&&femail&&fid;
	}
	public void stockUser(UserDo ud) {
		userDao.save(ud);
	}

}
