package com.springboot.test.test.Application.controllers;

import com.springboot.test.test.Domain.entity.Student;
import com.springboot.test.test.External.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired  // Injects StudentRepository automatically
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping("/list")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    //find student by id:
    //    public Student getStudent(){
    //        return studentRepository.findById(2).get();
    //    }

    //if id not present:
    //    public Student getStudent(){
    //        Optional<Student> student = studentRepository.findById(3);
    //        if (student.isPresent()){
    //            return student.get();
    //        }else{
    //            return new Student();
    //        }
    //    }

    @PostMapping("/Add")
    public String addStudent(){
        return "Student Added";
    }

}
