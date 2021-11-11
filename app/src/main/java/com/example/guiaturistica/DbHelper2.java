package com.example.guiaturistica;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class DbHelper2 extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NOMBRE = "scenario.db";
    private static final String TABLE_PRODUCTOS = "productos";

    public DbHelper2(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE " + TABLE_PRODUCTOS + "("+
                "idproducto INTEGER PRIMARY KEY AUTOINCREMENT," +
                "cedula FLOAT, " +
                "nombrep TEXT NOT NULL,"+
                "tipop TEXT NOT NULL,"+
                "imgpath TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" DROP TABLE " + TABLE_PRODUCTOS);// Consulta
        onCreate(sqLiteDatabase);

    }
}