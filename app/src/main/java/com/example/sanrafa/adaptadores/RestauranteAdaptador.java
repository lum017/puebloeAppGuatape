package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.HotelesAmpliados;
import com.example.sanrafa.R;
import com.example.sanrafa.RestaurantesAmpliados;
import com.example.sanrafa.moldes.Restaurante;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    public ArrayList<Restaurante> ListaRestaurante;

    public RestauranteAdaptador() {
    }

    public RestauranteAdaptador(ArrayList<Restaurante> listaRestaurante) {
        ListaRestaurante = listaRestaurante;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
       return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder holder, int position) {
    holder.pintarMolde(ListaRestaurante.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaRestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoMoldeRestaurante;
        TextView nombreMoldeRestaurante;
        TextView precioMoldeRestaurante;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoMoldeRestaurante=itemView.findViewById(R.id.fotomolderestaurante);
            nombreMoldeRestaurante=itemView.findViewById(R.id.nombrerestamolde);
            precioMoldeRestaurante=itemView.findViewById(R.id.preciorestamolde);
        }

        public void pintarMolde(Restaurante restaurante) {
            fotoMoldeRestaurante.setImageResource(restaurante.getFotografia());
            nombreMoldeRestaurante.setText(restaurante.getNombre());
            precioMoldeRestaurante.setText(restaurante.getPrecio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), RestaurantesAmpliados.class);
                    intent.putExtra("datosrestaurante",restaurante);
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
