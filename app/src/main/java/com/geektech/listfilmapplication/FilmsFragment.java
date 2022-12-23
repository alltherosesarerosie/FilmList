package com.geektech.listfilmapplication;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmsFragment extends Fragment {
    RecyclerView rvFilm;
    private ArrayList<FilmModel> films =  new ArrayList<>();

    TextView titleTV;
    TextView descTV;
    ImageView imageIV;

    final static String KEY_TITLE = "title";
    final static String KEY_DESC = "desc";
    final static String KEY_IMG = "img";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_films, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFilm = view.findViewById(R.id.film_rv);
        load();
        FilmAdapter adapter = new FilmAdapter(films);
        rvFilm.setAdapter(adapter);
//        clickOnListener();

    }

    private void clickOnListener() {
        initView();
        imageIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextFragment();

            }
        });
    }

    private void nextFragment() {
        Bundle bundle = new Bundle();
        String title = titleTV.getText().toString().trim();
        String desc = descTV.getText().toString().trim();
        String img = String.valueOf(imageIV.getImageAlpha());
        bundle.putString(KEY_TITLE, title);
        bundle.putString(KEY_DESC, desc);
        bundle.putString(KEY_IMG, img);
        FilmDetailFragment filmDetailFragment = new FilmDetailFragment();
        filmDetailFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, filmDetailFragment ).addToBackStack(null).commit();



    }

    private void initView() {
        titleTV =requireActivity().findViewById(R.id.title_tv);
        descTV = requireActivity().findViewById(R.id.description_tv);
        imageIV = requireActivity().findViewById(R.id.film_iv);
    }


    private void load() {
        films.add(new FilmModel(R.drawable.harry, "Harry Potter", "fantasy novels", "10"));
        films.add(new FilmModel(R.drawable.alone, "Home Alone", "Movie", "9.9"));
        films.add(new FilmModel(R.drawable.rapunzel, "Tangled", "Movie", "9.9"));
        films.add(new FilmModel(R.drawable.gravity, "Gravity Falls", "Movie show", "10"));
        films.add(new FilmModel(R.drawable.harry, "Harry Potter", "fantasy novels", "10"));
        films.add(new FilmModel(R.drawable.alone, "Home Alone", "Movie", "9.9"));
        films.add(new FilmModel(R.drawable.rapunzel, "Tangled", "Movie", "9.9"));
        films.add(new FilmModel(R.drawable.gravity, "Gravity Falls", "Movie show", "10"));
        films.add(new FilmModel(R.drawable.harry, "Harry Potter", "fantasy novels", "10"));
        films.add(new FilmModel(R.drawable.alone, "Home Alone", "Movie", "9.9"));
        films.add(new FilmModel(R.drawable.rapunzel, "Tangled", "Movie", "9.9"));
        films.add(new FilmModel(R.drawable.gravity, "Gravity Falls", "Movie show", "10"));
    }
}