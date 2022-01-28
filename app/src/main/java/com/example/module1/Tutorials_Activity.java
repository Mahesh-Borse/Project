package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.*;
import android.net.Uri;
import android.os.*;
import android.view.View;
import android.widget.*;
public class Tutorials_Activity extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        videoView = (VideoView) findViewById(R.id.videoView);
        mediaC = new MediaController(this);

        // back to home page button
        Button btn = (Button) findViewById(R.id.BackToHome);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToHome();
            }
        });

        Button btnStandingLine = (Button) findViewById(R.id.btnIdStandingLine);
        btnStandingLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StandingLine();
            }
        });

        Button btnSleepingLine = (Button) findViewById(R.id.btnIdSleepingLine);
        btnSleepingLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SleepingLine();
            }
        });

        Button btnRightSlanted = (Button) findViewById(R.id.btnIdRightSlanted);
        btnRightSlanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RightSlantedLine();
            }
        });

        Button btnLeftSlanted = (Button) findViewById(R.id.btnIdLeftSlanted);
        btnLeftSlanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LeftSlantedLine();
            }
        });
    }

    public void StandingLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.standing_line;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }

    public void SleepingLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.sleeping_line;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }

    public void LeftSlantedLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.left_slanted;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }

    public void RightSlantedLine(){
        String vidPath = "android.resource://" + getPackageName() +"/"+ R.raw.right_slanted;
        Uri uri = Uri.parse(vidPath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
    }

    public void backToHome(){
        Intent intent = new Intent(this, Home_Page_Activity.class);
        startActivity(intent);
    }


}