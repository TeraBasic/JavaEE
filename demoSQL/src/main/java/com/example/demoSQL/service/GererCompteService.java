package com.example.demoSQL.service;

import java.util.List;
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
public class GererCompteService {
	@Autowired
    private UserDao userDao;
	@PersistenceContext
    private EntityManager entityManager;

	public void updateUser(UserDo ud) {
		userDao.saveAndFlush(ud);
	}
	public UserDo getOneUser(String id) {
		return this.userDao.getOne(id);
	}
	
	public List<UserDo> getAllUser(){
		return this.userDao.findAll();
	}
	public boolean modifieValid(String telephone) {
		boolean ftelephone=true;
		
		for (int i = 0; i < telephone.length(); i++) {
            if (!Character.isDigit(telephone.charAt(i))) {
                ftelephone=false;
            }
		}
		return ftelephone;
		
	}
}
