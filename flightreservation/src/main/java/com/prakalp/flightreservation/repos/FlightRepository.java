package com.prakalp.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.prakalp.flightreservation.entites.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where arrivalCity=:arrivalCity and departureCity = :departureCity and dateOfDeparture = :dateOfDeparture")
	List<Flight> findFlights(@Param ("departureCity") String to, @Param ("arrivalCity") String from, @Param ("dateOfDeparture") Date date);

}
