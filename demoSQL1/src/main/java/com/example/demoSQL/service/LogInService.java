package com.example.demoSQL.service;

import java.util.Optional;

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
		return userDo.getPassWord().equals(password);
		//return true;
	}
	public void stockUser(UserDo ud) {
		userDao.save(ud);
	}

}
