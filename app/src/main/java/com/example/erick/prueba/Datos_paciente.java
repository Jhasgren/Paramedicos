package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Datos_paciente extends AppCompatActivity {
    EditText pacienteNombre, pacienteDireccion, pacienteTelefono,
            pacienteOcupacion, pacienteEdad;
    RadioButton hombre, mujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_paciente);
        pacienteNombre = (EditText) findViewById(R.id.editText25);
        pacienteDireccion = (EditText) findViewById(R.id.editText26);
        pacienteTelefono = (EditText) findViewById(R.id.editText27);
        pacienteOcupacion = (EditText) findViewById(R.id.editText28);
        pacienteEdad = (EditText) findViewById(R.id.editText29);
        hombre = (RadioButton) findViewById(R.id.radioButton4);
        mujer = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void datosPaciente(View view) {
        Intent intent = new Intent(this, EvInicial.class);
        intent.putExtra("pacienteNombre", pacienteNombre.getText().toString());
        intent.putExtra("pacienteDireccion", pacienteDireccion.getText().toString());
        intent.putExtra("pacienteTelefono", pacienteTelefono.getText().toString());
        intent.putExtra("pacienteOcupacion", pacienteOcupacion.getText().toString());
        intent.putExtra("pacienteEdad", pacienteEdad.getText().toString());
        if (hombre.isChecked()) {
            intent.putExtra("pacienteSexo", "hombre");
        } else {
            intent.putExtra("pacienteSexo", "mujer");
        }
        intent.putExtras(getIntent());
        startActivity(intent);
    }
}
