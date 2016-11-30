package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void menu(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.button15:
                intent = new Intent(this, EvInicial2.class);
                break;
            case R.id.button16:
                intent = new Intent(this, EvInicial.class);
                break;
            case 17:
                intent = new Intent(this, Datos_paciente.class);
                break;
            case R.id.button18:
                intent = new Intent(this, control.class);
                break;
            case R.id.button19:
                intent = new Intent(this, Datos_Servicio2.class);
                break;
            case R.id.button20:
                intent = new Intent(this, DatosServicio.class);
                break;
            case R.id.button21:
                intent = new Intent(this, Delegacion.class);
                break;
            case R.id.button23:
                intent = new Intent(this, SignoVitales.class);
                break;
            case R.id.button24:
                intent = new Intent(this, traumatismo.class);
                break;
            case R.id.button25:
                intent = new Intent(this, EvInicial3.class);
                break;
            case R.id.button26:
                intent = new Intent(this, Resena.class);
                break;
            case R.id.button27:
                intent = new Intent(this, clinica.class);
                break;
            case R.id.button28:
                intent = new Intent(this, Resumen.class);
                break;
        }
        startActivity(intent);
    }
}
