package com.springboot.test.test.Application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/list")
    public String getStudents(){
        return "Student List";
    }

    @PostMapping("/Add")
    public String addStudents(){
        return "Student Added";
    }

}
