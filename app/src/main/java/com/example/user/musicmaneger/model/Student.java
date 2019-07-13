package com.example.user.musicmaneger.model;

import java.util.Date;

public class Student extends User {

    private Date registrationDate;


    public Student(
            Long id,
            String firstName,
            String lastName,
            String phoneNumber,

            Date registrationDate,

            // old variables - will be deleted after refactor on the activities
            String teacherName,
            String instrument,
            String time
    ){
        super(id, firstName, lastName, phoneNumber, teacherName, instrument, time);
        this.registrationDate = registrationDate;
    }

    public Student(){}

    public void setRegistrationDate (Date registrationDate){
        this.registrationDate = registrationDate;
    }
    public Date getRegistrationDate () {
        return this.registrationDate;
    }


}
