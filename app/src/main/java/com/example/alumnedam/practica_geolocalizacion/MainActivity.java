package com.example.alumnedam.practica_geolocalizacion;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BaseDatos bd = new BaseDatos(this, "Autobuseros", null, 2);
        SQLiteDatabase sql= bd.getWritableDatabase();
    }





}
