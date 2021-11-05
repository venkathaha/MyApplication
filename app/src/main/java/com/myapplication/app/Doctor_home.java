package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor_home extends AppCompatActivity {

    private Button searchPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home);

        searchPatient = (Button) findViewById(R.id.SearchPatientP);
        searchPatient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivitySearchPatient();
            }
        });


    }

    public void openActivitySearchPatient(){
        Intent intent = new Intent(this, Doctor_home_searchPatient.class);
        startActivity(intent);

    }
}