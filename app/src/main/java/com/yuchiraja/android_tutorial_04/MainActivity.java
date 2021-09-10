package com.yuchiraja.android_tutorial_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     // Create button object
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Link java button with xml button
        button = findViewById(R.id.btn_1);

        //Create intent (according to new tutorial 6 video"pasing data using Intent")
        final Intent intent = new Intent(this,ActivityTwo.class);

        //create "name" object
        String name = "Yuchira Jayasanka Athukorala";
        int age = 26;

        //a method to set/attach value/data to created intent
        intent.putExtra("USER_NAME",name);
        intent.putExtra("USER_AGE",age);

        // Bundle extras = new Bundle();
        // extras.putString("USER_NAME",name);
        // extras.putInt("USER_AGE",age);

       // intent.putExtras(extras);


        // Set Listener to the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create intent (according to tutorial 5 video)
                //Intent i = new Intent(getApplicationContext(),ActivityTwo.class);

                //Launch the activity two
                startActivity(intent);
            }
        });
    }





    /**
     * meka use krnna puluwn "section 1" eka wenuwta

     public void onClick(View view) {
         Intent i = new Intent (packageContext:this.ActivityTwo.class);
         startActivity(i);

     }
     **/
}