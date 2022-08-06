package com.prakalp.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakalp.flightreservation.dto.ReservationUpdateRequest;
import com.prakalp.flightreservation.entites.Reservation;
import com.prakalp.flightreservation.repos.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRESTController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable ("id") Long id) {
		Reservation reservation = reservationRepository.findById(id).get();
		
		return reservation;
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		
		return reservationRepository.save(reservation);
	
	}
}
