package com.ssm.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ssm.main.entity.Flight;

public interface IFlightSortRepo extends CrudRepository<Flight, Integer> {

	
}
