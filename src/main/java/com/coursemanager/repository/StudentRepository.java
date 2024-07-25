package com.coursemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursemanager.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{

}
