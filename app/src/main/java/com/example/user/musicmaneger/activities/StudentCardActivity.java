package com.example.user.musicmaneger.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.musicmaneger.R;
import com.example.user.musicmaneger.model.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Date;
import java.text.SimpleDateFormat;

public class StudentCardActivity extends Activity {
    public Logger log = Logger.getLogger("log text?");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_card);

        Button backButton = findViewById(R.id.back_Button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.info("Trigger to student card");
                Intent intent = new Intent(StudentCardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

       ArrayList<Student> studentList = new ArrayList<>();
        Student studentTest = new Student();
        studentTest.setId(123);
        studentTest.setFirstName("Maya");
        studentTest.setLastName("Nurani");
        studentTest.setPhoneNumber("052-1212425");
        // set registration date for student
        String dateValue="01/01/2018";
        Date sDateReg= null;
        try {
            sDateReg = new SimpleDateFormat("dd/mm/yyyy").parse(dateValue);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        studentTest.setRegistrationDate(sDateReg);

        studentList.add(studentTest);
        log.info("print first student: " + studentList.get(0));


        TextView teacherName = findViewById(R.id.teacher_name_value);
        TextView instrument = findViewById(R.id.musical_instruments_value);
        TextView time = findViewById(R.id.Play_time_value);

       // teacherName.setText(maya.getTeacherName());
        teacherName.setText(studentList.get(0).getTeacherName());
        instrument.setText(studentTest.getInstrument());
        time.setText(studentList.get(0).getTime());
    }

}
