package com.example.adam.communicationbetweentwofragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Adam on 6/10/2016.
 */
public class FragmentOne extends Fragment {
    EditText editText;
    Button button;
    OnNameSetListener onNameSetListener;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one_layout,container,false);
        editText=(EditText)view.findViewById(R.id.name);
        button=(Button)view.findViewById(R.id.submit);
        onNameSetListener=(OnNameSetListener)getActivity();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText.getText().toString();
                onNameSetListener.setName(name);
            }
        });

        return view;
    }
    public interface OnNameSetListener{
       void setName(String name);
    }
}
