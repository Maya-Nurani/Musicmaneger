package com.example.user.musicmaneger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends Activity {

    public Logger log = Logger.getLogger("log text?");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // NOTE: About to wire up the buttons
        Button button2 = findViewById(R.id.seconed_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log.info("toast display after click on button");
                Toast.makeText(getApplicationContext(), "I did something!", Toast.LENGTH_LONG).show();
            }
        });

        Button card = findViewById(R.id.student_card_trigger);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                log.info("Trigger to student card");
                Intent intent = new Intent(MainActivity.this, StudentCardActivity.class);
                startActivity(intent);

            }
        });

/*    protected void onStart (Bundle savedInstanceState){

    }*/
    }
}
