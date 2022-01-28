package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.*;
import android.media.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Learn_Numbers_Activity extends AppCompatActivity {

    public void backToHome(){
        Intent intent = new Intent(this, Home_Page_Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_numbers);

        Button btn = (Button) findViewById(R.id.BackToHome);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToHome();

            }
        });

        Button
                btn1 = (Button)findViewById(R.id.one),
                btn2 = (Button)findViewById(R.id.two),
                btn3 = (Button)findViewById(R.id.three),
                btn4 = (Button)findViewById(R.id.four),
                btn5 = (Button)findViewById(R.id.five),
                btn6 = (Button)findViewById(R.id.six),
                btn7 = (Button)findViewById(R.id.seven),
                btn8 = (Button)findViewById(R.id.eight),
                btn9 = (Button)findViewById(R.id.nine),
                btn0 = (Button)findViewById(R.id.zero);

        MediaPlayer
                mp1 = MediaPlayer.create(getApplicationContext(), R.raw.one),
                mp2 = MediaPlayer.create(getApplicationContext(), R.raw.two),
                mp3 = MediaPlayer.create(getApplicationContext(), R.raw.three),
                mp4 = MediaPlayer.create(getApplicationContext(), R.raw.four),
                mp5 = MediaPlayer.create(getApplicationContext(), R.raw.five),
                mp6 = MediaPlayer.create(getApplicationContext(), R.raw.six),
                mp7 = MediaPlayer.create(getApplicationContext(), R.raw.seven),
                mp8 = MediaPlayer.create(getApplicationContext(), R.raw.eight),
                mp9 = MediaPlayer.create(getApplicationContext(), R.raw.nine),
                mp0 = MediaPlayer.create(getApplicationContext(), R.raw.zero);

        View.OnClickListener a = (ch) -> {

            switch (ch.getId()) {

                case R.id.one:   mp1.start(); break;
                case R.id.two:   mp2.start(); break;
                case R.id.three: mp3.start(); break;
                case R.id.four:  mp4.start(); break;
                case R.id.five:  mp5.start(); break;
                case R.id.six:   mp6.start(); break;
                case R.id.seven: mp7.start(); break;
                case R.id.eight: mp8.start(); break;
                case R.id.nine:  mp9.start(); break;
                case R.id.zero:  mp0.start(); break;

                default:
                    throw new IllegalStateException("Unexpected value: " + ch.getId());
            }
        };

        btn1.setOnClickListener(a);
        btn2.setOnClickListener(a);
        btn3.setOnClickListener(a);
        btn4.setOnClickListener(a);
        btn5.setOnClickListener(a);
        btn6.setOnClickListener(a);
        btn7.setOnClickListener(a);
        btn8.setOnClickListener(a);
        btn9.setOnClickListener(a);
        btn0.setOnClickListener(a);

        

    }
}