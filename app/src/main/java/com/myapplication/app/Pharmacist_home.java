package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pharmacist_home extends AppCompatActivity {

    private Button dispenseStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacist_home);

        dispenseStatus = (Button) findViewById(R.id.dispenseStatus);
        dispenseStatus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityDispenseStatus();
            }
        });


    }

    public void openActivityDispenseStatus(){
        Intent intent = new Intent(this, Pharmacist_home_searchtype.class);
        startActivity(intent);

    }
}