package com.example.asteroides;

import java.util.Vector;

public class AlmacenPuntuacionesLista implements AlmacenPuntuaciones{
    private Vector puntuaciones;
    public AlmacenPuntuacionesLista(){
        puntuaciones = new Vector();
        puntuaciones.add("123000 Pepito Dominguez");
        puntuaciones.add("111000 Pedro Martinez");
        puntuaciones.add("011000 Paco Pérez");
    }
    @Override
    public void guardarPuntuaciones(int puntos, String nombre, long fecha) {
        puntuaciones.add(0, puntos + "" + nombre);
    }

    @Override
    public Vector<String> listaPuntuaciones(int cantidad) {
        return puntuaciones;
    }
}
