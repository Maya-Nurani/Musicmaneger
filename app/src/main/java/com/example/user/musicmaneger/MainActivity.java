package com.example.user.musicmaneger;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.logging.Logger;

public class MainActivity extends Activity {
    public Button button2;
    public Logger log = Logger.getLogger("log text?");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // NOTE: About to wire up the buttons
        button2 = findViewById(R.id.seconed_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                log.info("toast display after click on button");
                Toast.makeText(getApplicationContext(),"I did something!" , Toast.LENGTH_LONG).show();
            }
        });
    }

/*    protected void onStart (Bundle savedInstanceState){

    }*/
}
