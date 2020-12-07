package com.bpcastilho.shopapp.landingpage.repository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Repository;

import com.bpcastilho.shopapp.representation.ClientRepresentation;

import lombok.extern.slf4j.Slf4j;

import java.sql.PreparedStatement;
import java.util.ArrayList;

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
		

		logger.info("repository - " + body.toString());
		try {
		template.update("insert into shopappdb.Client \r\n"
				+ "(name, ip, email)\r\n"
				+ "values\r\n"
				+ "(?,?,?)", body.getName(), body.getIp(), body.getEmail());
		} catch (Exception ex) {
			logger.error(ex.toString());
		}
		
		
		
		
		
	}

}
