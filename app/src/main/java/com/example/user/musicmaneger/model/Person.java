package com.example.user.musicmaneger.model;

import java.util.Date;

public abstract class Person
{
    Long studentID;
    String studentFirstName;
    String studentLastName;
    String studentPhoneNumber;
    Date registrationDate;
    private String teacherName;
    private String instrument;
    private String time;


    public Person(
            Long studentID,
            String studentFirstName,
            String studentLastName,
            String studentPhoneNumber,
            Date registrationDate,
            String teacherName,
            String instrument,
            String time
    ){
        this.studentID = studentID;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.registrationDate = registrationDate;

        // old
        this.teacherName = teacherName;
        this.instrument = instrument;
        this.time = time;
    }

    public Person() {}

    public String getTeacherName() {
        return teacherName;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getTime() {
        return time;
    }
}
