package com.example.domimedical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton registraseVentanabtn = (MaterialButton) findViewById(R.id.registraseVentanabtn);

        //Usuario = usuario1@hotmail.com
        //Contraseña = usuario1

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuario.getText().toString().equals("usuario1@hotmail.com") && contrasena.getText().toString().equals("usuario1")) {
                    Toast.makeText(MainActivity.this, "Usuario registrado", Toast.LENGTH_LONG).show();
                    Intent cambinicio = new Intent(MainActivity.this, inicio.class);
                    startActivity(cambinicio);
                } else
                    Toast.makeText(MainActivity.this, "Usuario no Registrado", Toast.LENGTH_LONG).show();
            }
        });

        registraseVentanabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambregistro = new Intent(MainActivity.this, refistro.class);
                startActivity(cambregistro);
            }
        });



    }
}