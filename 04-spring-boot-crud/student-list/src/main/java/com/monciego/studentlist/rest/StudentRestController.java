package com.monciego.studentlist.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monciego.studentlist.entity.Student;

@RestController
@RequestMapping("api")
public class StudentRestController {
    // define endpoint for "/students" - returna list of students
    @GetMapping("students")
public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Clark", "Kent"));
        theStudents.add(new Student("Bruce", "Wayne"));
        theStudents.add(new Student("Diana", "Prince"));
        
        return theStudents;
    }
}
