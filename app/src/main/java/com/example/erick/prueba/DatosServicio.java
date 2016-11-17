package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DatosServicio extends AppCompatActivity {

    EditText fecha, dia, horaLlamada, horaSalida, horaLlegada, horaTraslado,
            horaHospital, horaBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_servicio);
        fecha = (EditText) findViewById(R.id.editText6);
        dia = (EditText) findViewById(R.id.editText7);
        horaLlamada = (EditText) findViewById(R.id.editText8);
        horaSalida = (EditText) findViewById(R.id.editText9);
        horaLlegada = (EditText) findViewById(R.id.editText10);
        horaTraslado = (EditText) findViewById(R.id.editText11);
        horaHospital = (EditText) findViewById(R.id.editText12);
        horaBase = (EditText) findViewById(R.id.editText13);
    }

    public void datosServicio(View view) {
        Intent intent = new Intent(this, Datos_Servicio2.class);
        intent.putExtra("fecha", fecha.getText().toString());
        intent.putExtra("dia", dia.getText().toString());
        intent.putExtra("horaLlamada", horaLlamada.getText().toString());
        intent.putExtra("horaSalida", horaSalida.getText().toString());
        intent.putExtra("horaLlegada", horaLlegada.getText().toString());
        intent.putExtra("horaTraslado", horaTraslado.getText().toString());
        intent.putExtra("horaHospital", horaHospital.getText().toString());
        intent.putExtra("horaBase", horaBase.getText().toString());
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
