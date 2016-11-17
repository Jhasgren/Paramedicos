package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Resena extends AppCompatActivity {
    EditText narrativo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resena);
        narrativo = (EditText) findViewById(R.id.editText40);
    }

    public void resena(View view) {
        Intent intent = new Intent(this, Resumen.class);
        intent.putExtra("narrativo", narrativo.getText().toString());
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
