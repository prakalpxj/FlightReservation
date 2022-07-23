package com.prakalp.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakalp.flightreservation.entites.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
