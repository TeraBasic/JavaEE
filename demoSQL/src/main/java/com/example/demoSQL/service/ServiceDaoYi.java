package com.example.demoSQL.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSQL.domain.ServiceProDoYi;
import com.example.demoSQL.domain.UserDo;

@Repository
public interface ServiceDaoYi extends JpaRepository<ServiceProDoYi, String> {

}
