package com.fedex.flight.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "flightregistration")
public class Registration extends AbstractEntity {
	private Boolean checkedIn;
	private int numberOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	private Timestamp created;
}
//CREATE TABLE RESERVATION
//(
//  ID INT NOT NULL AUTO_INCREMENT,
//  CHECKED_IN TINYINT(1),
//  NUMBER_OF_BAGS INT,
//  PASSENGER_ID INT,
//  FLIGHT_ID INT,
//  CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//  PRIMARY KEY (ID),
//  FOREIGN KEY (PASSENGER_ID) REFERENCES PASSENGER(ID) ON DELETE CASCADE,
//  FOREIGN KEY (FLIGHT_ID) REFERENCES FLIGHT(ID)
//);
