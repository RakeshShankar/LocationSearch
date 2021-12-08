package com.fedex.flight.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flight extends AbstractEntity{
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

}
//CREATE TABLE FLIGHT
//(
//  ID INT  NOT NULL AUTO_INCREMENT,
//  FLIGHT_NUMBER VARCHAR(20)  NOT NULL, 
//  OPERATING_AIRLINES VARCHAR(20)  NOT NULL,
//  DEPARTURE_CITY VARCHAR(20)  NOT NULL,
//  ARRIVAL_CITY VARCHAR(20)  NOT NULL,
//  DATE_OF_DEPARTURE DATE  NOT NULL,
//  ESTIMATED_DEPARTURE_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
//  PRIMARY KEY (ID)
//);
