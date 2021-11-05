package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_home extends AppCompatActivity {

    private Button regNewUser;
    private Button searchUser;
    private Button addDrug;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        regNewUser = (Button) findViewById(R.id.RegNewUser);
        regNewUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityRegNewUser();
            }
        });

        searchUser = (Button) findViewById(R.id.SearchUserAcc);
        searchUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivitySearchUser();
            }
        });

        addDrug = (Button) findViewById(R.id.AddNewDrug);
        addDrug.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityAddNewDrug();
            }
        });



    }

    public void openActivityRegNewUser(){
        Intent intent = new Intent(this, Admin_home_registerNew.class);
        startActivity(intent);

    }

    public void openActivitySearchUser(){
        Intent intent = new Intent(this, Admin_home_searchUsers.class);
        startActivity(intent);

    }

    public void openActivityAddNewDrug(){
        Intent intent = new Intent(this, Admin_home_addDrug.class);
        startActivity(intent);

    }



}