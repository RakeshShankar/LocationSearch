package com.fedex.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedex.location.entities.Location;
import com.fedex.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository repository;
	
	

	@Override
	public Location saveLocation(Location location) {
		System.out.println(location);
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		return repository.findById(id).get();

	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

}