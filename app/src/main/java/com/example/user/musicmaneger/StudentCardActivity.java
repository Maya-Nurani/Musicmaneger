package com.example.user.musicmaneger;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;

import java.util.logging.Logger;

public class StudentCardActivity extends Activity {
    public Logger log = Logger.getLogger("log text?");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_card);

        Button backButton = findViewById(R.id.back_Button);

    }

}
