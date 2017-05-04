package com.example.adam.communicationbetweentwofragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnNameSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void setName(String name) {
        fragmenttwo f2=(fragmenttwo)getFragmentManager().findFragmentById(R.id.fragment_two);
        f2.updateinfo(name);
    }
}
