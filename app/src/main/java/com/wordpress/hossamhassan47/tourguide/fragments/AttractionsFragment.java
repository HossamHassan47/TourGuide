package com.wordpress.hossamhassan47.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wordpress.hossamhassan47.tourguide.R;
import com.wordpress.hossamhassan47.tourguide.adapters.AttractionAdapter;
import com.wordpress.hossamhassan47.tourguide.model.Attraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Fragment that used to display Top Attraction locations
 *
 */
public class AttractionsFragment extends Fragment {
    private RecyclerView recyclerView;
    private AttractionAdapter adapter;
    private List<Attraction> attractions;

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_attractions, container, false);

        // Get Mosques list
        fillAttractionsList();

        // Get Recycler View
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        // Set Adapter
        adapter = new AttractionAdapter(getContext(), attractions);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    public void fillAttractionsList() {
        attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.attract_title_pyramid),
                getString(R.string.attract_pyramid_desc),
                R.drawable.attraction_pyramids_of_giza,
                getString(R.string.attract_pyramid_open),
                getString(R.string.attract_pyramid_loc)));

        attractions.add(new Attraction(getString(R.string.attract_egymus_title),
                getString(R.string.attract_egymus_desc),
                R.drawable.attraction_egyptian_museum,
                getString(R.string.attract_egymus_open),
                getString(R.string.attract_egymus_loc)));

        attractions.add(new Attraction(getString(R.string.attract_islamicart_title),
                getString(R.string.attract_islamicart_desc),
                R.drawable.attraction_museum_of_islamic_art,
                getString(R.string.attract_islamicart_open),
                getString(R.string.attract_islamicart_loc)));

        attractions.add(new Attraction(getString(R.string.attract_azhar_title),
                getString(R.string.attract_azhar_desc),
                R.drawable.attraction_al_azhar_mosque,
                getString(R.string.attract_azhar_open),
                getString(R.string.attract_azhar_loc)));

        attractions.add(new Attraction(getString(R.string.attract_khan_title),
                getString(R.string.attract_khan_desc),
                R.drawable.attraction_khan_al_khalili,
                getString(R.string.attract_khan_open),
                getString(R.string.attract_khan_loc)));

        attractions.add(new Attraction(getString(R.string.attract_citadel_title),
                getString(R.string.attract_citadel_desc),
                R.drawable.attraction_citadel,
                getString(R.string.attract_citadel_open),
                getString(R.string.attract_citadel_loc)));

        attractions.add(new Attraction(getString(R.string.attract_hussein_title),
                getString(R.string.attract_hussein_desc),
                R.drawable.attraction_mosque_of_sayyidna_al_hussein,
                getString(R.string.attract_hussein_open),
                getString(R.string.attract_hussein_loc)));

        attractions.add(new Attraction(getString(R.string.attract_tower_title),
                getString(R.string.attract_tower_desc),
                R.drawable.attraction_cairo_tower,
                getString(R.string.attract_tower_open),
                getString(R.string.attract_tower_loc)));

    }
}
