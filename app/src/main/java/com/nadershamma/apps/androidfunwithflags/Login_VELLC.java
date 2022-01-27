package com.nadershamma.apps.androidfunwithflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login_VELLC extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextContraseña;
    private Button buttonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextContraseña= findViewById(R.id.editTextContraseña);
        buttonIngresar = findViewById(R.id.buttonIngresar);
    }
}