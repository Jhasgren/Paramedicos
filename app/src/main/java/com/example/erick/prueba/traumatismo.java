package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class traumatismo extends AppCompatActivity {

    CheckBox arma, juguete, automotor, bicicleta, prodBiologico, maquinaria,
    herramienta;
    CheckBox fuego, sustCaliente, susToxica, explosion, ser_humano,
            electricidad, otro;

    EditText especifique, causaLesiones;
    String tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traumatismo);
        arma= (CheckBox) findViewById(R.id.checkBox3);
        juguete= (CheckBox) findViewById(R.id.checkBox4);
        automotor= (CheckBox) findViewById(R.id.checkBox5);
        bicicleta= (CheckBox) findViewById(R.id.checkBox6);
        prodBiologico= (CheckBox) findViewById(R.id.checkBox7);
        maquinaria= (CheckBox) findViewById(R.id.checkBox8);
        herramienta= (CheckBox) findViewById(R.id.checkBox9);

        fuego= (CheckBox) findViewById(R.id.checkBox10);
        sustCaliente= (CheckBox) findViewById(R.id.checkBox11);
        susToxica= (CheckBox) findViewById(R.id.checkBox2);
        explosion= (CheckBox) findViewById(R.id.checkBox12);
        ser_humano= (CheckBox) findViewById(R.id.checkBox13);
        electricidad= (CheckBox) findViewById(R.id.checkBox);
        otro= (CheckBox) findViewById(R.id.checkBox14);
        tr="";

        especifique= (EditText) findViewById(R.id.editText30);
        causaLesiones= (EditText) findViewById(R.id.editText31);
    }

    public void traumatismo(View view){
        Intent intent=new Intent(this, SignoVitales.class);
        intent.putExtra("especifique", especifique.getText().toString());
        intent.putExtra("causaLesiones", causaLesiones.getText().toString());
        if(arma.isChecked()){
            tr+="arma, ";
        }
        if(juguete.isChecked()){
            tr+="juguete, ";
        }
        if(automotor.isChecked()){
            tr+="automotor, ";
        }
        if(bicicleta.isChecked()){
            tr+="bicicleta, ";
        }
        if(prodBiologico.isChecked()){
            tr+="Producto Biologico, ";
        }
        if(maquinaria.isChecked()){
            tr+="Maquinaria, ";
        }
        if(fuego.isChecked()){
            tr+="Fuego, ";
        }
        if(sustCaliente.isChecked()){
            tr+="Sustancia caliente, ";
        }
        if(susToxica.isChecked()){
            tr+="Sustencia Toxica, ";
        }
        if(explosion.isChecked()){
            tr+="Explosion, ";
        }
        if(ser_humano.isChecked()){
            tr+="Ser humano, ";
        }
        if(electricidad.isChecked()){
            tr+="electricidad, ";
        }
        if(otro.isChecked()){
            tr+="otro, ";
        }
        intent.putExtras(getIntent());
        intent.putExtra("traumatismo", tr);
        startActivity(intent);
    }

}
