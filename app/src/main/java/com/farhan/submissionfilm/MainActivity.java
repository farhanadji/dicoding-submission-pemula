package com.farhan.submissionfilm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.farhan.submissionfilm.Adapter.Activity.About;
import com.farhan.submissionfilm.Adapter.Activity.DetailActivity;
import com.farhan.submissionfilm.Adapter.MovieAdapter;
import com.farhan.submissionfilm.Data.MovieData;
import com.farhan.submissionfilm.Model.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Movie> mov = new ArrayList<>();
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = findViewById(R.id.rv_movies);
        rv.setHasFixedSize(true);

        mov.addAll(MovieData.getListData());
        showData();
    }

    void showData(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        MovieAdapter adapter = new MovieAdapter(this,mov);
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.menu = menu;
        getMenuInflater().inflate(R.menu.menu,menu);
        invalidateOptionsMenu();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_about){
            Intent about = new Intent(this, About.class);
            startActivity(about);
        }
        return super.onOptionsItemSelected(item);
    }
}
