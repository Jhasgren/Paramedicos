package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class clinica extends AppCompatActivity {

    CheckBox neurologica, cardiovascular, respiratoria, metabolica, digestiva,
            urogenital, ginecoobstetrica, cognitiva, musculo, infeccioso,
            oncologico, otro, primVez;
    EditText cliEspecifique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinica);
        neurologica = (CheckBox) findViewById(R.id.checkBox15);
        cardiovascular = (CheckBox) findViewById(R.id.checkBox16);
        respiratoria = (CheckBox) findViewById(R.id.checkBox17);
        metabolica = (CheckBox) findViewById(R.id.checkBox18);
        digestiva = (CheckBox) findViewById(R.id.checkBox19);
        urogenital = (CheckBox) findViewById(R.id.checkBox20);

        ginecoobstetrica = (CheckBox) findViewById(R.id.checkBox21);
        cognitiva = (CheckBox) findViewById(R.id.checkBox22);
        musculo = (CheckBox) findViewById(R.id.checkBox23);
        infeccioso = (CheckBox) findViewById(R.id.checkBox24);
        oncologico = (CheckBox) findViewById(R.id.checkBox25);
        otro = (CheckBox) findViewById(R.id.checkBox28);
        primVez = (CheckBox) findViewById(R.id.checkBox26);

        cliEspecifique = (EditText) findViewById(R.id.editText39);
    }

    public void clinica(View view) {
        String cl = "";
        Intent intent = new Intent(this, Resena.class);
        if (neurologica.isChecked()) {
            cl += "Neurologica ";
        }
        if (cardiovascular.isChecked()) {
            cl += "Cardiovascular, ";
        }
        if (respiratoria.isChecked()) {
            cl += "Respiratoria, ";
        }
        if (metabolica.isChecked()) {
            cl += "Metabolica, ";
        }
        if (digestiva.isChecked()) {
            cl += "Digestiva, ";
        }
        if (urogenital.isChecked()) {
            cl += "Urogenital, ";
        }
        if (ginecoobstetrica.isChecked()) {
            cl += "Gineco-Obstetrica, ";
        }
        if (cognitiva.isChecked()) {
            cl += "Cognitiva, ";
        }
        if (musculo.isChecked()) {
            cl += "Musculo-Esqueletica, ";
        }
        if (infeccioso.isChecked()) {
            cl += "Infecciosa, ";
        }
        if (oncologico.isChecked()) {
            cl += "Oncologica, ";
        }
        intent.putExtra("clinica", cl);
        intent.putExtra("primVez", bs(primVez.isChecked()));
        if (otro.isChecked()) {
            intent.putExtra("cliEspecifique", cliEspecifique.getText().toString());
        }else{
            intent.putExtra("cliEspecifique", "");
        }
        intent.putExtras(getIntent());
        startActivity(intent);
    }

    public String bs(boolean v){
        if(v){
            return "si";
        }
        return "no";
    }
}
