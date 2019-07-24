package com.example.user.musicmaneger.model;

public class LessonType {

    private Long id;
    private Long studentId;
    private Long teacherId;
    private Long musicalInstrumentsId;

    public LessonType(
            Long id,
            Long studentId,
            Long teacherId,
            Long musicalInstrumentsId
    ){
        this.id = id;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.musicalInstrumentsId = musicalInstrumentsId;
    }

    public LessonType() {}

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
}
