package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EvInicial2 extends AppCompatActivity {

    RadioGroup automatismo, auscultacion, hemitorax, sitio;
    String o1, o2, o3, o4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ev_inicial2);
        automatismo = (RadioGroup) findViewById(R.id.automatismo);
        auscultacion = (RadioGroup) findViewById(R.id.auscultacion);
        hemitorax = (RadioGroup) findViewById(R.id.hemitorax);
        sitio = (RadioGroup) findViewById(R.id.sitio);

        RadioGroup.OnCheckedChangeListener cheked = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton13:
                        o1 = "Regular";
                        break;
                    case R.id.radioButton15:
                        o1 = "Irregular";
                        break;
                    case R.id.radioButton16:
                        o1 = "Rapida";
                        break;
                    case R.id.radioButton22:
                        o1 = "Superficial";
                        break;
                    case R.id.radioButton17:
                        o1 = "Apnea";
                        break;
                    case R.id.radioButton18:
                        o2 = "Ruidos Respiratorios Normales";
                        break;
                    case R.id.radioButton19:
                        o2 = "Ruidos respiratorios disminuidos";
                        break;
                    case R.id.radioButton20:
                        o2 = "Ruidos Respiratorios Ausentes";
                        break;
                    case R.id.radioButton21:
                        o3 = "Derecho";
                        break;
                    case R.id.radioButton23:
                        o3 = "Izquierdo";
                        break;
                    case R.id.radioButton27:
                        o4 = "Apice";
                        break;
                    case R.id.radioButton28:
                        o4 = "Base";
                        break;
                }
            }
        };
        automatismo.setOnCheckedChangeListener(cheked);
        auscultacion.setOnCheckedChangeListener(cheked);
        hemitorax.setOnCheckedChangeListener(cheked);
        sitio.setOnCheckedChangeListener(cheked);
    }

    public void evInicial2(View view) {
        Intent intent = new Intent(this, EvInicial3.class);
        intent.putExtra("automatismo", o1);
        intent.putExtra("auscultacion", o2);
        intent.putExtra("hemitorax", o3);
        intent.putExtra("sitio", o4);
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
