package com.example.user.musicmaneger.model;

public abstract class User
{
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    //old
    private String teacherName;
    private String instrument;
    private String time;


    public User(
            Long id,
            String firstName,
            String lastName,
            String phoneNumber,

            String teacherName,
            String instrument,
            String time
    ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;

        // old will be deleted after refactor on the activities
        this.teacherName = teacherName;
        this.instrument = instrument;
        this.time = time;
    }

    public User() {}

    public void setId (long id){
        this.id = id;
    }
    public long getId (){
        return this.id;
    }
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getFirstName (){
        return this.firstName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getLastName (){
        return this.lastName;
    }
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber (){
        return this.phoneNumber;
    }

    // TODO: check if using these methods before delete
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
