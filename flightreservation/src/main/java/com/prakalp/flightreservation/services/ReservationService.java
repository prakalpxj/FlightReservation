package com.prakalp.flightreservation.services;

import com.prakalp.flightreservation.dto.ReservationRequest;
import com.prakalp.flightreservation.entites.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest reservationRequest);
}
