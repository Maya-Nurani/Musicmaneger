package com.example.user.musicmaneger.model;

import java.util.Date;

public class Lesson {

    private Long serialNumber;
    // maybe date not relavent here
    private Date meetingDate;
    private LessonDetails lessonDetailsId;

  // Create a new object for the details and connect it as a array
    //  LessonView[] lessonViews;

    public Lesson(
            Long serialNumber,
            Date meetingDate,
            LessonDetails lessonDetailsId
    ){
        this.serialNumber = serialNumber;
        this.meetingDate = meetingDate;
        this.lessonDetailsId = lessonDetailsId;
    }

    public Lesson() {}

    public void setSerialNumber (long serialNumber){
        this.serialNumber = serialNumber;
    }
    public long getserialNumber (){
        return this.serialNumber;
    }
    public void setMeetingDate (Date meetingDate){
        this.meetingDate = meetingDate;
    }
    public Date getMeetingDate (){
        return this.meetingDate;
    }
    public void setLessonDetailsId(LessonDetails lessonDetailsId){
        this.lessonDetailsId = lessonDetailsId;
    }
    public LessonDetails getLessonDetailsId (){
        return this.lessonDetailsId;
    }
}
