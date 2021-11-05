package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button patientButton;
    private Button doctorButton;
    private Button pharmacistButton;
    private Button adminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        patientButton = (Button) findViewById(R.id.patientButton);
        patientButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityPatientLogin();
            }
        });

        doctorButton = (Button) findViewById(R.id.doctorButton);
        doctorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityDoctorLogin();
            }
        });

        pharmacistButton = (Button) findViewById(R.id.pharmacistButton);
        pharmacistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivitypharmacistLogin();
            }
        });

        adminButton = (Button) findViewById(R.id.adminButton);
        adminButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivityAdminLogin();
            }
        });

    }

    public void openActivityPatientLogin(){
        Intent intent = new Intent(this, Patient_login.class);
        startActivity(intent);

    }

    public void openActivityDoctorLogin(){
        Intent intent = new Intent(this, Doctor_login.class);
        startActivity(intent);

    }

    public void openActivitypharmacistLogin(){
        Intent intent = new Intent(this, Pharmacist_login.class);
        startActivity(intent);



    }

    public void openActivityAdminLogin(){
        Intent intent = new Intent(this, Admin_login.class);
        startActivity(intent);



    }
    }
