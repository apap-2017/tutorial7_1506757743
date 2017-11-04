package com.example.tutorial7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.tutorial7.dao.CourseDAO;
import com.example.tutorial7.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class CourseServiceRest implements CourseService {

	@Lazy
	@Autowired
	private CourseDAO courseDAO;

	@Override
	public CourseModel selectCourse(String id) {
		log.info("REST - select course with id {}", id);
		return courseDAO.selectCourse(id);
	}

	@Override
	public List<CourseModel> selectAllCourses() {
		log.info("REST - select all courses");
		return courseDAO.selectAllCourses();
	}

}
