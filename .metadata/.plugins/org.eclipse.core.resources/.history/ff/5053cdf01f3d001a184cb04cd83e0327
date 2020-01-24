package com.example.demoSQL.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoSQL.domain.UserDo;

@Service
public class LogInService {
	@Autowired
    private UserDao userDao;
	
	public String  register(User user) {
        if (userDao.getOneUser(user.getUsername()) == null) {
            userDao.setOneUser(user);
            return True;
        }
        else {
            return False;
        }
    }
	
	public boolean validateUser(String username, String password) {
		UserDo userDo = userDao.getOne(username);
		if (dbUser == null) {
            return False;
        }
		return userDo.getPwd().equals(password);
		user.setusername(dbUser.getId());
            user.setCreateTime(userDo.getCreateTime());
            return "Login success";
		
	}

}
