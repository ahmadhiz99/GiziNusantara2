package com.example.gizinusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button imt, kalori, aktivitas, lab, scan, artikel, call, akun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        imt = findViewById(R.id.btn_imt);
        imt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_imt.class);
                startActivity(i);
            }
        });


        kalori = findViewById(R.id.btn_kalori);
        kalori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_kalori.class);
                startActivity(i);
            }
        });

        aktivitas = findViewById(R.id.btn_aktivitas);
        aktivitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_aktivitas.class);
                startActivity(i);
            }
        });

        lab = findViewById(R.id.btn_lab);
        lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_laboratorium.class);
                startActivity(i);
            }
        });


        scan = findViewById(R.id.btn_scanBarcode);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_scanBarcode.class);
                startActivity(i);
            }
        });

        artikel = findViewById(R.id.btn_beritaGizi);
        artikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_infoGizi.class);
                startActivity(i);
            }
        });

        call = findViewById(R.id.btn_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_callNutritionist.class);
                startActivity(i);
            }
        });

        akun = findViewById(R.id.btn_akun);
        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, Menu_akun.class);
                startActivity(i);
            }
        });
    }
}
