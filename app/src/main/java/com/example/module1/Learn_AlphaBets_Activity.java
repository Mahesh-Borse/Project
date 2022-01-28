package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.media.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Learn_AlphaBets_Activity extends AppCompatActivity {

    public void backToHome(){
        Intent intent = new Intent(this, Home_Page_Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_alpha_bets);

        Button btn = (Button) findViewById(R.id.BackToHome);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToHome();
            }
        });

        Button
            btn_A = (Button)findViewById(R.id.a),
            btn_B = (Button)findViewById(R.id.b),
            btn_C = (Button)findViewById(R.id.c),
            btn_D = (Button)findViewById(R.id.d),
            btn_E = (Button)findViewById(R.id.e),
            btn_F = (Button)findViewById(R.id.f),
            btn_G = (Button)findViewById(R.id.g),
            btn_H = (Button)findViewById(R.id.h),
            btn_I = (Button)findViewById(R.id.i),
            btn_J = (Button)findViewById(R.id.j),
            btn_K = (Button)findViewById(R.id.k),
            btn_L = (Button)findViewById(R.id.l),
            btn_M = (Button)findViewById(R.id.m),
            btn_N = (Button)findViewById(R.id.n),
            btn_O = (Button)findViewById(R.id.o),
            btn_P = (Button)findViewById(R.id.p),
            btn_Q = (Button)findViewById(R.id.q),
            btn_R = (Button)findViewById(R.id.r),
            btn_S = (Button)findViewById(R.id.s),
            btn_T = (Button)findViewById(R.id.t),
            btn_U = (Button)findViewById(R.id.u),
            btn_V = (Button)findViewById(R.id.v),
            btn_W = (Button)findViewById(R.id.w),
            btn_X = (Button)findViewById(R.id.x),
            btn_Y = (Button)findViewById(R.id.y),
            btn_Z = (Button)findViewById(R.id.z);


        MediaPlayer
            MP_A = MediaPlayer.create(getApplicationContext(), R.raw.a),
            MP_B = MediaPlayer.create(getApplicationContext(), R.raw.b),
            MP_C = MediaPlayer.create(getApplicationContext(), R.raw.c),
            MP_D = MediaPlayer.create(getApplicationContext(), R.raw.d),
            MP_E = MediaPlayer.create(getApplicationContext(), R.raw.e),
            MP_F = MediaPlayer.create(getApplicationContext(), R.raw.f),
            MP_G = MediaPlayer.create(getApplicationContext(), R.raw.g),
            MP_H = MediaPlayer.create(getApplicationContext(), R.raw.h),
            MP_I = MediaPlayer.create(getApplicationContext(), R.raw.i),
            MP_J = MediaPlayer.create(getApplicationContext(), R.raw.j),
            MP_K = MediaPlayer.create(getApplicationContext(), R.raw.k),
            MP_L = MediaPlayer.create(getApplicationContext(), R.raw.l),
            MP_M = MediaPlayer.create(getApplicationContext(), R.raw.m),
            MP_N = MediaPlayer.create(getApplicationContext(), R.raw.n),
            MP_O = MediaPlayer.create(getApplicationContext(), R.raw.o),
            MP_P = MediaPlayer.create(getApplicationContext(), R.raw.p),
            MP_Q = MediaPlayer.create(getApplicationContext(), R.raw.q),
            MP_R = MediaPlayer.create(getApplicationContext(), R.raw.r),
            MP_S = MediaPlayer.create(getApplicationContext(), R.raw.s),
            MP_T = MediaPlayer.create(getApplicationContext(), R.raw.t),
            MP_U = MediaPlayer.create(getApplicationContext(), R.raw.u),
            MP_V = MediaPlayer.create(getApplicationContext(), R.raw.v),
            MP_W = MediaPlayer.create(getApplicationContext(), R.raw.w),
            MP_X = MediaPlayer.create(getApplicationContext(), R.raw.x),
            MP_Y = MediaPlayer.create(getApplicationContext(), R.raw.y),
            MP_Z = MediaPlayer.create(getApplicationContext(), R.raw.z);

        View.OnClickListener a = (ch) -> {

            switch (ch.getId()) {

                case R.id.a:  MP_A.start(); break;
                case R.id.b:  MP_B.start(); break;
                case R.id.c:  MP_C.start(); break;
                case R.id.d:  MP_D.start(); break;
                case R.id.e:  MP_E.start(); break;
                case R.id.f:  MP_F.start(); break;
                case R.id.g:  MP_G.start(); break;
                case R.id.h:  MP_H.start(); break;
                case R.id.i:  MP_I.start(); break;
                case R.id.j:  MP_J.start(); break;
                case R.id.k:  MP_K.start(); break;
                case R.id.l:  MP_L.start(); break;
                case R.id.m:  MP_M.start(); break;
                case R.id.n:  MP_N.start(); break;
                case R.id.o:  MP_O.start(); break;
                case R.id.p:  MP_P.start(); break;
                case R.id.q:  MP_Q.start(); break;
                case R.id.r:  MP_R.start(); break;
                case R.id.s:  MP_S.start(); break;
                case R.id.t:  MP_T.start(); break;
                case R.id.u:  MP_U.start(); break;
                case R.id.v:  MP_V.start(); break;
                case R.id.w:  MP_W.start(); break;
                case R.id.x:  MP_X.start(); break;
                case R.id.y:  MP_Y.start(); break;
                case R.id.z:  MP_Z.start(); break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ch.getId());
            }
        };


        btn_A.setOnClickListener(a);
        btn_B.setOnClickListener(a);
        btn_C.setOnClickListener(a);
        btn_D.setOnClickListener(a);
        btn_E.setOnClickListener(a);
        btn_F.setOnClickListener(a);
        btn_G.setOnClickListener(a);
        btn_H.setOnClickListener(a);
        btn_I.setOnClickListener(a);
        btn_J.setOnClickListener(a);
        btn_K.setOnClickListener(a);
        btn_L.setOnClickListener(a);
        btn_M.setOnClickListener(a);
        btn_N.setOnClickListener(a);
        btn_O.setOnClickListener(a);
        btn_P.setOnClickListener(a);
        btn_Q.setOnClickListener(a);
        btn_R.setOnClickListener(a);
        btn_S.setOnClickListener(a);
        btn_T.setOnClickListener(a);
        btn_U.setOnClickListener(a);
        btn_V.setOnClickListener(a);
        btn_W.setOnClickListener(a);
        btn_X.setOnClickListener(a);
        btn_Y.setOnClickListener(a);
        btn_Z.setOnClickListener(a);


    }
}