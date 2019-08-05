package com.example.user.musicmaneger.data;

import com.example.user.musicmaneger.model.LessonType;
import com.example.user.musicmaneger.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class basicData {

    public static Student getStudent(){

        Student firstStudent = new Student();
        firstStudent.setId(208);
        firstStudent.setFirstName("Maya");
        firstStudent.setLastName("Nurani");
        firstStudent.setPhoneNumber("052-1212425");
        // set registration date for student
        String dateValue="01/01/2018";
        Date sDateReg= null;
        try {
            sDateReg = new SimpleDateFormat("dd/mm/yyyy").parse(dateValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        firstStudent.setRegistrationDate(sDateReg);

        // Insert lessons type for student
        ArrayList<LessonType> lessonTypesForStudent = new ArrayList<>();
        lessonTypesForStudent.add(getLessonType(1, "Matan",1));
        lessonTypesForStudent.add(getLessonType(2, "Shira",3));

        firstStudent.setLessonsTypes(lessonTypesForStudent);
        return firstStudent;
    }

    public static LessonType getLessonType(int id, String name, int MusicalInstrumentsId) {
        LessonType firstType = new LessonType();
        firstType.setId(id);
        firstType.setTeacherName(name);
        firstType.setMusicalInstrumentsId(MusicalInstrumentsId);

        return firstType;
    }

}
