package com.geektech.listfilmapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmViewHolder> {
    private ArrayList<FilmModel> films;

    public FilmAdapter(ArrayList<FilmModel> films) {
        this.films = films;
    }
    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.film_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.bind(films.get(position).img, films.get(position).title, films.get(position).description, films.get(position).point);
    }

    @Override
    public int getItemCount() {
        return films.size();
    }
}
