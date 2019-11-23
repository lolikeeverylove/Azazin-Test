package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//суть в том что если всё ответить я натурал то ответ будет ты гей сто процентный. Все геи так говорят. и поставить где геи целуются
//но на шкале гейства наоборот ноль будет
public class MainActivity extends AppCompatActivity {
private Button button1,button;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openActivity2();
                    }
                }
        );
//        button=(Button)findViewById(R.id.button1);
//        button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        close();
//                    }
//                });
//        final Animation a = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);//анимация)))
//        textView=(TextView)findViewById(R.id.textView2);
//        textView.startAnimation(a);
    }


    public void openActivity2(){
        Intent intent=new Intent(this, Acrivity2.class);
        MediaPlayer mp =MediaPlayer.create(this,R.raw.tema);
        mp.start();
        startActivity(intent);
    }
    public void close(){
        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
        a_builder.setMessage("Вы хотите закрыть приложение")
                .setCancelable(false)//есть ли действие отказа(у нас итак кнокпки для этого
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {//обязательно писать именно onClick
                        dialogInterface.cancel();//закрываем всплывающее окно
                    }
                });//это мы делали строитель всплывающего окна а щас создаем его само..
        AlertDialog alertDialog = a_builder.create();
        alertDialog.setTitle("Close App");
        alertDialog.show();

    }
}
