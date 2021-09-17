package com.example.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixster.models.Movie;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    TextView tvMovieName;
    TextView tvSummary;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvMovieName = findViewById(R.id.tvMovieName);
        tvSummary = findViewById(R.id.tvSummary);
        ratingBar = findViewById(R.id.ratingBar);

        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        tvMovieName.setText(movie.getTitle());
        tvSummary.setText(movie.getOverview());
        ratingBar.setRating((float) movie.getRating());
    }
}