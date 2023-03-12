package com.skilldistillery.jpalogbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.jpalogbook.data.FlightDAO;
import com.skilldistillery.jpalogbook.entities.Flight;

@Controller
public class FlightController {

@Autowired
public FlightDAO flightDao;


@RequestMapping(path={"/", "home.do"})
public String goHome() {
//	model.addAttribute("flights", flightDao.findAll());
	return "home";
}

@RequestMapping(path="viewAll.do", method = RequestMethod.GET)
 public String viewAll(Model model) {
	model.addAttribute("flight", flightDao.findAll());
	return "viewAll";
}

@RequestMapping(path="addFlight.do", method = RequestMethod.POST)
	public ModelAndView addFlight(Flight flt, RedirectAttributes redir) {
	ModelAndView mv = new ModelAndView();
	Flight createdFlight = null;
	try {
	createdFlight = flightDao.create(flt);
	}catch(RuntimeException e) {
		mv.setViewName("createError");
		return mv;
	}
	if(createdFlight != null) {
	redir.addFlashAttribute("flight", flt);
	mv.setViewName("redirect:flightAdded.do");
	return mv;
	}
	else {
		mv.setViewName("error");
		return mv;
	}
	
	
}

@RequestMapping(path="flightAdded.do", method = RequestMethod.GET)
	public ModelAndView addedFlight() {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("success");
	return mv;
}

@RequestMapping(path="getFlightById.do", method = RequestMethod.GET)
	public String getFlight(int id, Model model) {
		Flight flt = flightDao.findById(id);
		model.addAttribute("flight",flt);
		
		return "view";
}



@RequestMapping(path ="Delete.do" , method = RequestMethod.POST)
	public ModelAndView deleteFlight(int id, RedirectAttributes redir) {
	ModelAndView mv = new ModelAndView();
	boolean deleted = flightDao.deleteById(id);
	if(deleted) {
		redir.addFlashAttribute("flight", id);
		mv.setViewName("redirect:flightDeleted.do");
		return mv;
	}
	else {
		mv.setViewName("error");
		return mv;
	}
	
	}

@RequestMapping(path="flightDeleted.do", method = RequestMethod.GET)
	public String deletedFlight() {
	return "success";
}


@RequestMapping(path="update.do", method = RequestMethod.GET)
	public String updateFlight(int id, Model model) {
	model.addAttribute("flight", flightDao.findById(id));
	
	return "update";
}

@RequestMapping(path="submitUpdate.do", method = RequestMethod.POST)
	public ModelAndView update(int id, Flight flt, RedirectAttributes redir) {
	
	ModelAndView mv = new ModelAndView();
	Flight updatedFlt = flightDao.update(id, flt);
	if(updatedFlt != null) {
		redir.addFlashAttribute("flight", flt);
		mv.setViewName("redirect:flightUpdated.do");
		return mv;
	}else {
		mv.setViewName("error");
		return mv;
	}
}

@RequestMapping(path="flightUpdated.do", method = RequestMethod.GET)
	public String updatedFlt() {
	
	return "success";
}
























	
}
