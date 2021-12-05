package com.example.domimedical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // por cada nucleo (8 +o-) del telefono, este dedica cierta cantidad de hilos segun la app
        //Un nucleo tiene 2 hilos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // intent = Cambiar de vista/Layout
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, 8000);
    }
}