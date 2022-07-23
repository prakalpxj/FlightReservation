package com.prakalp.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakalp.flightreservation.entites.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
