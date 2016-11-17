package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class EvInicial extends AppCompatActivity {
    RadioButton conAlerta, conVerbal, conDolor, conInconciente;
    RadioButton viaPermeable, viaComprometida;
    RadioButton degPresente, degAusente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ev_inicial);
        conAlerta = (RadioButton) findViewById(R.id.radioButton6);
        conVerbal = (RadioButton) findViewById(R.id.radioButton7);
        conDolor = (RadioButton) findViewById(R.id.radioButton8);
        conInconciente = (RadioButton) findViewById(R.id.radioButton9);

        viaPermeable = (RadioButton) findViewById(R.id.radioButton10);
        viaComprometida = (RadioButton) findViewById(R.id.radioButton11);

        degPresente = (RadioButton) findViewById(R.id.radioButton12);
        degAusente = (RadioButton) findViewById(R.id.radioButton13);
    }

    public void EvInicial(View view) {
        Intent intent = new Intent(this, EvInicial2.class);
        if (conAlerta.isChecked()) {
            intent.putExtra("conciencia", "Alerta");
        } else if (conVerbal.isChecked()) {
            intent.putExtra("conciencia", "Verbal");
        } else if (conDolor.isChecked()) {
            intent.putExtra("conciencia", "Dolor");
        } else {
            intent.putExtra("conciencia", "Inconciente");
        }

        if (viaPermeable.isChecked()) {
            intent.putExtra("via", "Permeable");
        } else {
            intent.putExtra("via", "Comprometida");
        }

        if (degPresente.isChecked()) {
            intent.putExtra("deglucion", "Presente");
        } else {
            intent.putExtra("deglucion", "Ausente");
        }

        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
