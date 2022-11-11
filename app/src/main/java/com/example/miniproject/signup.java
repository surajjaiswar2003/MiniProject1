package com.example.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    public static final String TAG = "TAG";
    TextInputLayout fullname_var, username_var, email_var, phonenmber_var, password_var;
    Button register_ver;
    Button logobutton;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference refrence;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //This line hide action Bar

        getSupportActionBar().hide();
        setContentView(R.layout.activity_signup);
        super.onCreate(savedInstanceState);

        fullname_var = findViewById(R.id.fullname_text_field_design);
        username_var = findViewById(R.id.username_text_field_design);
        email_var = findViewById(R.id.email_text_field_design);
        phonenmber_var = findViewById(R.id.phonenno_text_field_design);
        password_var = findViewById(R.id.password_input_field);
        register_ver = findViewById(R.id.register_button);


    }

    public void loginbuttonclick(View view) {
        Intent intent = new Intent(getApplicationContext(), com.example.miniproject.login.class);
        startActivity(intent);
        finish();
    }

    public void registerbuttonclick(View view) {
        String fullname_    = fullname_var.getEditText().getText().toString();
        String username_    = username_var.getEditText().getText().toString();
        String email_       = email_var.getEditText().getText().toString();
        String phonenumber_ = phonenmber_var.getEditText().getText().toString();
        String password_    = password_var.getEditText().getText().toString();

        if (!fullname_.isEmpty()) {
            fullname_var.setError(null);
            fullname_var.setErrorEnabled(false);
            if (!username_.isEmpty()) {
                username_var.setError(null);
                username_var.setErrorEnabled(false);
                if (!email_.isEmpty()) {
                    email_var.setError(null);
                    email_var.setErrorEnabled(false);
                    if (!phonenumber_.isEmpty()) {
                        phonenmber_var.setError(null);
                        phonenmber_var.setErrorEnabled(false);
                        if (!password_.isEmpty()) {
                            password_var.setError(null);
                            password_var.setErrorEnabled(false);
                            if (!email_.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$")) {
                                firebaseDatabase= FirebaseDatabase.getInstance();
                                refrence = firebaseDatabase.getReference("datauser");
// fullname_s has been edited
                                String name    = fullname_var.getEditText().getText().toString();
                                String username   = username_var.getEditText().getText().toString();
                                String email      = email_var.getEditText().getText().toString();
                                String phoneno = phonenmber_var.getEditText().getText().toString();
                                String password  = password_var.getEditText().getText().toString();

                                storingdata storingdatass = new storingdata(name,username,email,phoneno,password);


                                refrence.child(username).setValue(storingdatass);
                                Toast.makeText(getApplicationContext(),"Registered successfully",Toast.LENGTH_SHORT).show();

                                Intent intent=new Intent(getApplicationContext(),dashboard.class);


                                //start from here

                                intent.putExtra("name",name);
                                intent.putExtra("email",email);
                                intent.putExtra("username",username);
                                intent.putExtra("phoneno",phoneno);


                                startActivity(intent);
                                finish();


                            }else{
                                email_var.setError("Invalid Email");
                            }
                        }else {password_var.setError("Please enter the Password");
                        }
                    } else {
                        phonenmber_var.setError("Please enter the Phone Number");
                    }
                } else {
                    email_var.setError("Please enter the email");
                }
            } else {
                username_var.setError("Please enter the username");
            }
        } else {
            fullname_var.setError("Please enter the full name");
        }


    }
}

