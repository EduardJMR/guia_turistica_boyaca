package com.example.guiaturistica;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class registrousuario extends AppCompatActivity {
    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrousuario);
        btnRegistro = findViewById(R.id.btnRegistro);
        getSupportActionBar().hide();
       btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper2 dbHelper = new DbHelper2(registrousuario.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase(); //Crearla = Escribir
                // Validación
                if(db != null){
                    Toast.makeText(registrousuario.this, "BASE DE DATOS CREADA",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(registrousuario.this,"ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}