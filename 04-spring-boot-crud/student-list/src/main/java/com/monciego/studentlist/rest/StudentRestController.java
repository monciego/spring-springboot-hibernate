package com.monciego.studentlist.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
    public void loadData() {
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

            // check the studentId list size

            if ((studentId >= theStudents.size()) || (studentId < 0)) {
                throw new StudentNotFoundException("Student " + studentId + " is not found");
            }

            return theStudents.get(studentId);
        }

        // Add an exception handler using @ExceptionHandler
        @ExceptionHandler
        public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
            // create a StudentErrorResponse
            StudentErrorResponse error = new StudentErrorResponse();
            error.setStatus(HttpStatus.NOT_FOUND.value());
            error.setMessage(exc.getMessage());
            error.setTimeStamp(System.currentTimeMillis());

            // return ResponseEntity
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
}
