package com.geektech.listfilmapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmViewHolder extends RecyclerView.ViewHolder {
    TextView titleTV;
    TextView descriptionTV;
    TextView pointsTV;
    ImageView imageIV;

    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        imageIV = itemView.findViewById(R.id.film_iv);
        titleTV = itemView.findViewById(R.id.title_tv);
        descriptionTV = itemView.findViewById(R.id.description_tv);
        pointsTV = itemView.findViewById(R.id.points_tv);



    }

    public void bind(int img, String title, String desc, String point ){
        imageIV.setImageResource(img);
        titleTV.setText(title);
        descriptionTV.setText(desc);
        pointsTV.setText(point);
    }
}
