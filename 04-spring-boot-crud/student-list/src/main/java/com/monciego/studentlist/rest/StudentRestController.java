package com.monciego.studentlist.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monciego.studentlist.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once!
    @PostConstruct
    public void laodData() {
    theStudents = new ArrayList<>();
        theStudents.add(new Student("Clark", "Kent"));
        theStudents.add(new Student("Bruce", "Wayne"));
        theStudents.add(new Student("Diana", "Prince"));
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("students")
    public List<Student> getStudents() {
        return theStudents;
    }

        // define endpoint as "students/{studentId}" - return student at index
    @GetMapping("students/{studentId}") 
        public Student getStudent(@PathVariable int studentId) {
            
            // index into the list

            return theStudents.get(studentId);
        }
}
