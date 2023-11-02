package com.monciego.studentlist.entity;


public class Student {

    private String firstName;
    private String lastName;

    public Student() {

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

     // Getter method for firstName
     public String getFirstName() {
        return firstName;
    }

    // Setter method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for lastName
    public String getLastName() {
        return lastName;
    }

    // Setter method for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
