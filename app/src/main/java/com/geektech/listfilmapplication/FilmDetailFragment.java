package com.geektech.listfilmapplication;

import static com.geektech.listfilmapplication.FilmsFragment.KEY_DESC;
import static com.geektech.listfilmapplication.FilmsFragment.KEY_IMG;
import static com.geektech.listfilmapplication.FilmsFragment.KEY_TITLE;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmDetailFragment extends Fragment {
    TextView titleTV;
    TextView descTV;
    ImageView imageIV;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        setViews();

    }

    private void setViews() {
        String title = getArguments().getString(KEY_TITLE);
        String desc = getArguments().getString(KEY_DESC);
        String img = getArguments().getString(KEY_IMG);
        titleTV.setText(title);
        descTV.setText(desc);
        imageIV.setImageResource(Integer.parseInt(img));
    }

    private void initView() {
        titleTV =requireActivity().findViewById(R.id.title_circle);
        descTV = requireActivity().findViewById(R.id.disc_circle);
        imageIV = requireActivity().findViewById(R.id.img_circle);


    }
}