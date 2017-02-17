package com.example.dodya.myprojectitschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button MyBooks = (Button) findViewById(R.id.MyBooks);
        Button Selection = (Button) findViewById(R.id.selection);
        FloatingActionButton fbAdd = (FloatingActionButton) findViewById(R.id.fbAdd);
        FloatingActionButton fbDelete = (FloatingActionButton) findViewById(R.id.fbDelete);





    }
}
