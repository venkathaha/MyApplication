package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor_home_searchPatient_view extends AppCompatActivity {

    private Button addPrecption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_home_search_patient_view);

        addPrecption = (Button) findViewById(R.id.Add_btn);
        addPrecption.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityaddPrecption();
            }
        });


    }

    public void openActivityaddPrecption(){
        Intent intent = new Intent(this,
                Doctor_home_searchPatient_add.class);
        startActivity(intent);

    }
}