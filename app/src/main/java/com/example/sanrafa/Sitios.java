package com.example.sanrafa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sanrafa.moldes.Sitios;

public class sitios extends AppCompatActivity{
    Button botonVerSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);

        botonVerSitios=findViewById(R.id.botonhomesitios);
        botonVerSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sitios.this,listaSitios.class);
                startActivity(intent);
            }
        });
    }
}

