package com.example.erick.prueba;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    String usuario, contr;
    SharedPreferences preferences;
    EditText us, ct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        preferences = getSharedPreferences("preferences", 0);
        usuario = preferences.getString("usuarios", "admin");
        contr = preferences.getString("contr", "1234");
        us = (EditText) findViewById(R.id.editText);
        ct = (EditText) findViewById(R.id.editText2);
    }

    public void login(View view) {
        if (us.getText().toString().equals(usuario) && ct.getText().toString().equals(contr)) {
            startActivity(new Intent(this, Delegacion.class));
        }else{
            Toast.makeText(Principal.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
