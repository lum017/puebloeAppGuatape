package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.adaptadores.SitioAdaptador;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class listaSitios extends AppCompatActivity {
    ArrayList<Sitios> listaSitios = new ArrayList<>();
    RecyclerView recyclerViewSitios;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclerViewSitios = findViewById(R.id.listadinamicaSitios);
        recyclerViewSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaSitios();
        SitioAdaptador adaptador= new SitioAdaptador(listaSitios);
        recyclerViewSitios.setAdapter(adaptador);
    }

    public void crearListaSitios() {
        listaSitios.add(new Sitios("Piedra del peñol con recorrido en barco", "Juan perez", "3023590068", "EL peñol ", 4, R.drawable.moldesitios));
        listaSitios.add(new Sitios("Visita al pueblo de zocalos","catalina Restrepo","320650747","pueblo de zocalos",4,R.drawable.pueblodezocalos1));
        listaSitios.add(new Sitios("recorrido en lancha","simon Estrada","3043213456","Represa guatape",5,R.drawable.paseo));
listaSitios.add(new Sitios("recorrido en helicoptero","sebastian Arboleda","3207598754","Viaje guatape",4,R.drawable.viajeheli));
    }
}
