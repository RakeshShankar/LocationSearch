package com.fedex.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fedex.flight.entities.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
		
	User findByEmail(String email); 
}
