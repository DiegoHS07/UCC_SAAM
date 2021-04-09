package com.ucc.ucc_saam.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ucc.ucc_saam.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>{
    ArrayList<AlbumHelperClass> album;

    public AlbumAdapter(ArrayList<AlbumHelperClass> album) {
        this.album = album;
    }

    @NonNull
    @NotNull
    @Override
    public AlbumAdapter.AlbumViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_card_design, parent, false);
        return new AlbumAdapter.AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AlbumAdapter.AlbumViewHolder holder, int position) {
        AlbumHelperClass albumHelperClass = album.get(position);

        holder.titulo.setText(albumHelperClass.getTitulo());
        holder.organizacion.setText(albumHelperClass.getOrganizacion());
        holder.imagen.setImageResource(albumHelperClass.getImagen());
        holder.fecha.setText(albumHelperClass.getFecha());
    }

    @Override
    public int getItemCount() {
        return album.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView titulo, organizacion, fecha;

        public AlbumViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.album_imagen);
            titulo = itemView.findViewById(R.id.album_titulo);
            organizacion = itemView.findViewById(R.id.album_organizacion);
            fecha = itemView.findViewById(R.id.album_fecha);

        }
    }
}
