package com.example.tutorial7.service;


import java.util.List;

import com.example.tutorial7.model.CourseModel;

public interface CourseService {
	
	CourseModel selectCourse(String id);
	
	List<CourseModel> selectAllCourses();
}