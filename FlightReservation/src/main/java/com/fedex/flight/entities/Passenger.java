package com.fedex.flight.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends AbstractEntity{

	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phoneNumber;
}
//CREATE TABLE PASSENGER
//(
//  ID INT NOT NULL AUTO_INCREMENT,
//  FIRST_NAME VARCHAR(256),
//  LAST_NAME VARCHAR(256),
//  MIDDLE_NAME VARCHAR(256),
//  EMAIL VARCHAR(50),
//  PHONE VARCHAR(10),
//  PRIMARY KEY (ID)
//);