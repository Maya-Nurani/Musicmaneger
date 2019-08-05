package com.example.user.musicmaneger.model;

import java.util.ArrayList;
import java.util.Date;

public class Student extends User {

    private Date registrationDate;
    private ArrayList<LessonType> lessonsTypes;

    @Override
    public String toString() {
        return "Student{" +
                "registrationDate=" + registrationDate +
                ", lessonsTypes=" + lessonsTypes +
                '}';
    }


    public Student(
            Long id,
            String firstName,
            String lastName,
            String phoneNumber,
            ArrayList<LessonType> lessonsTypes,

            Date registrationDate
    ){
        super(id, firstName, lastName, phoneNumber);
        this.registrationDate = registrationDate;
        this.lessonsTypes = lessonsTypes;
    }

    public Student(){}

    public void setRegistrationDate (Date registrationDate){
        this.registrationDate = registrationDate;
    }
    public Date getRegistrationDate () {
        return this.registrationDate;
    }

    public void setLessonsTypes (ArrayList<LessonType> lessonsTypes){
        this.lessonsTypes = lessonsTypes;
    }
    public  ArrayList<LessonType> getLessonsTypes () {
        return this.lessonsTypes;
    }

}
