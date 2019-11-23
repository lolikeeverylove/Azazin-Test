package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    private TextView textView;
    private ProgressBar progressBar;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        textView=(TextView)findViewById(R.id.textView2);
        progress = (int)getIntent().getIntExtra("name",50);
        progressBar.setProgress(progress);
        textView.setText("Ты на " + progressBar.getProgress()+ "% гей");
    }
}
