package com.example.demoSQL.service;

import java.util.List;
import java.util.Optional;

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
}
