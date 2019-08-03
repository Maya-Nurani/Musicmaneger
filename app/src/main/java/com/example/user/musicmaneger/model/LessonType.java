package com.example.user.musicmaneger.model;

public class LessonType {

    private Long id;
//    private Long teacherId;
    private String teacherName;
    private Long musicalInstrumentsId;



    public LessonType(
            Long id,
            // Long teacherId,
            String teacherName,
            Long musicalInstrumentsId
    ){
        this.id = id;
     //   this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.musicalInstrumentsId = musicalInstrumentsId;
    }

    public LessonType() {}

    public void setId (long id){
        this.id = id;
    }
    public long getId (){
        return this.id;
    }

//    public void setTeacherId (long teacherId){
//        this.teacherId = teacherId;
//    }
//    public long getTeacherId (){
//        return this.teacherId;
//    }

        public void setTeacherName (String teacherName){
        this.teacherName = teacherName;
    }
    public String getTeacherName (){
        return this.teacherName;
    }

    public void setMusicalInstrumentsId (long musicalInstrumentsId){
        this.musicalInstrumentsId = musicalInstrumentsId;
    }
    public long getMusicalInstrumentsId (){
        return this.musicalInstrumentsId;
    }

    @Override
    public String toString() {
        return "LessonType{" +
                "id=" + id +
                ", teacherId=" + teacherName +
                ", musicalInstrumentsId=" + musicalInstrumentsId +
                '}';
    }
}
