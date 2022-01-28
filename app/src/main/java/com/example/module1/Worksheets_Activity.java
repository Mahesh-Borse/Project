package com.example.module1;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.module1.databinding.ActivityWorksheetsBinding;

public class Worksheets_Activity extends AppCompatActivity {

    private ActivityWorksheetsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWorksheetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

    }
}
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Practice%20Pre%20Writting.pdf
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Alphabets%20Tracing.pdf
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Line%20Tracing.pdf
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Line%20Tracing-2.pdf
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Numbers%20Tracing.pdf
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Numbers%20Tracing-2.pdf
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Picture_Matching_Worksheet_1.png
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Picture_Matching_Worksheet_2.png
//    https://github.com/Mahesh-Borse/pro-res/raw/main/Picture_Matching_Worksheet_3.png
