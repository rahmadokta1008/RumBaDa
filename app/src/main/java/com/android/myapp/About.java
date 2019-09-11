package com.android.myapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;


public class About extends FragmentActivity {

    Button btn_fragment;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        btn_fragment = findViewById(R.id.btnFragment);
        btn_fragment.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, new Tampilanfragment()).commit();
            }



        });



    }


    public void backtoMenu(View view){
        finish();
    }
}
