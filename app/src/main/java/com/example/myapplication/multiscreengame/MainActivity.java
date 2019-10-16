package com.example.myapplication.multiscreengame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView question1;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
        // use findViewById() to get the Button
        nextButton = (Button) findViewById(R.id.helpButton);
        question1 = (TextView) findViewById(R.id.gameTitle);

        // In question1 get the TextView use by findViewById()
        // In TextView set question Answer for message
        question1.setText("Clicking instructions button will transition you to the next screen");

        // Add_button add clicklistener
        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }
}
