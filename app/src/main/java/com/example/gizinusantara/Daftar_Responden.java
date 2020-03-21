package com.example.gizinusantara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Daftar_Responden extends AppCompatActivity {

    Button daftarResponden;
    private EditText inputEmail, inputPassword, inputRepasword, inputusername;     //hit option + enter if you on mac , for windows hit ctrl + enter
    private Button btnSignIn, btnSignUp, btnResetPassword;
    private ProgressBar progressBar;
    private FirebaseDatabase mFirebaseInstance;
    private DatabaseReference mFirebaseDatabase;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar__responden);




        inputEmail = findViewById(R.id.et_email);
        inputPassword = findViewById(R.id.et_password);
        btnSignUp = findViewById(R.id.btn_daftarresponden);
        mAuth = FirebaseAuth.getInstance();

//        initializeUI();
        btnSignUp = findViewById(R.id.btn_daftarresponden);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        if (TextUtils.isEmpty(inputEmail.getText().toString())) {
        Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
        return;
        }else if (TextUtils.isEmpty(inputPassword.getText().toString())) {
        Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
        return;
        }else if (inputPassword.getText().toString().length() < 6) {
        Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
        return;
        }else {
            registerNewUser();

        }



            }
        });
    }


    private void registerNewUser() {

        if (TextUtils.isEmpty(inputEmail.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(inputPassword.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
            return;
        }

//        final String name = inputusername.getText().toString().trim();
        final String email = inputEmail.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();
//        String confirmPassword = inputRepasword.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Daftar_Responden.this, "Autentikasi Sukses.", Toast.LENGTH_SHORT).show();


                            Intent i = new Intent(Daftar_Responden.this, MainMenu.class);
                            startActivity(i);

                        }else {
                            Toast.makeText(Daftar_Responden.this, "Autentikasi Gagal, Pastikan Email Belum Terdaftar",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    }


////
//////                                    finish();
