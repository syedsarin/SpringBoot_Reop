package com.ssm.main.service;

import java.util.List;
import java.util.Optional;

import com.ssm.main.entity.Flight;

public interface IFlightMgmtService {
	
	public String FlightInfo(Flight flight);
	
	//for inserting bulk Object data into Database
	public String FlightInfo(List<Flight> list);
	
	//For Count the Number Of Flight
	public long getFlightCount();
	
	//Check the given data is available or not
	public boolean checkFlightAvailability(Integer Id);
	
	// to get all Records From the Database Table
	public Iterable<Flight> getAllFlight();
	
	//to get Data Based On The Given Ids
	
	public Iterable<Flight> showAllFlightByIds(List<Integer> ids);
	
	//Fing The Single Record By Id
	
	//Using Optinal API To avoid Null pointer exceptions
	
	public Optional<Flight> showFlightById(Integer id);
	
	public Flight getFlightById(int id);
	
	public String fetchFlightByIs(int id);
	
	public Flight displayFlight(int id); 
	
	public String modifyFlightData(Flight flight);
	
	// Delete By Id
	
	public String deleteById(Integer id);
	
	// delete By Id Using object
	public String deleteByObj(Flight flight);
	
	//Delete All flight 
	public String deleteAllFlight();
	
	public String deleteByIdMulti(List<Integer> Ids);
}
