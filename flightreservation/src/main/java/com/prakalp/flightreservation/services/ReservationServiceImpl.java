package com.prakalp.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakalp.flightreservation.dto.ReservationRequest;
import com.prakalp.flightreservation.entites.Flight;
import com.prakalp.flightreservation.entites.Passenger;
import com.prakalp.flightreservation.entites.Reservation;
import com.prakalp.flightreservation.repos.FlightRepository;
import com.prakalp.flightreservation.repos.PassengerRepository;
import com.prakalp.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired 
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest reservationRequest) {
		
		//Make Payment
		
		Long flightId = reservationRequest.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		
		passenger.setFirstName(reservationRequest.getPassengerFirstName());
		passenger.setLastName(reservationRequest.getPassengerLastName());
		passenger.setPhone(reservationRequest.getPassengerPhone());
		passenger.setEmail(reservationRequest.getPassengerEmail());
		
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		return savedReservation;
	}

}
