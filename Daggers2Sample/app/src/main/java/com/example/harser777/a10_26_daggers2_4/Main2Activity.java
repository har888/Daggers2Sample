package com.example.harser777.a10_26_daggers2_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.harser777.a10_26_daggers2_4.Dependencies.Computer;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {


    @Inject
    Computer computer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        
    }
}
