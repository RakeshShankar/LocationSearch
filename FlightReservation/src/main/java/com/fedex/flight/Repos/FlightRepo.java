package com.fedex.flight.Repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fedex.flight.entities.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {
	@Query("from Flight where departureCity= :departureCity and arrivalCity = :arrivalCity and dateOfDeparture= :dateOfDeparture")
	public List<Flight> showFlightDetails(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") Date date);
}
