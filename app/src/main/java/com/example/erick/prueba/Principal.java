package com.example.erick.prueba;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

public class Principal extends AppCompatActivity {
    EditText us, ct;
    private BD bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        us = (EditText) findViewById(R.id.editText);
        ct = (EditText) findViewById(R.id.editText2);
        bd = new BD(this);
    }

    public void login(View view) {
        Cursor c = bd.consulta("select * from paramedicos where usuario='" + us.getText().toString() + "'");
        if (c.moveToNext()) {
            if (c.getString(c.getColumnIndex("clave")).equals(ct.getText().toString())) {
                startActivity(new Intent(this, MenuPrincipalActivity.class));
            } else {
                Toast.makeText(Principal.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(Principal.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
