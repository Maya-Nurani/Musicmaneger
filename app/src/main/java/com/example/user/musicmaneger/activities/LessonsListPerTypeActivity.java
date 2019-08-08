package com.example.user.musicmaneger.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.user.musicmaneger.R;

import java.util.logging.Logger;

public class LessonsListPerTypeActivity extends Activity {
    public Logger log = Logger.getLogger("log text");
    private ArrayAdapter lessonsTypeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_list_per_type);

        Button backButton = findViewById(R.id.back_Button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.info("Trigger back to previous activity - student card");
                Intent intent = new Intent(LessonsListPerTypeActivity.this, StudentCardActivity.class);
                startActivity(intent);
            }
        });
    }
}