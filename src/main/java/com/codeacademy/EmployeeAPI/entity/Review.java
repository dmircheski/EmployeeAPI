package com.codeacademy.EmployeeAPI.entity;

public class Review {
    private String studentName;
    private int rating;

    public Review(String studentName, int rating) {
        this.studentName = studentName;
        this.rating = rating;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
