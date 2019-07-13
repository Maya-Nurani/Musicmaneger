package com.example.user.musicmaneger.model;

public abstract class User
{
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public User(
            Long id,
            String firstName,
            String lastName,
            String phoneNumber
    ){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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

}
