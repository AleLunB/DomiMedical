package com.example.domimedical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class refistro extends AppCompatActivity {

    EditText nombre, correo, telefono, direccion, contrasena, recontrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refistro);

        nombre = findViewById(R.id.nombre);
        correo = findViewById(R.id.correo);
        telefono = findViewById(R.id.telefono);
        direccion = findViewById(R.id.direccion);
        contrasena = findViewById(R.id.contrasena);
        recontrasena = findViewById(R.id.recontrasena);

        MaterialButton iniciarsesion = (MaterialButton) findViewById(R.id.iniciarsesion);
        MaterialButton registrarse = (MaterialButton) findViewById(R.id.registrarse);

        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambiniciarsesion = new Intent(refistro.this, MainActivity.class);
                startActivity(cambiniciarsesion);
                    }
        });

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambinicio = new Intent(refistro.this, inicio.class);
                startActivity(cambinicio);
            }
        });



    }
}