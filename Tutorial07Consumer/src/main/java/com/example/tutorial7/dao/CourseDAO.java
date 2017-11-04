package com.example.tutorial7.dao;

import java.util.List;

import com.example.tutorial7.model.CourseModel;

public interface CourseDAO {
	CourseModel selectCourse(String id);
	List<CourseModel> selectAllCourses();
}
