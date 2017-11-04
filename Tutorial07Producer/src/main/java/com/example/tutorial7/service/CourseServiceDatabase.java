package com.example.tutorial7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorial7.dao.CourseMapper;
import com.example.tutorial7.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService {
	
	@Autowired
	CourseMapper courseMapper;
	
	@Override
	public CourseModel selectCourse(String id) {
		log.info ("select course with id {}", id);
        return courseMapper.selectCourse(id);
	}

	@Override
	public List<CourseModel> selectAllCourses() {
		log.info("select all courses");
		return courseMapper.selectAllCourses();
	}

}
