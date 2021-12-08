package com.fedex.flight.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fedex.flight.Repos.UserRepo;
import com.fedex.flight.entities.User;

@Controller
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@RequestMapping("/regPage")
	public String showRegPage() {
		return "login/registration";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		System.out.println("user -->" + user.toString());
		userRepo.save(user);
		System.out.println("User saved" + user.toString());
		return "login/login";
	}

	@RequestMapping(value = "/searchFlights", method = RequestMethod.POST)
	public String validateUser(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		User user = userRepo.findByEmail(email);
		String msg = "invalid credentials";
		System.out.println("User in Validate user " + user);
		if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
			System.out.println("Inside if " + user.getEmail() + user.getPassword());
			return "login/searchFlights";
		} else {
			System.out.println("Inside else" + user.getEmail() + user.getPassword());
			modelMap.addAttribute("msg", msg);
			return "login/login";
		}
	}

}
