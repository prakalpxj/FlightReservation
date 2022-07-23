package com.prakalp.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakalp.flightreservation.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
