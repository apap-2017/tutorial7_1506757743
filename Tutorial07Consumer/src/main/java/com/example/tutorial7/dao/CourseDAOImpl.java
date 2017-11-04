package com.example.tutorial7.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.tutorial7.model.CourseModel;

@Service
public class CourseDAOImpl implements CourseDAO{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public CourseModel selectCourse(String id) {
		CourseModel course = restTemplate.getForObject("http://localhost:8080/rest/course/view/" + id, CourseModel.class);
		return course;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseModel> selectAllCourses() {
		List<CourseModel> courses = restTemplate.getForObject("http://localhost:8080/rest/course/viewall", List.class);
		return courses;
	}	
}