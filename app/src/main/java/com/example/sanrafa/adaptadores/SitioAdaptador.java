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
import com.example.sanrafa.SitiosAmpliados;
import com.example.sanrafa.moldes.Sitios;
import com.example.sanrafa.sitios;

import java.util.ArrayList;

public class  SitioAdaptador extends RecyclerView.Adapter<SitioAdaptador.viewHolder> {

    //atributos de la clase
    public ArrayList<Sitios>listaSitios;

    public SitioAdaptador() {
    }

    public SitioAdaptador (ArrayList<Sitios> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public SitioAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
   View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null, false);
   return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull SitioAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoMoldeSitios;
        TextView nombreMoldeSitios;
        TextView contactoMoldeSitios;
        TextView guiaMoldeSitios;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoMoldeSitios=itemView.findViewById(R.id.fotomoldesitios);
            nombreMoldeSitios=itemView.findViewById(R.id.nombresitiosmolde);
            contactoMoldeSitios=itemView.findViewById(R.id.conctatositiosmolde);
            guiaMoldeSitios=itemView.findViewById(R.id.guiasitiomolde);
        }

        public void pintarMolde(Sitios sitios) {
            fotoMoldeSitios.setImageResource(sitios.getFotografia());
            nombreMoldeSitios.setText(sitios.getNombre());
            contactoMoldeSitios.setText(sitios.getContacto());
            guiaMoldeSitios.setText(sitios.getNombreGuia());
            //Quiero escucchar clic en cada uno de los elementos de la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), SitiosAmpliados.class);
                    intent.putExtra("datosSitios",sitios);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
