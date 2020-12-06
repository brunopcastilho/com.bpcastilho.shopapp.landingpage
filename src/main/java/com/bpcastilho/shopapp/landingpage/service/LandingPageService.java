package com.bpcastilho.shopapp.landingpage.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.bpcastilho.shopapp.landingpage.repository.LandingPageRepository;
import com.bpcastilho.shopapp.representation.ClientRepresentation;

@Service
public class LandingPageService {

	Logger logger = LoggerFactory.getLogger(LandingPageRepository.class);
	JdbcTemplate template;
	
	LandingPageRepository repository;
	@Autowired
	public LandingPageService(LandingPageRepository repository) {
		this.repository = repository;
	}
	
	public void addClientLandingPage(ClientRepresentation body) {

		logger.info("Service");
		repository.addClientLandingPage(body);
		
	}

}
