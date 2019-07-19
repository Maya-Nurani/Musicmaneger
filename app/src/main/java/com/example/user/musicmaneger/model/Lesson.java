package com.example.user.musicmaneger.model;

import java.util.Date;

public class Lesson {

    private Long id;
    private Long studentId;
    private Long teacherId;
    private Long musicalInstrumentsId;
    private Date meetingDate;

    public Lesson(
            Long id,
            Long studentId,
            Long teacherId,
            Long musicalInstrumentsId,
            Date meetingDate
    ){
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.musicalInstrumentsId = musicalInstrumentsId;
        this.meetingDate = meetingDate;
    }

    public Lesson() {}

    public void setId (long id){
        this.id = id;
    }
    public long getId (){
        return this.id;
    }

    public void setStudentId (long studentId){
        this.studentId = studentId;
    }
    public long getStudentId (){
        return this.studentId;
    }

    public void setTeacherId (long teacherId){
        this.teacherId = teacherId;
    }
    public long getTeacherId (){
        return this.teacherId;
    }

    public void setMusicalInstrumentsId (long musicalInstrumentsId){
        this.musicalInstrumentsId = musicalInstrumentsId;
    }
    public long getMusicalInstrumentsId (){
        return this.musicalInstrumentsId;
    }

    public void setMeetingDate (Date meetingDate){
        this.meetingDate = meetingDate;
    }
    public Date getMeetingDate (){
        return this.meetingDate;
    }
}
