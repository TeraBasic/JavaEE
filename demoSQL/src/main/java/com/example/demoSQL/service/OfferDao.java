package com.example.demoSQL.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demoSQL.domain.OfferDo;

@Repository
public interface OfferDao extends JpaRepository<OfferDo, Long> {}