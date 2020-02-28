package com.example.gizinusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Daftar_Nutritionist extends AppCompatActivity {

    Button daftarNutritionist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar__nutritionist);
        Intent nutritionistIntent = new Intent(Daftar_Nutritionist.this, MainMenu.class);
        startActivity(nutritionistIntent);
    }
}
