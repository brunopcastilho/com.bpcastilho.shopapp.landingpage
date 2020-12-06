package com.bpcastilho.shopapp.landingpage.repository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bpcastilho.shopapp.representation.ClientRepresentation;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Repository
@Slf4j
public class LandingPageRepository {

	Logger logger = LoggerFactory.getLogger(LandingPageRepository.class);
	JdbcTemplate template;
	
	@Autowired
	public LandingPageRepository(JdbcTemplate template) {
		this.template = template;
	}
	
	public void addClientLandingPage(ClientRepresentation body) {
		//template.
		
		logger.info("Repository");
		
		
		
	}

}
