package com.example.user.musicmaneger.model;

public class Person
{
    private String teacherName;
    private String instrument;
    private String time;

    public Person(String teacherName, String instrument, String time) {
        this.teacherName = teacherName;
        this.instrument = instrument;
        this.time = time;
    }

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
