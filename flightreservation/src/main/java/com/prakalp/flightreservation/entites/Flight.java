package com.prakalp.flightreservation.entites;

import java.sql.Timestamp;
import java.util.Date;

public class Flight {
	private Long id;
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private Date arrivalCity;
	private Timestamp estimatedDepartureTime;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public Date getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(Date arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	
	
}
