package com.adryan.helpdesk.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adryan.helpdesk.services.DbService;

@Configuration
//@Profile("test")
public class TestConfig {

	@Autowired
	private DbService dbService;
	
	@Bean
	void instanciaDB() {
		this.dbService.instanciaDB();
	}
}
