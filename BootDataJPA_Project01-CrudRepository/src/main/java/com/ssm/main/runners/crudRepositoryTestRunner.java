package com.ssm.main.runners;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ssm.main.entity.Flight;
import com.ssm.main.service.IFlightMgmtService;

@Component
public class crudRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private IFlightMgmtService flightService;

	@Override
	public void run(String... args) throws Exception {

		// use Service
//		try {
//			
//			Flight f = new Flight("Boeing747", true, "UK", "Qatar Airways", 250);
//			String flightInfo = flightService.FlightInfo(f);
//			System.out.println(flightInfo);
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}      
		
		  Flight flight1 = new Flight("AirBus 380", false, "India", "Emirates", 550);
		  Flight flight2 = new Flight("AirBus 320", true, "Dubai", "Qatar Airways",
		  250); Flight flight3 = new Flight("Boeing777", true, "Saudi", "Air India",
		  440); Flight flight4 = new Flight("AirBus 380", false, "Doha",
		  "Singapur Airlines", 650); Flight flight5 = new Flight("AirBus 320", true,
		  "Turkey", "Air Oman ", 250); Flight flight6 = new Flight("Boeing777", true,
		  "France", "Indgo", 400); Flight flight7 = new Flight("AirBus 380", false,
		  "England", "Air Arbia", 500); Flight flight8 = new Flight("AirBus 320", true,
		  "UK", "Jet Airways", 350); Flight flight9 = new Flight("Boeing777", true,
		  "USA", "Fyn Air", 340); List<Flight> of = List.of(flight1,flight2, flight3,
		  flight4,flight5, flight6, flight7,flight8, flight9);
		  
		  
		  try { 
			  String flightInfo = flightService.FlightInfo(of);
		  System.out.println(flightInfo);
		  
		  } catch (Exception e) {
		  
		  e.printStackTrace(); }
		  
		  ///		try {
//		long flightCount = flightService.getFlightCount();
//		System.out.println("Flight Count: "+flightCount);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			boolean checkFlightAvailability = flightService.checkFlightAvailability(542);
//			System.out.println("Is Fligth Available: "+checkFlightAvailability);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			Iterable<Flight> allFlight = flightService.getAllFlight();
//			allFlight.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			List<Integer> of = List.of(1,52);
//			Iterable<Flight> showAllFlightByIds = flightService.showAllFlightByIds(of);
//			showAllFlightByIds.forEach(System.out::println);
//		} catch (Exception e) {
//		 e.printStackTrace();
//		}

//		try {
//			Optional<Flight> opt = flightService.showFlightById(2);
//			if (opt.isPresent()) {
//				System.out.println("Flight Number :" + opt.get());
//			} else {
//				System.out.println("Flight Not Found:");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			Flight opt= flightService.getFlightById(1);
//			System.out.println(opt);
//		}
//		catch(Exception e)
//		{
//			System.err.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
//		try {
//			String opt = flightService.fetchFlightByIs(11);
//				System.out.println(opt);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}

		/*
		 * try { Flight displayFlight = flightService.displayFlight(11);
		 * System.out.println(displayFlight);
		 * 
		 * } catch(Exception e) { //System.out.println(e.getMessage());
		 * e.printStackTrace(); }
		 */
		
		// update full or partial
		/*
		 * try { Flight f1 = new Flight(102, "ATR", false, "HYD", "AirArbia", 70);
		 * String modifyFlightData = flightService.modifyFlightData(f1);
		 * System.out.println(modifyFlightData); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */
		
		/*
		 * try { String deleteById = flightService.deleteById(1002);
		 * System.out.println(deleteById); }catch(Exception e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { Flight f1= new Flight(); f1.setFlightNumber(1); String deleteByObj =
		 * flightService.deleteByObj(f1); System.out.println(deleteByObj); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { String deleteAllFlight = flightService.deleteAllFlight();
		 * System.out.println(deleteAllFlight); } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		
		/*
		 * try { String deleteByIdMulti =
		 * flightService.deleteByIdMulti(List.of(1055,1059,1060));
		 * System.out.println(deleteByIdMulti);
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 */	}

}
