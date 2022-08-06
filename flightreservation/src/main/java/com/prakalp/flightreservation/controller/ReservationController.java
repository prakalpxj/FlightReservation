package com.prakalp.flightreservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prakalp.flightreservation.dto.ReservationRequest;
import com.prakalp.flightreservation.entites.Flight;
import com.prakalp.flightreservation.entites.Reservation;
import com.prakalp.flightreservation.repos.FlightRepository;
import com.prakalp.flightreservation.services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		Flight flight = flightRepository.findById(flightId).get();
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping(value = "/completeReservation", method=RequestMethod.POST)
	public String showCompleteReservation(ReservationRequest request, ModelMap modelMap) {
	
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Booked flight with flight id " + reservation.getId());		
		
		return "reservationConfirmation";
	}
}
