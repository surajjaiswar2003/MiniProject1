package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class map extends AppCompatActivity {
    public Button btn_ind,btn_up, btn_mah,btn_and, btn_bhr,btn_arun,btn_ass,btn_chat,btn_goa,btn_guj,btn_hp,btn_jhk,btn_ker,btn_lak,btn_mp,btn_man,btn_odi,btn_raj,btn_uk;
    String[] urls = new String[28];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        btn_ind=findViewById(R.id.India);
        btn_up = findViewById(R.id.Uttar_Pradesh);
        btn_mah= findViewById(R.id.Maharashtra);
        btn_and= findViewById(R.id.Andhra_Pradesh);
        btn_ass= findViewById(R.id.Assam);
        btn_bhr =findViewById(R.id.Bihar);
        btn_chat= findViewById(R.id.Chhattisgarh);
        btn_goa= findViewById(R.id.Goa);
        btn_guj= findViewById(R.id.Gujarat);
        btn_hp= findViewById(R.id.Himachal_Pradesh);
        btn_jhk= findViewById(R.id.Jharkhand);
        btn_ker= findViewById(R.id.Kerala);
        btn_lak= findViewById(R.id.Lakshadweep);
        btn_mp= findViewById(R.id.Madhya_Pradesh);
        btn_odi= findViewById(R.id.Odisha);
        btn_raj= findViewById(R.id.Rajasthan);
        btn_uk= findViewById(R.id.Uttarakhand);



        urls[0]="http://upbhunaksha.gov.in";
        urls[1]="https://mahabhunakasha.mahabhumi.gov.in";
        urls[3]="https://bhunaksha.ap.gov.in";
        urls[4]="http://revenueassam.nic.in";
        urls[5]="http://bhunaksha.bih.nic.in";
        urls[6]="https://bhunaksha.cg.nic.in";
        urls[7]="http://bhunaksha.goa.gov.in";
        urls[8]="http://bhunaksha.gujarat.gov.in";
        urls[9]="http://bhunakshahp.nic.in";
        urls[10]="https://jharbhunaksha.nic.in";
        urls[11]="https://emaps.kerala.gov.in";
        urls[12]="http://bhunaksha.utl.gov.in";
        urls[13]="https://mpbhulekh.gov.in";
        urls[14]="http://bhunakshaodisha.nic.in";
        urls[15]="http://bhunaksha.raj.nic.in";
        urls[16]="https://bhunaksha.uk.gov.in";
        urls[17]="https://soilhealth7.gov.in";

        btn_ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[17]);
                startActivity(intent);

            }
        });


        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);

            }
        });

        btn_mah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);

            }
        });
        btn_and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[2]);
                startActivity(intent);

            }
        });
        btn_ass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[3]);
                startActivity(intent);

            }
        });
        btn_bhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[4]);
                startActivity(intent);

            }
        });
        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[5]);
                startActivity(intent);

            }
        });
        btn_goa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[6]);
                startActivity(intent);

            }
        });
        btn_guj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[7]);
                startActivity(intent);

            }
        });
        btn_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[8]);
                startActivity(intent);

            }
        });
        btn_jhk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[9]);
                startActivity(intent);

            }
        });
        btn_ker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[10]);
                startActivity(intent);

            }
        });
        btn_lak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[11]);
                startActivity(intent);

            }
        });
        btn_mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[12]);
                startActivity(intent);

            }
        });
        btn_odi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[13]);
                startActivity(intent);

            }
        });
        btn_raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[14]);
                startActivity(intent);

            }
        });
        btn_uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mapwebpage.class);
                intent.putExtra("links",urls[15]);
                startActivity(intent);

            }
        });

    }
}

        /*
        up = findViewById(R.id.Uttar_Pradesh);
        mah = findViewById(R.id.Maharashtra);
        bhr = findViewById(R.id.Bihar);

         up.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(map.this,mapwebpage.class);
                    i.putExtra("url","uttarpradesh_map");
                    startActivity(i);
                }
            });

        bhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(map.this,mapwebpage.class);
                i.putExtra("url","bihar_map");
                startActivity(i);

            }
        });

    }

    }
*/


