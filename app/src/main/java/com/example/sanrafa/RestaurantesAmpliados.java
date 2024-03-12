package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurante;

public class RestaurantesAmpliados extends AppCompatActivity {
Restaurante datosrestaurante;
TextView tituloRestaurante;
ImageView imagenRestaurante;
TextView ubicacionRestaurante;
TextView precioRestaurante;
TextView descripcionRestaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);
        tituloRestaurante=findViewById(R.id.tituloRestaurante);
        imagenRestaurante=findViewById(R.id.imagenRestaurante);
        ubicacionRestaurante=findViewById(R.id.ubicacionRestaurante);
        precioRestaurante=findViewById(R.id.precioRestaurante);
        descripcionRestaurante=findViewById(R.id.descripcionRestaurante);

        datosrestaurante=(Restaurante) getIntent().getSerializableExtra("datosrestaurante");
        tituloRestaurante.setText(datosrestaurante.getNombre());
        imagenRestaurante.setImageResource(datosrestaurante.getFotografia());
        ubicacionRestaurante.setText(datosrestaurante.getUbicacion());
        precioRestaurante.setText(datosrestaurante.getPrecio());
        descripcionRestaurante.setText(datosrestaurante.getDescripcion());



    }
}