package com.coursemanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coursemanager.model.Student;

@Service
public interface StudentService {
	
		List<Student> getAllStudents();
	    void save(Student employee);
	    Student getById(Long id);
	    void deleteById(long id);
}
