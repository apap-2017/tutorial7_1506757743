package com.example.tutorial7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.tutorial7.dao.StudentMapper;
import com.example.tutorial7.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
	@Bean
	public RestTemplate restTempalte() {
		return new RestTemplate();
	}
	
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("select student with npm {}", npm);
        return studentMapper.selectStudent (npm);
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public void addStudent (StudentModel student)
    {
        studentMapper.addStudent (student);
    }


    @Override
    public void deleteStudent (String npm)
    {
    	log.info("student " + npm + " deleted" );
    	studentMapper.deleteStudent(npm);
    }


	@Override
	public void updateStudent(StudentModel student) {
		log.info("student " + student.getNpm() + " updated") ;
		studentMapper.updateStudent(student);
	}
    
    

}
