package com.digrii.StudentData.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digrii.StudentData.data.Student;
import com.digrii.StudentData.interfaces.StudentRepo;

@RestController
public class StudentController{
	@Autowired
	StudentRepo repo;
	
	@PostMapping(value="addStudentDetails")
	public String addStudent(@RequestBody Student student)
	{
		
		 repo.save(student);
		 
		 return "student details added";
	}

}