package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.*;
import android.net.Uri;
import android.os.*;
import android.view.View;
import android.widget.*;

public class Tracing_Lines_Tutorials_Activity extends AppCompatActivity {

    Button btnIdStandingLine, btnIdSleepingLine, btnIdLeftSlanted, btnIdRightSlanted, backToHomeBtn;
    VideoView videoView;
    MediaController mediaC;
    MediaPlayer mediaP;
    boolean isChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracing_lines_tutorials);

        videoView = (VideoView) findViewById(R.id.videoView);
        backToHomeBtn = (Button) findViewById(R.id.BackToHome);
        backToHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToHome();
            }
        });



        mediaC = new MediaController(this);
        mediaP = MediaPlayer.create(Tracing_Lines_Tutorials_Activity.this, R.raw.bgm);
        mediaP.start();
        mediaP.setLooping(true);

        btnIdStandingLine = (Button) findViewById(R.id.btnIdStandingLine);
        btnIdStandingLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StandingLine();
            }
        });

        btnIdSleepingLine = (Button) findViewById(R.id.btnIdSleepingLine);
        btnIdSleepingLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SleepingLine();
            }
        });

        btnIdLeftSlanted = (Button) findViewById(R.id.btnIdLeftSlanted);
        btnIdLeftSlanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeftSlantedLine();
            }
        });

        btnIdRightSlanted = (Button) findViewById(R.id.btnIdRightSlanted);
        btnIdRightSlanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightSlantedLine();
            }
        });

    }

    // Back button
    public void backToHome(){
        Intent intent = new Intent(this, Home_Page_Activity.class);
        startActivity(intent);
    }

    public void PlayPause(View v){

        if (isChecked) {
            mediaP.start();
            isChecked = false;
            mediaP.setLooping(true);
        } else {
            mediaP.pause();
            isChecked = true;
        }
    }

    public void StandingLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.standing_line;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
//        mediaP.pause();
    }

    public void SleepingLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.sleeping_line;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
//        mediaP.pause();
    }

    public void LeftSlantedLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.left_slanted;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
//        mediaP.pause();
    }

    public void RightSlantedLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.right_slanted;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
//        mediaP.pause();
    }
}