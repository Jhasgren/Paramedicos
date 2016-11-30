package com.example.erick.prueba;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;


public class
BD {
    private static BD enlace;
    private SQLiteDatabase bd;

    public BD(final Context context) {
        SQLiteOpenHelper sql = new SQLiteOpenHelper(context, "principal", null, 1) {
            @Override
            public void onCreate(SQLiteDatabase db) {
                List<String> datos = new IO(context, "bd.txt").getDatos();
                for (String dato : datos) {
                    db.execSQL(dato);
                }
            }

            @Override
            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            }
        };
        bd = sql.getWritableDatabase();
    }

    public void comando(String sql) {
        bd.execSQL(sql);
    }

    public Cursor consulta(String sql) {
        return bd.rawQuery(sql, null);
    }

    public static BD getEnlace() {
        return enlace;
    }
}
