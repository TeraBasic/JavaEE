package com.example.demoSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.UserDao;

@SpringBootApplication
@RestController
public class Application {
	@Autowired
    private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value = "/user")
	public String creatUser() {
		UserDo UserDo = new UserDo();
        UserDo.setId(1234L);
        UserDo.setName("风清扬");
        UserDo.setAccount("fengqy");
        UserDo.setPwd("123456");
        userDao.save(UserDo);
        UserDo = new UserDo();
        UserDo.setId(0002L);
        UserDo.setName("东方不败");
        UserDo.setAccount("bubai");
        UserDo.setPwd("123456");
        userDao.save(UserDo);
        UserDo.setId(0003L);
        UserDo.setName("向问天");
        UserDo.setAccount("wentian");
        UserDo.setPwd("123456");
        userDao.save(UserDo);
		
        return "user has already added";
   }
	@GetMapping(value = "/delete/{id}")
	public String login2(@PathVariable Long id) {
		userDao.deleteById(id);
		return "user "+id+" has been deleted";
	}
	


}
