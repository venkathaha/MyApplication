package com.myapplication.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin_home_searchUsers_doctor extends AppCompatActivity {
    private Button editUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_search_users_doctor);

    editUser = (Button) findViewById(R.id.EditButton);
        editUser.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            openActivityEditUser();
        }
    });


}

    public void openActivityEditUser(){
        Intent intent = new Intent(this, Admin_home_searchUsers_doctor_update.class);
        startActivity(intent);

    }
}
