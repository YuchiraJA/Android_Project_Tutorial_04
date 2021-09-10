package com.yuchiraja.android_tutorial_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    Button button;
    TextView tv_UserName, tv_UserAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        button = findViewById(R.id.btn_2);
        tv_UserName = findViewById(R.id.tv_UserName);
        tv_UserAge = findViewById(R.id.tv_UserAge);


        // get intent object's attached string value which is sent from MainActivity
        //and assign that string value to "name" String variable
        Intent intent = getIntent();
        String name = intent.getStringExtra("USER_NAME");  
        int age = intent.getIntExtra("USER_AGE",0);

        // Bundle extras = intent.getExtras();
       // String name = extras.getString("USER_NAME");
       // int age = extras.getInt("USER_AGE");


        //set "name" variable value to "tv_UserName" TextView element
        tv_UserName.setText(name);
        tv_UserAge.setText(String.valueOf(age));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }

        });
    }
}