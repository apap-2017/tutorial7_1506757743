package com.example.tutorial7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tutorial7.model.CourseModel;
import com.example.tutorial7.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseDAO;
	
	@RequestMapping("/course/view/{id}")
	public String viewCourse(Model model, @PathVariable(value = "id") String id) {
		
		CourseModel course = courseDAO.selectCourse(id);
		
		if(course != null) {
			model.addAttribute("course", course);
			return "view-course";
		} else {
			return "not-found";
		}
	}

}
