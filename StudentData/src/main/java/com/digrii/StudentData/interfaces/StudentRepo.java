package com.digrii.StudentData.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digrii.StudentData.data.Student;
public interface StudentRepo extends JpaRepository<Student,Integer> {
		
}

