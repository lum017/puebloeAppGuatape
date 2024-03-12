package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.adaptadores.RestauranteAdaptador;
import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurante;

import java.util.ArrayList;

public class listaRestaurante extends AppCompatActivity {
    ArrayList<Restaurante> listaRestaurante=new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
        recyclerViewRestaurantes=findViewById(R.id.listadinamicaRestaurante);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

       crearListaRestaurante();
        RestauranteAdaptador adaptador=new RestauranteAdaptador(listaRestaurante);
        recyclerViewRestaurantes.setAdapter(adaptador);
    }


    public void crearListaRestaurante()
    {
        listaRestaurante.add(new Restaurante("Brújula food and drinks","calle 30 segundo piso","$ 19.685.040 - $ 314.960.640","tipos de comida Europea, Española, Estadounidense, Asiática, Sudamericana",R.drawable.brujula));
        listaRestaurante.add(new Restaurante("Casa cuba","carrera 25#31b","$ 19.685.040 - $ 314.960.640","tipos de comida:Italiana, Pizzería",R.drawable.molderesta));
        listaRestaurante.add(new Restaurante("Praia Beach Club","carrera 25","$15.000 -$85.000","tipos de comida:Internacional", R.drawable.praia));
        listaRestaurante.add(new Restaurante("Café La Plazoleta Guatapé","carrera 30 #29-50"," 7.874.016 - $ 669.291.328","tipos de comida:cafe",R.drawable.granizado));
        listaRestaurante.add(new Restaurante("Don Oscar Parrilla Malecon","carrera 31-38","$15.000-250.000","tipos de comida:Parrilla colombiana",R.drawable.descarga));
    }
    }
