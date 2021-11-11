package com.example.guiaturistica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();
    }
    public void onclicknobsa (View v){
        Intent cambiar =new Intent( this,Nobsa.class);
        startActivity(cambiar);
    }
    public void onclickuser (View v){
        Intent cambiar =new Intent( this,registrousuario.class);
        startActivity(cambiar);
    }

    public void onclickmongui(View view) {
        Intent cambiar =new Intent( this,Mongui.class);
        startActivity(cambiar);

    }
    public void opnobsa(View view) {
        Intent cambiar =new Intent( this,Mongui.class);
        startActivity(cambiar);

    }

}