package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class EvInicial3 extends AppCompatActivity {

    RadioGroup pulso, calidad, piel, condicion;
    String op1, op2, op3, op4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ev_inicial3);
        pulso = (RadioGroup) findViewById(R.id.pulso);
        calidad = (RadioGroup) findViewById(R.id.calidad);
        piel = (RadioGroup) findViewById(R.id.piel);
        condicion = (RadioGroup) findViewById(R.id.condicion);
        RadioGroup.OnCheckedChangeListener cheked = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton24:
                        op1 = "Carótido";
                        break;
                    case R.id.radioButton25:
                        op1 = "Radial";
                        break;
                    case R.id.radioButton31:
                        op1 = "Paro Cardio-respiratorio";
                        break;
                    case R.id.radioButton26:
                        op2 = "Rapido";
                        break;
                    case R.id.radioButton29:
                        op2 = "Lento";
                        break;
                    case R.id.radioButton30:
                        op3 = "Normal";
                        break;
                    case R.id.radioButton34:
                        op3 = "Palida";
                        break;
                    case R.id.radioButton32:
                        op3 = "Cianotica";
                        break;
                    case R.id.radioButton35:
                        op4 = "Caliente";
                        break;
                    case R.id.radioButton36:
                        op4 = "Fria";
                        break;
                    case R.id.radioButton37:
                        op4 = "Diaforética";
                        break;
                }
            }
        };
        pulso.setOnCheckedChangeListener(cheked);
        calidad.setOnCheckedChangeListener(cheked);
        piel.setOnCheckedChangeListener(cheked);
        condicion.setOnCheckedChangeListener(cheked);
    }

    public void evInicial3(View view) {
        Intent intent = new Intent(this, traumatismo.class);
        intent.putExtra("pulso", op1);
        intent.putExtra("calidad", op2);
        intent.putExtra("piel", op3);
        intent.putExtra("condicion", op4);
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
