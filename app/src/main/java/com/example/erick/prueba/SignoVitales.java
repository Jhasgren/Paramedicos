package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignoVitales extends AppCompatActivity {

    EditText frecCardiaca, frecResp, tensArt1, tensArt2, oximetria, glucosa, temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo_vitales);
        frecCardiaca = (EditText) findViewById(R.id.editText32);
        frecResp = (EditText) findViewById(R.id.editText33);
        tensArt1 = (EditText) findViewById(R.id.editText34);
        tensArt2 = (EditText) findViewById(R.id.editText38);
        oximetria = (EditText) findViewById(R.id.editText35);
        glucosa = (EditText) findViewById(R.id.editText36);
        temp = (EditText) findViewById(R.id.editText37);
    }

    public void signoVitales(View view) {
        Intent intent = new Intent(this, clinica.class);
        intent.putExtra("frecCardiaca", frecCardiaca.getText().toString());
        intent.putExtra("frecResp", frecResp.getText().toString());
        intent.putExtra("tensArt1", tensArt1.getText().toString());
        intent.putExtra("tensArt2", tensArt2.getText().toString());
        intent.putExtra("oximetria", oximetria.getText().toString());
        intent.putExtra("glucosa", glucosa.getText().toString());
        intent.putExtra("temp", temp.getText().toString());
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
