package com.example.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.miniproject.login;

public class MainActivity extends AppCompatActivity {

    private static int timer = 2000;

    ImageView imageView;
    TextView textView1,textView2;
    Animation upperanimation,bottomanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.logo);
        textView1 =  findViewById(R.id.appname);
        textView2 = findViewById(R.id.subtitles);

        upperanimation = AnimationUtils.loadAnimation(this, R.anim.upper_animation);
        bottomanimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView.setAnimation(upperanimation);
        textView1.setAnimation(bottomanimation);
        textView2.setAnimation(bottomanimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
                finish();
            }
        },timer);


    }
}