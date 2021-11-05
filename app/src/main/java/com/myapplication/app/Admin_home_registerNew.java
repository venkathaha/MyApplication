package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_home_registerNew extends AppCompatActivity {

    private Button addPatientButton;
    private Button addDoctorButton;
    private Button addPharmacistButton;
    private Button addAdminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_register_new);

        addPatientButton = (Button) findViewById(R.id.patient);
        addPatientButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityAddPatient();
            }
        });

        addDoctorButton = (Button) findViewById(R.id.Doctor);
        addDoctorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityAddDoctor();
            }
        });

        addPharmacistButton = (Button) findViewById(R.id.Pharmacist);
        addPharmacistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivityAddpharmacist();
            }
        });

        addAdminButton = (Button) findViewById(R.id.Admin);
        addAdminButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivityAddAdmin();
            }
        });

    }

    public void openActivityAddPatient(){
        Intent intent = new Intent(this, Admin_home_registerNew_patient.class);
        startActivity(intent);

    }

    public void openActivityAddDoctor(){
        Intent intent = new Intent(this, Admin_home_registerNew_doctor.class);
        startActivity(intent);

    }

    public void openActivityAddpharmacist(){
        Intent intent = new Intent(this, Admin_home_registerNew_pharmacist.class);
        startActivity(intent);



    }

    public void openActivityAddAdmin(){
        Intent intent = new Intent(this, Admin_home_registerNew_admin.class);
        startActivity(intent);



    }
}
