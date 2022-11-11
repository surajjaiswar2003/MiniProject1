package com.example.miniproject;

import static com.example.miniproject.R.id.cardquicktest;
import static com.example.miniproject.R.id.helth_card;
import static com.example.miniproject.R.id.locate;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class dashboard extends AppCompatActivity implements View.OnClickListener {
public CardView quick_test,lab_test,map,report,sell,buy,locate,health_crd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboared);
        super.onCreate(savedInstanceState);

        quick_test =findViewById(R.id.cardquicktest);
        lab_test=findViewById(R.id.cardlabtest);
        map =findViewById(R.id.cardmap);
        report =findViewById(R.id.cardreport);
       // sell =findViewById(R.id.cardsell);
        //buy =findViewById(R.id.cardbuy);
        locate =findViewById(R.id.locate);
        health_crd =findViewById(R.id.helth_card);


        quick_test.setOnClickListener(this);
        lab_test.setOnClickListener(this);
        map.setOnClickListener(this);
       report.setOnClickListener(this);
        //sell.setOnClickListener(this);
       //buy.setOnClickListener(this);
        locate.setOnClickListener(this);
        health_crd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.cardquicktest:
            i = new Intent(this, quicktest.class);
            startActivity(i);
            break;

            case R.id.cardlabtest:
                i = new Intent(this, labtest.class);
                startActivity(i);
                break;

            case R.id.cardmap:
            i = new Intent(this, map.class);
            startActivity(i);
            break;

            case R.id.cardreport:
            i = new Intent(this, report.class);
            startActivity(i);
            break;

            case R.id.locate:
                i = new Intent(this, locate.class);
                startActivity(i);
                break;


            case helth_card:
                i = new Intent(this, health_card.class);
                startActivity(i);
                break;

        }
    }


    }








