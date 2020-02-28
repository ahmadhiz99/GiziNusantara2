package com.example.gizinusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Daftar extends AppCompatActivity {

    Button daftar2;
    RadioButton responden,nutritionist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        daftar2 = findViewById(R.id.btn_daftar2);
        responden = findViewById(R.id.rb_responden);
        responden.isChecked();
        nutritionist = findViewById(R.id.rb_nutritionist);

        daftar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (responden.isChecked()){
                    Intent respondenIntent = new Intent(Daftar.this,Daftar_Responden.class);
                    startActivity(respondenIntent);
                } else if(nutritionist.isChecked()){
                    Intent nutritionistIntent = new Intent(Daftar.this,Daftar_Nutritionist.class);
                    startActivity(nutritionistIntent);
                }else {
                    Toast.makeText(Daftar.this, "Mohon Isi Kategori Login",Toast.LENGTH_LONG).show();
                };
            }
        });

    }
}
