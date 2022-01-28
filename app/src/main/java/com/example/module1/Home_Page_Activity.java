package com.example.module1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class Home_Page_Activity extends AppCompatActivity {

    Button number_btn, alphabet_btn, tutorial_btn, worksheet_btn;
    MediaPlayer mediaP;
    boolean isChecked = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

//        mediaP = MediaPlayer.create(Home_Page_Activity.this, R.raw.bgm);
//        mediaP.start();
//        mediaP.setLooping(true);

        Button
            number_btn    = (Button) findViewById(R.id.number_btn),
            alphabet_btn  = (Button) findViewById(R.id.alphabet_btn),
            tutorial_btn  = (Button) findViewById(R.id.tut_btn),
            worksheet_btn = (Button) findViewById(R.id.worksheet_btn),
            bgm           = (Button) findViewById(R.id.MusicIdPlayPause);

//        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();

//        bgm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PlayPause();
//            }
//        });

        number_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumbers();
            }
        });

        alphabet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlphabets();
            }
        });

        tutorial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTutorials();
            }
        });

        worksheet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWorksheets();
            }
        });
    }

//    public void PlayPause(){
//
//        if (!isChecked) {
//            mediaP.pause();
//            isChecked = true;
//        } else {
//            mediaP.start();
//            mediaP.setLooping(true);
//            isChecked = false;
//        }
//    }

    public void openNumbers(){
        Intent intent = new Intent(this,Learn_Numbers_Activity.class);
        startActivity(intent);
    }
    public void openAlphabets(){
        Intent intent = new Intent(this,Learn_AlphaBets_Activity.class);
        startActivity(intent);
    }
    public void openTutorials(){
        Intent intent = new Intent(this,Tutorials_Activity.class);
        startActivity(intent);
    }
    public void openWorksheets(){
        Intent intent = new Intent(this, Download_PDF_Activity.class);
//        Intent intent = new Intent(this, Worksheets_Activity.class);
        startActivity(intent);
    }
}
