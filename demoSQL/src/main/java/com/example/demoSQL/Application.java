package com.example.demoSQL;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoSQL.domain.ServiceProDoYi;
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.ServiceDaoYi;
import com.example.demoSQL.service.UserDao;

@SpringBootApplication
@RestController
public class Application {
	@Autowired
    private UserDao userDao;
	@Autowired
	private ServiceDaoYi serviceDao;
	
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
	@RequestMapping(value = "/service")
	public String creatServiceP() {
		ServiceProDoYi serviceP = new ServiceProDoYi();
		serviceP.setCompteId(10001L);
		serviceP.setnomService("Netoyer la toilette");
		serviceP.setTypeService("Service a offirir");
		serviceP.setNatureService("Nature de la service");
		serviceP.setLocalisationService("Paris");
		serviceP.setEtatService("A valider");
		String dateString = "2020-01-23"; 
	    Date date=Date.valueOf(dateString);//converting string into sql date  
		serviceP.setDateValideOffert(date);
		serviceDao.save(serviceP);
		
		serviceP = new ServiceProDoYi();
		serviceP.setCompteId(10002L);
		serviceP.setnomService("Do home work");
		serviceP.setTypeService("Service a offirir");
		serviceP.setNatureService("Nature de la service");
		serviceP.setLocalisationService("Paris");
		serviceP.setEtatService("A valider");
		String dateString2 = "2020-02-24"; 
	    Date date2=Date.valueOf(dateString);//converting string into sql date  
		serviceP.setDateValideOffert(date2);
		serviceDao.save(serviceP);
		
		serviceP = new ServiceProDoYi();
		serviceP.setCompteId(10003L);
		serviceP.setnomService("Do home work");
		serviceP.setTypeService("Service a offirir");
		serviceP.setNatureService("Nature de la service");
		serviceP.setLocalisationService("Paris");
		serviceP.setEtatService("A valider");
		String dateString3 = "2020-03-24"; 
	    Date date3=Date.valueOf(dateString);//converting string into sql date  
		serviceP.setDateValideOffert(date3);
		serviceDao.save(serviceP);
		
		
		return "service Propose has already added";
	}
	@GetMapping(value = "/delete/{id}")
	public String login2(@PathVariable Long id) {
		userDao.deleteById(id);
		return "user "+id+" has been deleted";
	}	
}
