package com.ssm.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.main.entity.Flight;
import com.ssm.main.repository.IFlightSortRepo;

@Service("flightService")
public class FlightServiceImpl implements IFlightMgmtService {

	@Autowired
	private IFlightSortRepo flightRepo;

	@Override
	public String FlightInfo(Flight flight) {

		System.out.println("Flight Number" + flight.getFlightNumber());

		Flight s1 = flightRepo.save(flight);

		return "Flight Object is Saved With :" + s1.getFlightNumber();
	}

	@Override
	public String FlightInfo(List<Flight> list) {
		Iterable<Flight> saveAll = flightRepo.saveAll(list);
		return "Bulk Data Inserted " + saveAll;

	}

	@Override
	public long getFlightCount() {
		long count = flightRepo.count();

		return count;
	}

	@Override
	public boolean checkFlightAvailability(Integer id) {
		boolean existsById = flightRepo.existsById(id);
		return existsById;
	}

	@Override
	public Iterable<Flight> getAllFlight() {
		Iterable<Flight> findAll = flightRepo.findAll();
		return findAll;
	}

	@Override
	public Iterable<Flight> showAllFlightByIds(List<Integer> ids) {
		Iterable<Flight> findAllById = flightRepo.findAllById(ids);
		return findAllById;
	}

	@Override
	public Optional<Flight> showFlightById(Integer id) {

		Optional<Flight> opt = flightRepo.findById(id);

		return opt;
	}

	@Override
	public Flight getFlightById(int id) {

//		Optional<Flight> opt = flightRepo.findById(id);
//		if(opt.isPresent())
//		{
//			Flight flight = opt.get();
//			
//			return flight;
//		}
//		else {
//			throw new IllegalArgumentException("Invalid Stock");
//		}
//		
		return flightRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Flight Id"));
	}

	@Override
	public String fetchFlightByIs(int id) {
		Optional<Flight> opt = flightRepo.findById(id);

		if (opt.isPresent()) {
			Flight flight = opt.get();
			return "Flight Id :" + flight;
		} else {
			return "Invalid Flight: ";
		}

	}

	@Override
	public Flight displayFlight(int id) {
		Optional<Flight> opt = flightRepo.findById(id);
		Flight info = flightRepo.findById(id).orElse(new Flight("XXX", false, "XXX", "XXX", 0));

		return info;
	}

	@Override
	public String modifyFlightData(Flight flight) {
		Optional<Flight> opt = flightRepo.findById(flight.getFlightNumber());
		if (opt.isPresent()) {
			Flight save = flightRepo.save(flight);
			return "Full Object Modified";
		} else {
			flightRepo.save(flight);
			return "New Record Inserted";
		}
	}

	@Override
	public String deleteById(Integer id) {
		Optional<Flight> opt = flightRepo.findById(id);
		if (opt.isPresent()) {
			flightRepo.deleteById(id);
			return id + ": Record Deleted.";
		}
		else
		{
			
			return "Record Not Found.";
		}
	}

	@Override
	public String deleteByObj(Flight flight) {
		Optional<Flight> opt = flightRepo.findById(flight.getFlightNumber());
		if(opt.isPresent())
		{
			flightRepo.delete(flight);
			return flight.getFlightNumber()+": Is Deleted. ";
		}
		else {
			
			return flight.getFlightNumber()+": is Not Found.";
		}
	}

	@Override
	public String deleteAllFlight() {
		long count = flightRepo.count();
		if(count!=0 && count>0)
		{
			flightRepo.deleteAll();
			return count+": Records are Deleted. ";
		}
		else {
			return count+": Recods Found";
		}
	}

	@Override
	public String deleteByIdMulti(List<Integer> ids) {
		 List<Flight> list =(List<Flight>) flightRepo.findAllById(ids);
		 
		 flightRepo.deleteAllById(ids);
		return list.size()+": Records are Delted.";
		 
	}

}
