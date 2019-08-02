package com.farhan.submissionfilm.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.farhan.submissionfilm.Adapter.Activity.DetailActivity;
import com.farhan.submissionfilm.Model.Movie;
import com.farhan.submissionfilm.R;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ListViewHolder> {
    private ArrayList<Movie> listMovie;
    private Context context;

    public MovieAdapter(Context context,ArrayList<Movie> listMovie) {
        this.context = context;
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_movie, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Movie mov = listMovie.get(position);
        Glide.with(holder.itemView.getContext()).load(mov.getPhoto()).apply(new RequestOptions().fitCenter()).into(holder.imgPoster);
        holder.title.setText(mov.getTitle());
        holder.desc.setText(mov.getDesc());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail = new Intent(context, DetailActivity.class);
                detail.putExtra("movie_id", mov.getId());
                context.startActivity(detail);

            }
        });


    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView title, desc;
        CardView cv;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.img_movie_list);
            title = itemView.findViewById(R.id.title_movie_list);
            desc = itemView.findViewById(R.id.desc_movie_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
