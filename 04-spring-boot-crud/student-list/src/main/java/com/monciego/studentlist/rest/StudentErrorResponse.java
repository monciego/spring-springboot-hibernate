package com.monciego.studentlist.rest;

public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;

    public StudentErrorResponse() {

    }

    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    // Getter method for 'status'
    public int getStatus() {
        return status;
    }
    
    // Setter method for 'status'
    public void setStatus(int status) {
        this.status = status;
    }
    
    // Getter method for 'message'
    public String getMessage() {
        return message;
    }
    
    // Setter method for 'message'
    public void setMessage(String message) {
        this.message = message;
    }
    
    // Getter method for 'timeStamp'
    public long getTimeStamp() {
        return timeStamp;
    }
    
    // Setter method for 'timeStamp'
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
