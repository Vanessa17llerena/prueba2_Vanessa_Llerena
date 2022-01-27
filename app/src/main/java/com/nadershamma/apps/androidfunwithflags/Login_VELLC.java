package com.nadershamma.apps.androidfunwithflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Login_VELLC extends AppCompatActivity  {

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
       buttonIngresar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Bundle dato = getIntent().getExtras();
               String usuario = editTextUsuario.getText().toString();
               String contraseña = editTextContraseña.getText().toString();
               String usuario1= dato.
               if((usuario.equals("Vanessa") || usuario.equals("Leonel"))
                       && (contraseña.equals("12345") || contraseña.equals("23456") ) )
               {
                   Intent intent = new Intent(getApplicationContext() , MainActivity_VELLC.class);
                    startActivity(intent);
               }else {
                   Toast.makeText(getApplicationContext(),"Usuario o contraeña incorecctos",Toast.LENGTH_LONG);
               }
           }
       });
    }




}