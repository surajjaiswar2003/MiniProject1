package com.example.miniproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class quicktest extends AppCompatActivity implements View.OnClickListener {
    public CardView observation, ph, stability, drainage, texture, biology;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_quicktest);
        super.onCreate(savedInstanceState);

        observation = findViewById(R.id.btn_observation);
        texture = findViewById(R.id.btn_texture);
        drainage = findViewById(R.id.btn_drainage);
        ph = findViewById(R.id.btn_ph);
        stability = findViewById(R.id.btn_aggrigate);
        biology = findViewById(R.id.btn_biology);


        observation.setOnClickListener(this);
        texture.setOnClickListener(this);
        drainage.setOnClickListener(this);
        ph.setOnClickListener(this);
        stability.setOnClickListener(this);
        biology.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.btn_observation:
                i = new Intent(this, test_observation.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.btn_texture:
                i = new Intent(this, test_texture.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.btn_drainage:
                i = new Intent(this, test_drainage.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.btn_ph:
                i = new Intent(this, test_ph.class);
                startActivity(i);
                break;
        }

        switch (view.getId()) {
            case R.id.btn_aggrigate:
                i = new Intent(this, test_aggrigate.class);
                startActivity(i);
                break;
        }

        switch (view.getId()) {
            case R.id.btn_biology:
                i = new Intent(this, test_biology.class);
                startActivity(i);
                break;
        }
    }
}








