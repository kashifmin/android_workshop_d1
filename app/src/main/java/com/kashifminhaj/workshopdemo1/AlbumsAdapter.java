package com.kashifminhaj.workshopdemo1;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kashif on 25/9/16.
 */

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.ViewHolder> {

    private Context context;
    private List<Album> albumList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view.findViewById(R.id.card_view);
        }
    }

    public AlbumsAdapter(Context mContext, List<Album> mAlbums) {
        this.context = mContext;
        this.albumList = mAlbums;
    }


    /*
     *
     * Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
     *
     */
    @Override
    public AlbumsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_album, parent, false);
        return new ViewHolder(view);
    }

    /*
     *
     * Called by RecyclerView to display the data at the specified position.
     *
     */
    @Override
    public void onBindViewHolder(AlbumsAdapter.ViewHolder holder, int position) {
        TextView title = (TextView) holder.cardView.findViewById(R.id.title);
        TextView count = (TextView) holder.cardView.findViewById(R.id.count);
        //ImageView artwork = (ImageView) holder.cardView.findViewById(R.id.thumbnail);

        Album currentAlbum = albumList.get(position);
        title.setText(currentAlbum.getTitle());
        count.setText(String.valueOf(currentAlbum.getCount()));

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
