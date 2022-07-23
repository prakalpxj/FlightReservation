package com.prakalp.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakalp.flightreservation.entites.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {

}
