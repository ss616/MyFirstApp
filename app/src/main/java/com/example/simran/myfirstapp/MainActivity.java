package com.example.simran.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1=(Button) findViewById(R.id.button); //got id of button and saved it
        //screen is called an activity
        //<intent>
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity=new Intent(MainActivity.this,Second_Screen.class);
                startActivity(newActivity);
            }
        });

        }

}
