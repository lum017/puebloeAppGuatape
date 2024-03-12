package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class listaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerViewHoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);
    }
    public void crearListaHoteles(){

        listaHoteles.add(new Hotel("Hotel Porto Marina","450usd","Este hotel cuenta con habitaciones con aire acondicionado","3246597465","calle 100",5,R.drawable.bannerhoteles));
        listaHoteles.add(new Hotel("Hotel Los Recuerdos","500usd","Este hotel cuenta  con habitaciones con aire acondicionado","3246597465","calle 100",5,R.drawable.losrecuerdos));
        listaHoteles.add(new Hotel("Hotel Pietrasanta","600usd","Este hotel cuenta  con habitaciones con aire acondicionado","3246597465","calle 100",4,R.drawable.pietrasanta));
        listaHoteles.add(new Hotel("Hotel Verony Guatape","450usd","este hotel cuenta con habitaciones con aire acondicionado","3345678986","carrera 40",4,R.drawable.hotelvero));
        listaHoteles.add(new Hotel("Hotel boutique","550usd","este hotel tiene una gran vista","334567893","carrera 32",3,R.drawable.hotelbouti));


    }
}