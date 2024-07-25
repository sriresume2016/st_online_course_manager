package com.coursemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coursemanager.service.impl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	@GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("studentlist", studentService.getAllStudents());
        return "index";
    }
}
