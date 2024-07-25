package com.coursemanager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursemanager.exception.StudentException;
import com.coursemanager.exception.StudentException.ExceptionCode;
import com.coursemanager.model.Student;
import com.coursemanager.repository.StudentRepository;
import com.coursemanager.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public Student getById(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if (optional.isPresent())
			student = optional.get();
		else
			throw new StudentException("Student not found for id : " + id, 
						ExceptionCode.STUDENT_NOT_FOUND_EXCEPTION);
		return student;
	}

	@Override
	public void deleteById(long id) {
		studentRepository.deleteById(id);
	}

}
