package com.fedex.flight.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flightuser")
public class User extends AbstractEntity{
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String firstName;
	private String lastName;
	private String email;
	private String password;
}

//CREATE TABLE USER 
//(
//ID INT NOT NULL AUTO_INCREMENT,
//FIRST_NAME VARCHAR(20),
//LAST_NAME VARCHAR(20),
//EMAIL VARCHAR(20),
//PASSWORD VARCHAR(256), 
//PRIMARY KEY (ID),
//UNIQUE KEY (EMAIL)
//);