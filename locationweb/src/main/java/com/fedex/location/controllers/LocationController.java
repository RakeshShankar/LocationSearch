package com.fedex.location.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fedex.location.entities.Location;
import com.fedex.location.repos.LocationRepository;
import com.fedex.location.service.LocationService;
import com.fedex.location.utils.EmailSender;
import com.fedex.location.utils.ReportImpl;

@Controller
public class LocationController {
	@Autowired
	LocationService service;

	@Autowired
	EmailSender sender;

	@Autowired
	LocationRepository repo;

	@Autowired
	ReportImpl repoImpl;

	@Autowired
	ServletContext context;

	@RequestMapping("/showCreate")
	public String getLocation() {
		return "createLocation";
	}

	@RequestMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location saveLocation = service.saveLocation(location);
		System.out.println(saveLocation);
		int n = saveLocation.getId();
		System.out.println(modelMap);
		System.out.println(n);
		String msg = "Location Saved " + n;
		modelMap.addAttribute("msg", msg);
		// sender.sendEmail("rakesh8892085@gmail.com", "Location saved from Rakesh",
		// "Hey Varun, Location saved!!!");
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
//		service.deleteLocation(service.getLocationById(id));
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";

	}

	@RequestMapping("/updateLocation")
	public String updateLocation(ModelMap modelMap, @RequestParam("id") int id) {

		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "editLocations";

	}

	@RequestMapping("/updateLoc")
	public String updateLoc(@ModelAttribute("location") Location location, ModelMap modelMap) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = context.getRealPath("/");// It will return the base path when loaded to server and saves the image in that path
		List<Object[]> data = repo.getTypeandCount();
		repoImpl.piechart(path, data);
		return "report";

	}

}
