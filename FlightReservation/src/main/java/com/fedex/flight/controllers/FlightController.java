package com.fedex.flight.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fedex.flight.Repos.FlightRepo;
import com.fedex.flight.entities.Flight;

@Controller
public class FlightController {
	@Autowired
	FlightRepo flightRepo;

	@RequestMapping("/listOfFlights")
	public String showFlightDetails(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("date") @DateTimeFormat(pattern = "MM-dd-yyyy") Date date,ModelMap modelMap) {
		System.out.println("inside list of flights ()");
		List<Flight> flights = flightRepo.showFlightDetails(from, to, date);
		for (Flight flight : flights) {
			System.out.println("inside flight loop");
			System.out.println(flight);
		}
		modelMap.addAttribute("flights",flights);
		return "showPassengerDetails";

	}

}
