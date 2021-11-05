package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patient_home extends AppCompatActivity {

    private Button myPrescriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);

        myPrescriptions = (Button) findViewById(R.id.MyPrescriptionsHistory);
        myPrescriptions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityMyPrescription();
            }
        });


    }

    public void openActivityMyPrescription(){
        Intent intent = new Intent(this, Patient_home_viewPrescriptions.class);
        startActivity(intent);

    }
}