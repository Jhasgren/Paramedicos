package com.example.erick.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Datos_Servicio2 extends AppCompatActivity {
    EditText calle, numero, entreA, entreB, colonia, municipio;
    RadioButton enfermedad, traumatismo, gineco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos__servicio2);
        calle = (EditText) findViewById(R.id.editText14);
        numero = (EditText) findViewById(R.id.editText15);
        entreA = (EditText) findViewById(R.id.editText16);
        entreB = (EditText) findViewById(R.id.editText17);
        colonia = (EditText) findViewById(R.id.editText18);
        municipio = (EditText) findViewById(R.id.editText19);
        enfermedad = (RadioButton) findViewById(R.id.radioButton);
        traumatismo = (RadioButton) findViewById(R.id.radioButton2);
        gineco = (RadioButton) findViewById(R.id.radioButton3);
    }

    public void datosServicio2(View view) {
        if(view.getId()==R.id.button4){
            Intent intent = new Intent(this, control.class);
            intent.putExtra("calle", calle.getText().toString());
            intent.putExtra("numero", numero.getText().toString());
            intent.putExtra("entreA", entreA.getText().toString());
            intent.putExtra("entreB", entreB.getText().toString());
            intent.putExtra("colonia", colonia.getText().toString());
            intent.putExtra("municipio", municipio.getText().toString());
            if (enfermedad.isChecked()) {
                intent.putExtra("tipoServicio", "enfermedad");
            } else if (traumatismo.isChecked()) {
                intent.putExtra("tipoServicio", "traumatismo");
            } else {
                intent.putExtra("tipoServicio", "gineco");
            }
            intent.putExtras(getIntent());
            startActivity(intent);
        }else{
            startActivityForResult(new Intent(this, UbicacionActivity.class), 0);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
