package com.wordpress.hossamhassan47.tourguide.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.hossamhassan47.tourguide.R;
import com.wordpress.hossamhassan47.tourguide.model.Attraction;

import java.util.List;

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.MyViewHolder> {
    private Context mContext;
    private List<Attraction> attractions;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle, txtDescription;
        public ImageView imgThumbnail;

        public MyViewHolder(View view) {
            super(view);

            txtTitle = (TextView) view.findViewById(R.id.text_view_title);
            txtDescription = (TextView) view.findViewById(R.id.text_view_description);
            imgThumbnail = (ImageView) view.findViewById(R.id.image_view_thumbnail);
        }
    }

    public AttractionAdapter(Context mContext, List<Attraction> attractions) {
        this.mContext = mContext;
        this.attractions = attractions;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attraction_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Attraction attraction = attractions.get(position);

        holder.txtTitle.setText(attraction.getTitle());
        holder.txtDescription.setText(attraction.getDescription());
        holder.imgThumbnail.setImageResource(attraction.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return attractions.size();
    }
}
