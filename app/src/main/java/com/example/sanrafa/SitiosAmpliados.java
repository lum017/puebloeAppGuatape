package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Restaurante;
import com.example.sanrafa.moldes.Sitios;

public class SitiosAmpliados extends AppCompatActivity {
Sitios DatosSitios;
TextView tituloSitios;
ImageView imagenSitios;
TextView calificacionSitios;
TextView nombreGuia;
TextView descripcionSitios;
TextView contactoSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);
        tituloSitios=findViewById(R.id.tituloSitios);
        imagenSitios=findViewById(R.id.imagenSitios);
        calificacionSitios=findViewById(R.id.calificacionSitios);
        nombreGuia=findViewById(R.id.nombreGuia);
        descripcionSitios=findViewById(R.id.descripcionSitios);
        contactoSitios=findViewById(R.id.contactoSitios);

        DatosSitios=(Sitios) getIntent().getSerializableExtra("datosSitios");


        tituloSitios.setText(DatosSitios.getNombre());
        imagenSitios.setImageResource(DatosSitios.getFotografia());
        calificacionSitios.setText(DatosSitios.getCalificacion());
        nombreGuia.setText(DatosSitios.getNombreGuia());
        descripcionSitios.setText(DatosSitios.getDescripcion());
        contactoSitios.setText(DatosSitios.getContacto());


    }
}