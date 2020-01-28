package com.example.demoSQL.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSQL.domain.DemandeDo;
import com.example.demoSQL.domain.UserDo;

@Repository
public interface DemandeDao extends JpaRepository<DemandeDo, Long> {

}
