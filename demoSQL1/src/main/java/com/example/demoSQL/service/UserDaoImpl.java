package com.example.demoSQL.service;

import java.util.Iterator;
import java.util.List;
 
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.UserDao;
 

@Stateless
@Remote ({UserDao.class})
public class UserDaoImpl{
	@PersistenceContext
	private EntityManager e;
	@SuppressWarnings("unchecked")
	public boolean login(String userId, String password) {
		boolean isValid = false;
		Query query = e.createQuery("from User where userId=?1 and password=?2");
		
		query.setParameter(1, userId);
		query.setParameter(2, password);
		List<UserDo> list = query.getResultList();
		if(list.isEmpty()){
			isValid = false;
		}else{
			isValid = true;
		}
		
		Iterator<UserDo> it = list.iterator();
  		while(it.hasNext()){
			UserDo u = it.next();
			if(u.getId().equals(userId) && u.getPassWord().equals(password)){
				isValid = true; 
		}
		}
		
		return isValid;
	}
}


