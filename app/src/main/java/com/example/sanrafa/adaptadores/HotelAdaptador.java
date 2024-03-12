package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.Hoteles;
import com.example.sanrafa.HotelesAmpliados;
import com.example.sanrafa.R;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {
//atributos de la clase
    public ArrayList<Hotel> listaHoteles;
    //constructor vacio

    public HotelAdaptador() {
    }

    //constructor lleno


    public HotelAdaptador(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
   View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
   return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder holder, int position) {

        holder.pintarMolde(listaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        //asocio los elementos del xml del molde
        ImageView fotoHotelMolde;
        TextView nombreHotelMolde;
        TextView precioHotelMolde;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotelMolde=itemView.findViewById(R.id.fotomoldehotel);
            nombreHotelMolde=itemView.findViewById(R.id.nombrehotelmolde);
            precioHotelMolde=itemView.findViewById(R.id.preciohotelmolde);
        }

        public void pintarMolde(Hotel hotel) {
            fotoHotelMolde.setImageResource(hotel.getFotografia());
            nombreHotelMolde.setText(hotel.getNombre());
            precioHotelMolde.setText(hotel.getPrecio());
         //Quiero escucchar clic en cada uno de los elementos de la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), HotelesAmpliados.class);
                    intent.putExtra("datoshotel",hotel);
                    itemView.getContext().startActivity(intent);


                }
            });

        }
    }
}
