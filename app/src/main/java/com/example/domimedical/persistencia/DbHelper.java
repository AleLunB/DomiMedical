package com.example.domimedical.persistencia;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DbHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NOMBRE = "dbapp.db";
    private static final String TABLE_USERS = "usuarios";

    public DbHelper (@Nullable Context context){
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(" CREATE TABLE " + TABLE_USERS + "(" +
                "idusuario INTEGER PRIMARY KEY AUTOINCREMENT," + "nombre TEXT NOT NULL," +
                "correo TEXT NOT NULL," + "telefono INTEGER NOT NULL," + "direccion TEXT NOT NULL," +
                "contrasena TEXT NOT NULL," +"recontrasena TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_USERS);// Consulta
        onCreate(sqLiteDatabase);

    }



}
