package com.ucc.ucc_saam.HelperClasses.HomeAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ucc.ucc_saam.R;
import com.ucc.ucc_saam.RetoEspecificoActivity;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.ArrayList;

public class RetoAdapter extends RecyclerView.Adapter<RetoAdapter.RetosViewHolder> {
    ArrayList<RetoHelperClass> retos;

    public RetoAdapter(ArrayList<RetoHelperClass> retos) {
        this.retos = retos;
    }

    @NonNull
    @NotNull
    @Override
    public RetosViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reto_card_design, parent, false);
        return new RetosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RetosViewHolder holder, int position) {
        final RetoHelperClass retoHelperClass = retos.get(position);

        holder.image.setImageResource(retoHelperClass.getImage());
        holder.title.setText(retoHelperClass.getTitle());
        holder.points.setText(retoHelperClass.getPoints());

        holder.card.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SeleccionarReto(v, retoHelperClass);
            }
        });
    }

    @Override
    public int getItemCount() {
        return retos.size();
    }

    public static class RetosViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, points;
        LinearLayout card;

        public RetosViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.reto_image);
            title = itemView.findViewById(R.id.reto_title);
            points = itemView.findViewById(R.id.reto_points);

            card = itemView.findViewById(R.id.card_reto);

        }
    }

    public void SeleccionarReto(View v, RetoHelperClass retoHelperClass){
        Context context = v.getContext();
        Intent intent= new Intent(context, RetoEspecificoActivity.class);
        intent.putExtra("reto", retoHelperClass);
        context.startActivity(intent);
    }
}
