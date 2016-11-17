package com.example.erick.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resumen extends AppCompatActivity {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        new Thread() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        res = (TextView) findViewById(R.id.textView40);
                        res.append("Delegacion: " + getIntent().getStringExtra("delegacion") + "\n");
                        res.append("Estado: " + getIntent().getStringExtra("estado") + "\n");
                        res.append("Asignacion: " + getIntent().getStringExtra("asignacion") + "\n\n");

                        res.append("Datos de servicio\n");
                        res.append("Fecha: " + getIntent().getStringExtra("fecha") + "\n");
                        res.append("Dia: " + getIntent().getStringExtra("dia") + "\n");
                        res.append("Hora de llamada: " + getIntent().getStringExtra("horaLlamada") + "\n");
                        res.append("Hora de salida: " + getIntent().getStringExtra("horaSalida") + "\n");
                        res.append("Hora de llegada: " + getIntent().getStringExtra("horaLlegada") + "\n");
                        res.append("Hora de traslado: " + getIntent().getStringExtra("horaTraslado") + "\n");
                        res.append("Hora en hospital: " + getIntent().getStringExtra("horaHospital") + "\n");
                        res.append("Hora de base: " + getIntent().getStringExtra("horaBase") + "\n\n");

                        res.append("Calle: " + getIntent().getStringExtra("calle") + "\n");
                        res.append("Numero: " + getIntent().getStringExtra("numero") + "\n");
                        res.append("Entre calle: " + getIntent().getStringExtra("entreA") + "\n");
                        res.append("Entre calle: " + getIntent().getStringExtra("entreB") + "\n");
                        res.append("Colonia: " + getIntent().getStringExtra("colonia") + "\n");
                        res.append("Municipio: " + getIntent().getStringExtra("municipio") + "\n");
                        res.append("Tipo de servicio: " + getIntent().getStringExtra("tipoServicio") + "\n\n");

                        res.append("Datos de control\n");
                        res.append("Numero de ambulancia: " + getIntent().getStringExtra("numAmbulancia") + "\n");
                        res.append("Operador: " + getIntent().getStringExtra("operador") + "\n");
                        res.append("Prestador de servicio 1: " + getIntent().getStringExtra("sv1") + "\n");
                        res.append("Prestador de servicio 2: " + getIntent().getStringExtra("sv2") + "\n");
                        res.append("Prestador de servicio 3: " + getIntent().getStringExtra("sv3") + "\n\n");

                        res.append("Datos del paciente\n");
                        res.append("Nombre: " + getIntent().getStringExtra("pacienteNombre") + "\n");
                        res.append("Direccion: " + getIntent().getStringExtra("pacienteDireccion") + "\n");
                        res.append("Telefono: " + getIntent().getStringExtra("pacienteTelefono") + "\n");
                        res.append("Ocupacion: " + getIntent().getStringExtra("pacienteOcupacion") + "\n");
                        res.append("Edad: " + getIntent().getStringExtra("pacienteEdad") + "\n");
                        res.append("Sexo: " + getIntent().getStringExtra("pacienteSexo") + "\n\n");

                        res.append("Evaluacion inicial\n");
                        res.append("Estado de conciencia y via aerea\n");
                        res.append("Nivel de conciencia: " + getIntent().getStringExtra("conciencia") + "\n");
                        res.append("Via aerea: " + getIntent().getStringExtra("via") + "\n");
                        res.append("Reflejo de deglucion: " + getIntent().getStringExtra("deglucion") + "\n\n");

                        res.append("Ventilacion\n");
                        res.append("Automatismo: " + getIntent().getStringExtra("automatismo") + "\n");
                        res.append("Auscultacion: " + getIntent().getStringExtra("auscultacion") + "\n");
                        res.append("Hemitorax: " + getIntent().getStringExtra("hemitorax") + "\n");
                        res.append("Sitio: " + getIntent().getStringExtra("sitio") + "\n\n");

                        res.append("Circulacion\n");
                        res.append("Pulso: " + getIntent().getStringExtra("pulso") + "\n");
                        res.append("Calidad: " + getIntent().getStringExtra("calidad") + "\n");
                        res.append("Piel: " + getIntent().getStringExtra("piel") + "\n");
                        res.append("Condicion: " + getIntent().getStringExtra("condicion") + "\n\n");

                        res.append("Origen probable\n");
                        res.append("Traumatismo: " + getIntent().getStringExtra("traumatismo") + "\n\n");
                        res.append("Causa de lesiones: " + getIntent().getStringExtra("causaLesiones") + "\n\n");
                        res.append("Especifique: " + getIntent().getStringExtra("especifique") + "\n\n");

                        res.append("Signos vitales\n");
                        res.append("Frecuencia cardiaca: " + getIntent().getStringExtra("frecCardiaca") + "\n");
                        res.append("Frecuencia respiratoria: " + getIntent().getStringExtra("frecResp") + "\n");
                        res.append("Tension arterial: " + getIntent().getStringExtra("tensArt1") + "\n");
                        res.append("Tension arterial: " + getIntent().getStringExtra("tensArt2") + "\n");
                        res.append("Oximetria: " + getIntent().getStringExtra("oximetria") + "\n");
                        res.append("Glucosa: " + getIntent().getStringExtra("glucosa") + "\n");
                        res.append("Temperatura: " + getIntent().getStringExtra("temp") + "\n\n");

                        res.append("Origen probable\n");
                        res.append("Causa clinica: " + getIntent().getStringExtra("clinica") + "\n");
                        res.append("Especifique: " + getIntent().getStringExtra("cliEspecifique") + "\n");
                        res.append("Primera vez: " + getIntent().getStringExtra("primVez") + "\n\n");

                        res.append("Narrativo de examen fisico\n");
                        res.append("y tratamiento\n");
                        res.append("Narrativo: " + getIntent().getStringExtra("narrativo") + "\n");
                    }
                });
            }
        }.start();
    }
}
