package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Delegacion extends AppCompatActivity {

    EditText delegacion, estado, asignacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegacion);
        delegacion = (EditText) findViewById(R.id.editText3);
        estado = (EditText) findViewById(R.id.editText4);
        asignacion = (EditText) findViewById(R.id.editText5);
    }


    public void delegacion(View view) {
        Intent intent = new Intent(this, DatosServicio.class);
        intent.putExtra("delegacion", delegacion.getText().toString());
        intent.putExtra("estado", estado.getText().toString());
        intent.putExtra("asignacion", asignacion.getText().toString());
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
