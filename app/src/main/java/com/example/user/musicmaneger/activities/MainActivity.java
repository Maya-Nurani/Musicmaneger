package com.example.user.musicmaneger.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.musicmaneger.R;

import java.util.logging.Logger;

public class MainActivity extends Activity {

    public Logger log = Logger.getLogger("log text?");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openStudentCard = findViewById(R.id.student_card_trigger);
        openStudentCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: add popup that asking the student name\id and then we know wich student card to open
                log.info("Trigger to student card");
                Intent intent = new Intent(MainActivity.this, StudentCardActivity.class);
                startActivity(intent);

            }
        });


/*    protected void onStart (Bundle savedInstanceState){

    }*/
    }
}
