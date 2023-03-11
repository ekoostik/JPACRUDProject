package com.skilldistillery.jpalogbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpalogbook.data.FlightDAO;

@Controller
public class FlightController {

@Autowired
public FlightDAO flightDao;


@RequestMapping(path={"/", "home.do"})
public String goHome(Model model) {
	model.addAttribute("flights", flightDao.findAll());
	return "home";
}
























	
}
