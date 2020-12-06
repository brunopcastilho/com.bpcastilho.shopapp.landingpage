package com.bpcastilho.shopapp.landingpage.restApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.bpcastilho.shopapp.api.AddClientLandingPageApi;
import com.bpcastilho.shopapp.landingpage.repository.LandingPageRepository;
import com.bpcastilho.shopapp.landingpage.service.LandingPageService;
import com.bpcastilho.shopapp.representation.ClientRepresentation;

@RestController
public class LandingPageAPI implements AddClientLandingPageApi
{
	
	Logger logger = LoggerFactory.getLogger(LandingPageRepository.class);
	JdbcTemplate template;
	
	@Autowired
	LandingPageService service;
	public LandingPageAPI(LandingPageService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<Void> addClientLandingPage(ClientRepresentation body) {

		logger.info("api");
		
		service.addClientLandingPage(body);
		return null;
		
	}

}
