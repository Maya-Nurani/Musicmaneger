package com.example.user.musicmaneger.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.user.musicmaneger.R;
import com.example.user.musicmaneger.adapter.LessonsTypeAdapter;
import com.example.user.musicmaneger.data.basicData;
import com.example.user.musicmaneger.helper.Constants;
import com.example.user.musicmaneger.model.LessonType;
import com.example.user.musicmaneger.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;

public class StudentCardActivity extends Activity {
    public Logger log = Logger.getLogger("log text");
    private ListView lessonsTypeView;
    private ArrayAdapter lessonsTypeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_card);

        Button backButton = findViewById(R.id.back_Button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.info("Trigger back to previous activity - home page");
                Intent intent = new Intent(StudentCardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(basicData.getStudent());
        Student test = studentList.get(0);
        log.info(test.toString());
        System.out.println(test.toString());
        log.info("print first student: " + studentList.get(0).toString());

        // TODO export insert student to textview in a method out of the class
        // TODO student id should not visible for the user
        TextView studentIdValue = findViewById(R.id.student_id_value);
        //   studentIdValue.setText(basicData.getStudent().getId());

        TextView studentFirstNameValue = findViewById(R.id.student_first_name_value);
        studentFirstNameValue.setText(basicData.getStudent().getFirstName());

        TextView studentLastNameValue = findViewById(R.id.student_last_name_value);
        studentLastNameValue.setText(basicData.getStudent().getLastName());

        TextView studentPhoneNumberValue = findViewById(R.id.student_phone_number_value);
        studentPhoneNumberValue.setText(basicData.getStudent().getPhoneNumber());

        TextView studentRegistrationDate = findViewById(R.id.registration_date_value);
        studentRegistrationDate.setText(basicData.getStudent().getRegistrationDate().toString());

//         NOTE: About to wire up the buttons
        Button editButton = findViewById(R.id.edit_button);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log.info("Button for edit student details, not working yet");
                Toast.makeText(getApplicationContext(), "Sorry this button currently not working", Toast.LENGTH_LONG).show();
            }
        });

        ArrayList<LessonType> lessonTypesForStudent = basicData.getStudent().getLessonsTypes();
        log.info("print list of types: " + lessonTypesForStudent);


        log.info("print musicalInstruments: " + Constants.getHmapType().get(2));

        // list of lesson type for a student
        lessonsTypeView = findViewById(R.id.lesson_types_list_view);
       // lessonsTypeView = (ListView) findViewById(R.id.lesson_types_list_view);


        // lessonsTypeAdapter = new ArrayAdapter(this, R.layout.activity_item_view, lessonTypesForStudent);
        lessonsTypeAdapter = new LessonsTypeAdapter(this,R.layout.activity_item_view, lessonTypesForStudent);


        if (lessonsTypeView != null) {
            lessonsTypeView.setAdapter(lessonsTypeAdapter);
        }

        lessonsTypeView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Button item = findViewById(R.id.student_card_trigger);
//                item.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {

                        Intent intent = new Intent(view.getContext(), LessonsListPerTypeActivity.class);
                      //   intent.putExtra("Lesson type position", lessonsTypeView.getItemAtPosition(position).toString());
                        startActivity(intent);
                    }
                });
            }
     //   });
    }