package com.learning.flightbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.learning.flightbooking.entity.FlightDetails;

/**
 * 
 * @author mgarg
 *
 */
public interface FlightDetailsRepository extends CrudRepository<FlightDetails, String>{
	
}