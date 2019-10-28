package com.example.myapplication.multiscreengame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //shows the highscores

    TextView tv_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

       // tv_score = (TextView) findViewById(R.id.tv_score);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
