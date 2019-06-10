package com.learning.flightbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.flightbooking.entity.FlightDetails;
import com.learning.flightbooking.repository.FlightDetailsRepository;

//https://dzone.com/articles/spring-boot-with-spring-data-jpa
//https://github.com/sameerean/flight-booking

@Service
public class FlightBookingService {

	@Autowired
	FlightDetailsRepository flightRepository;
	
	
	public void addFlightDetails(FlightDetails flightDetails){
		flightRepository.save(flightDetails);
	}
	
	
}
