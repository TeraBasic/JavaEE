package com.example.demoSQL.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demoSQL.domain.*;
@Repository
public interface PropositionServiceDao extends JpaRepository<PropositionServiceDo, Long> {

}
