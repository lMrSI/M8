package com.example.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Puntuaciones extends ListActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.puntuaciones);
        //setListAdapter(new ArrayAdapter(this, R.layout.elemento_lista, R.id.titulo, MainActivity.almacen.listaPuntuaciones(10)));
        setListAdapter(new MiAdaptador(this, MainActivity.almacen.listaPuntuaciones(10)));
    }
}
