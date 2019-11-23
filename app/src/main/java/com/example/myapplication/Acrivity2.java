package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Acrivity2 extends AppCompatActivity {
    private TextView textView;
    private ProgressBar progressBar;
    private Button button;
    public CheckBox checkBox,checkBox2,checkBox3,checkBox4;
    private boolean bool;
    private double progress=50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acrivity2);
        findView();//отдельно все find view by id
//        onBackPressed();
        textView.setText("Ты на " + progressBar.getProgress()+ "% гей");
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openActivity3();
                    }
                }
        );
    }
//    @Override
//    public void onBackPressed() {
//        Intent intent=new Intent(this,MainActivity.class);
//        startActivity(intent);
//    }
    public void openActivity3 (){
        Intent intent=new Intent(this, Activity3.class);
        if (checkBox.isChecked()) progress+=10;
        if (checkBox2.isChecked())progress+=5;
        if(checkBox3.isChecked())progress-=7;
        if(checkBox4.isChecked())progress-=15;
        intent.putExtra("name",progress);
        MediaPlayer mp =MediaPlayer.create(this,R.raw.tema);
        mp.start();
        startActivity(intent);
        finish();//закрывает данную активити, и при нажатии назад возвращается в мэйн активити и обнулять соответсвенно Progress Bar!!!!!
    }
    public void findView(){
        checkBox=(CheckBox)findViewById(R.id.checkBox);checkBox2=(CheckBox)findViewById(R.id.checkBox2);checkBox3=(CheckBox)findViewById(R.id.checkBox3);checkBox4=(CheckBox)findViewById(R.id.checkBox4);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        textView=(TextView)findViewById(R.id.textView2);
        button = (Button)findViewById(R.id.button2);

    }
}
