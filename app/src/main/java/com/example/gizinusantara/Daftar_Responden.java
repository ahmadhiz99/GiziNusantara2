package com.example.gizinusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Daftar_Responden extends AppCompatActivity {

    Button daftarResponden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar__responden);
        daftarResponden = findViewById(R.id.btn_daftarresponden);
        daftarResponden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent respondenIntent = new Intent(Daftar_Responden.this, MainMenu.class);
                startActivity(respondenIntent);
            }
        });
    }
}
