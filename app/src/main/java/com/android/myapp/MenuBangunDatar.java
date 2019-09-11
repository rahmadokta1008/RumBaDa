package com.android.myapp;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuBangunDatar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button persegi = findViewById(R.id.btnpersegi);
        persegi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent persegi = new Intent(MenuBangunDatar.this, HitungPersegiPanjang.class);
                startActivity(persegi);
            }
        });

        Button segitiga = findViewById(R.id.btnsegitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent segitiga = new Intent(MenuBangunDatar.this, HitungSegitiga.class);
                startActivity(segitiga);
            }
        });

        Button lingkaran = findViewById(R.id.btnlingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent lingkaran = new Intent(MenuBangunDatar.this, HitungLingkaran.class);
                startActivity(lingkaran);
            }
        });

        Button info = findViewById(R.id.btntentang);
        info.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent info = new Intent(MenuBangunDatar.this, About.class);
                startActivity(info);
            }
        });

    }
}
