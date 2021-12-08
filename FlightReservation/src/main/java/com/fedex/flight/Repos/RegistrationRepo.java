package com.fedex.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fedex.flight.entities.Registration;
@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Long> {

}
