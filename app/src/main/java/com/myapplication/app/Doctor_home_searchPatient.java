package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor_home_searchPatient extends AppCompatActivity {

    private Button viewPatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_search_patient);

        viewPatient = (Button) findViewById(R.id.viewButton);
        viewPatient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityEditUser();
            }
        });


    }

    public void openActivityEditUser(){
        Intent intent = new Intent(this,
                Doctor_home_searchPatient_view.class);
        startActivity(intent);

    }
}