package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity3 extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button button;
    private TextView textView;
    int progress;
    private CheckBox checkBox, checkBox1,checkBox2,checkBox3;
    int prog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        findView();
        progress = (int)getIntent().getDoubleExtra("name",50);//это прогресс бар на данный момент надо еще будет прописать если <0 или >100 то чтобы присваивалось 0 или 100 соответсвенно
        progressBar.setProgress(progress);
        textView.setText("Ты на " + progressBar.getProgress()+ "% гей");
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openActivity4();
                    }
                }
        );
    }
    public void openActivity4 (){
        Intent intent=new Intent(this, Activity4.class);
//        pressCheckBoxPlus(checkBox,10);
//        pressCheckBoxMinus(checkBox,5);
//        pressCheckBoxMinus(checkBox,7);
//        pressCheckBoxMinus(checkBox,12);
        if(checkBox.isChecked()) progress+=10;
        if(checkBox1.isChecked())progress-=5;
        if(checkBox2.isChecked())progress-=7;
        if(checkBox3.isChecked())progress-=12;
        if(progress>100) progress=100;
        if(progress<0) progress=0;

        intent.putExtra("name",progress);

        MediaPlayer mp =MediaPlayer.create(this,R.raw.tema);
        mp.start();
        startActivity(intent);
        finish();
    }
    public void findView(){
        checkBox=(CheckBox)findViewById(R.id.checkBox);checkBox1=(CheckBox)findViewById(R.id.checkBox2);checkBox2=(CheckBox)findViewById(R.id.checkBox3);checkBox3=(CheckBox)findViewById(R.id.checkBox4);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        textView=(TextView)findViewById(R.id.textView2);
        button = (Button)findViewById(R.id.button2);
    }
//    public void pressCheckBoxPlus(CheckBox check,int prog){
//        if(check.isChecked()){
//            progress+=prog; }
//        if (progress>100) progress=100;
//        if(progress<0) progress=0; }
//    public void pressCheckBoxMinus(CheckBox check,int prog){
//        if(check.isChecked()){
//            progress-=prog; }
//        if (progress>100) progress=100;
//        if(progress<0) progress=0; }
}
