package com.example.facapp;

public class Course {
    public String subjectName;
    public String subjectCode;


    public Course(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                '}';
    }
}
