package com.example.user.musicmaneger.model;

import java.util.Date;

public class Student extends Person {

    Date registrationDate;

    public Student( Date registrationDate){
        this.registrationDate = registrationDate;
    }

    public String getStudentName() {
        return (studentFirstName + ' ' + studentLastName);
    }



}
