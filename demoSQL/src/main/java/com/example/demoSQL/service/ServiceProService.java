package com.example.demoSQL.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSQL.domain.ServiceProDo;

@Service
public class ServiceProService {
	@Autowired
	private ServiceProDao serviceProDao;
	
	public ServiceProDo getOneService(String id) {
		return this.serviceProDao.getOne(id);
	}
	
	public List<ServiceProDo> getAllService(){
		return this.serviceProDao.findAll();
	}
	

}
