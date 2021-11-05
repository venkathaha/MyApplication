package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_home_searchUsers extends AppCompatActivity {

    private Button searchPatientButton;
    private Button searchDoctorButton;
    private Button searchPharmacistButton;
    private Button searchAdminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_search_users);
        searchPatientButton = (Button) findViewById(R.id.patient_search);
        searchPatientButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivitySearchPatient();
            }
        });

        searchDoctorButton = (Button) findViewById(R.id.Doctor_search);
        searchDoctorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivitySearchDoctor();
            }
        });

        searchPharmacistButton = (Button) findViewById(R.id.Pharmacist_search);
        searchPharmacistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivitySearchpharmacist();
            }
        });

        searchAdminButton = (Button) findViewById(R.id.Admin_search);
        searchAdminButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivitySearchAdmin();
            }
        });

    }

    public void openActivitySearchPatient(){
        Intent intent = new Intent(this, Admin_home_searchUsers_patient.class);
        startActivity(intent);

    }

    public void openActivitySearchDoctor(){
        Intent intent = new Intent(this, Admin_home_searchUsers_doctor.class);
        startActivity(intent);

    }

    public void openActivitySearchpharmacist(){
        Intent intent = new Intent(this, Admin_home_searchUsers_pharmacist.class);
        startActivity(intent);



    }

    public void openActivitySearchAdmin(){
        Intent intent = new Intent(this, Admin_home_searchUsers_admin.class);
        startActivity(intent);



    }
}
