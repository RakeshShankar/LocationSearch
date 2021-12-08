package com.fedex.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fedex.flight.entities.Passenger;
@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
