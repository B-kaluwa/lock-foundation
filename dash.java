package com.example.lockf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class dash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    @Override
    protected void onRestart () {
        super.onRestart();
        startActivity(new Intent(this, MainActivity.class));
    }
    }