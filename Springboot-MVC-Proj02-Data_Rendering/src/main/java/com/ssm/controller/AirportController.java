package com.ssm.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AirportController {
	
	@RequestMapping("/")  //request path
	public String showAirportMgmt(Map<String, Object> map) {
		
		System.out.println("AirportController.showAirportMgmt()" +map.getClass());
		//model attribute to request scope
		map.put("Attribute1", "Value1");
		map.put("SystemDate", new Date());
		map.put("Counter3", "Spicejet");
		//lvn
		return "operate";
	}
}
