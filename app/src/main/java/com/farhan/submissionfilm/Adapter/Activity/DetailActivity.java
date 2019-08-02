package com.farhan.submissionfilm.Adapter.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.farhan.submissionfilm.Data.MovieData;
import com.farhan.submissionfilm.Model.Movie;
import com.farhan.submissionfilm.R;

import java.util.ArrayList;
import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    private int movie_id;
    ImageView imgDetail;
    TextView titleDetail, descDetail;
    private ArrayList<Movie> listMov = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        movie_id = getIntent().getIntExtra("movie_id",0);
        imgDetail = findViewById(R.id.img_detail);
        titleDetail = findViewById(R.id.title_detail);
        descDetail = findViewById(R.id.desc_detail);

        listMov.addAll(MovieData.getListData());
        getSupportActionBar().setTitle(listMov.get(movie_id).getTitle());

        setLayout();
    }

    void setLayout(){
        titleDetail.setText(listMov.get(movie_id).getTitle());
        descDetail.setText(listMov.get(movie_id).getDesc());
        Glide.with(this).load(listMov.get(movie_id).getPhoto()).apply(new RequestOptions().fitCenter()).into(imgDetail);
    }
}
