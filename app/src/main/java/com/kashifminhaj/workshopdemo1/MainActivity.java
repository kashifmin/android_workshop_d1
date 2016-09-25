package com.kashifminhaj.workshopdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        albumList = getAlbumList();

        adapter = new AlbumsAdapter(this, albumList);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private List<Album> getAlbumList() {
        List<Album> albums = new ArrayList<>();
        Album newAlbum = new Album("Dhoom 3", 5);
        albums.add(newAlbum);

        newAlbum = new Album("3 Idiots", 3);
        albums.add(newAlbum);

        newAlbum = new Album("Insomnia", 6);
        albums.add(newAlbum);

        newAlbum = new Album("Maroon 5", 10);
        albums.add(newAlbum);

        return albums;
    }
}
