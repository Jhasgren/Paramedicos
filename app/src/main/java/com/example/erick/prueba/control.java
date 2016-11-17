package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class control extends AppCompatActivity {

    EditText numAmbulancia, operador, sv1, sv2, sv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        numAmbulancia = (EditText) findViewById(R.id.editText20);
        operador = (EditText) findViewById(R.id.editText21);
        sv1 = (EditText) findViewById(R.id.editText22);
        sv2 = (EditText) findViewById(R.id.editText23);
        sv3 = (EditText) findViewById(R.id.editText24);
    }

    public void control(View view) {
        Intent intent = new Intent(this, Datos_paciente.class);
        intent.putExtra("numAmbulancia", numAmbulancia.getText().toString());
        intent.putExtra("operador", operador.getText().toString());
        intent.putExtra("sv1", sv1.getText().toString());
        intent.putExtra("sv2", sv2.getText().toString());
        intent.putExtra("sv3", sv3.getText().toString());
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
