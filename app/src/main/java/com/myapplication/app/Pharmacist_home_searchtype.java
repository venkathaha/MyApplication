package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pharmacist_home_searchtype extends AppCompatActivity {

    private Button Nready;
    private Button ready;
    private Button collected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacist_home_searchtype);

        Nready = (Button) findViewById(R.id.notReady);
        Nready.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityNotReady();
            }
        });

        ready = (Button) findViewById(R.id.ready);
        ready.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityReady();
            }
        });


        collected = (Button) findViewById(R.id.collected);
        collected.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityCompleated();
            }
        });



    }

    public void openActivityNotReady(){
        Intent intent = new Intent(this, Pharmacist_home_searchtype_notReady.class);
        startActivity(intent);

    }

    public void openActivityReady(){
        Intent intent = new Intent(this, Pharmacist_home_searchtype_ready.class);
        startActivity(intent);

    }

    public void openActivityCompleated(){
        Intent intent = new Intent(this, Pharmacist_home_searchtype_complete.class);
        startActivity(intent);

    }
}