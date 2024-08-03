package com.ssm.main.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ssm.main.service.IFlightMgmtService;
@Component
public class SortTestRunner implements CommandLineRunner {

	@Autowired
	IFlightMgmtService flightService;
	
	@Override
	public void run(String... args) throws Exception {
		
		 
		
	}

}
