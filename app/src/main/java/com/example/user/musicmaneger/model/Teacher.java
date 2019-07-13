package com.example.user.musicmaneger.model;

public class Teacher extends User {

    public Teacher(
            Long id,
            String firstName,
            String lastName,
            String phoneNumber,

            // old variables - will be deleted after refactor on the activities
            String teacherName,
            String instrument,
            String time
    ){
        super(id, firstName, lastName, phoneNumber, teacherName, instrument, time);
    }
    public Teacher(){}

}
