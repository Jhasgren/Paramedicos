package com.example.erick.prueba;

import android.content.Context;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ing_l on 17/11/2016.
 */

public class IO {
    private String recurso;
    private List<String> datos;

    public IO(Context context, String recurso) {
        this.recurso = recurso;
        try {
            Scanner scanner = new Scanner(context.getAssets().open(recurso));
            datos = new ArrayList<>();
            while (scanner.hasNext()) {
                datos.add(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getRecurso() {
        return recurso;
    }

    public List<String> getDatos() {
        return datos;
    }
}
