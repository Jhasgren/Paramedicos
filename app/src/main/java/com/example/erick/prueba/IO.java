package com.example.erick.prueba;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IO {
    private String recurso;
    private List<String> datos;

    public IO(Context context, String recurso) {
        this.recurso = recurso;
        try {
            datos = new ArrayList<>();
            InputStream asset = context.getAssets().open("bd.txt");
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(asset, "UTF-8"));
            String str;
            while ((str = in.readLine()) != null) {
                datos.add(str);
            }
            in.close();
            Log.e("io", "datos" + datos.toString());
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
