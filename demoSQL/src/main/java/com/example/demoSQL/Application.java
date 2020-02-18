package com.example.demoSQL;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoSQL.domain.OfferDo;
import com.example.demoSQL.domain.UserDo;
import com.example.demoSQL.service.OfferDao;
import com.example.demoSQL.service.UserDao;

@SpringBootApplication
@RestController
public class Application {
	@Autowired
    private UserDao userDao;
	@Autowired
	private OfferDao serviceDao;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value = "/user")
	public String creatUser() {
		UserDo userDo = new UserDo();
		userDo.setUserId("yeyey@gmail.com");
		userDo.setNom("Li");
		userDo.setPrenom("Yi");
		userDo.setPseudonyme("hehhe");
		userDo.setTelephone("123324525");
		userDo.setAdresse("46 desborde valmeir");
		userDo.setDescription("etudiant daupohie");
		userDo.setPassWord("1442424");
		userDo.setUserType("administrateur");
        userDao.save(userDo);
        
        userDo = new UserDo();
		userDo.setUserId("morui@gmail.com");
		userDo.setNom("Mo");
		userDo.setPrenom("Rui");
		userDo.setPseudonyme("nicoldas");
		userDo.setTelephone("5567666666");
		userDo.setAdresse("la defenfes");
		userDo.setDescription("hehhehehe");
		userDo.setPassWord("123456");
		userDo.setUserType("administrateur");
        userDao.save(userDo);
        
        userDo = new UserDo();
		userDo.setUserId("youyou@gmail.com");
		userDo.setNom("You");
		userDo.setPrenom("You");
		userDo.setPseudonyme("yoyoyyoy");
		userDo.setTelephone("678999");
		userDo.setAdresse("la france terre");
		userDo.setDescription("meieihehee");
		userDo.setPassWord("88888");
		userDo.setUserType("administrateur");
        userDao.save(userDo);
		
        return "user has already added";
   } 
	@RequestMapping(value = "/service")
	public String creatServiceP() {
		OfferDo serviceP = new OfferDo();
		serviceP.setCompteId("yee@dauphine.eu");
		serviceP.setNomService("Netoyer la toilette");
		serviceP.setTypeService("Service a offirir");
		serviceP.setNatureService("Nature de la service");
		serviceP.setLocalisationService("Paris");
		serviceP.setEtatService("A_VALIDER");
		String dateString = "2020-01-23"; 
	    Date date=Date.valueOf(dateString);//converting string into sql date  
		serviceP.setDateValidOffert(date);
		serviceP.setDescription("This is the first serviece");
		serviceP.setDescriptionDetail("This is the first serviece detail ");
		serviceDao.save(serviceP);
		
		serviceP = new OfferDo();
		serviceP.setCompteId("mo@dauphine.eu");
		serviceP.setNomService("Do home work");
		serviceP.setTypeService("Service a offirir");
		serviceP.setNatureService("Nature de la service");
		serviceP.setLocalisationService("Paris");
		serviceP.setEtatService("A_VALIDER");
		String dateString2 = "2020-02-24"; 
	    Date date2=Date.valueOf(dateString);//converting string into sql date  
		serviceP.setDateValidOffert(date2);
		serviceP.setDescription("This is the 2 serviece");
		serviceP.setDescriptionDetail("This is the 2 serviece detail ");
		serviceDao.save(serviceP);
		
		serviceP = new OfferDo();
		serviceP.setCompteId("yiyii@dauphine.eu");
		serviceP.setNomService("Do home work");
		serviceP.setTypeService("Service a offirir");
		serviceP.setNatureService("Nature de la service");
		serviceP.setLocalisationService("Paris");
		serviceP.setEtatService("A_VALIDER");
		String dateString3 = "2020-03-24"; 
	    Date date3=Date.valueOf(dateString);//converting string into sql date  
		serviceP.setDateValidOffert(date3);
		serviceP.setDescription("This is the 3 serviece");
		serviceP.setDescriptionDetail("This is the 3 serviece detail ");
		serviceDao.save(serviceP);				
		return "service Propose has already added";
	}
	@GetMapping(value = "/delete/{id}")
	public String login2(@PathVariable String id) {
		userDao.deleteById(id);
		return "user "+id+" has been deleted";
	}	
}
