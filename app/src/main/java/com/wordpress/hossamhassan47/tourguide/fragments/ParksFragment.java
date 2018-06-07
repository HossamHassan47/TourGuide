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
 * Fragment that used to display National Parks and Gardens
 *
 */
public class ParksFragment extends Fragment {

    private RecyclerView recyclerView;
    private AttractionAdapter adapter;
    private List<Attraction> attractions;

    public ParksFragment() {
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
        attractions.add(new Attraction(getString(R.string.park_azhar_title),
                getString(R.string.park_azhar_desc),
                R.drawable.park_al_azhar_park,
                getString(R.string.park_azhar_open),
                getString(R.string.park_azhar_loc)));

        attractions.add(new Attraction(getString(R.string.park_family_title),
                getString(R.string.park_family_desc),
                R.drawable.park_family_park,
                getString(R.string.park_family_open),
                getString(R.string.park_family_loc)));

        attractions.add(new Attraction(getString(R.string.park_inter_title),
                getString(R.string.park_inter_desc),
                R.drawable.park_international_park,
                getString(R.string.park_inter_open),
                getString(R.string.park_inter_loc)));

        attractions.add(new Attraction(getString(R.string.park_hor_title),
                getString(R.string.park_hor_desc),
                R.drawable.park_al_horreya_garden,
                getString(R.string.park_hor_open),
                getString(R.string.park_hor_loc)));

        attractions.add(new Attraction(getString(R.string.park_gro_title),
                getString(R.string.park_gro_desc),
                R.drawable.park_aquarium_grotto_garden,
                getString(R.string.park_gro_open),
                getString(R.string.park_gro_loc)));

        attractions.add(new Attraction(getString(R.string.park_gez_title),
                getString(R.string.park_gez_desc),
                R.drawable.park_gezira_island,
                getString(R.string.park_gez_open),
                getString(R.string.park_gez_loc)));

        attractions.add(new Attraction(getString(R.string.park_and_title),
                getString(R.string.park_and_desc),
                R.drawable.park_al_andalus_garden,
                getString(R.string.park_and_open),
                getString(R.string.park_and_loc)));

        attractions.add(new Attraction(getString(R.string.park_jap_title),
                getString(R.string.park_jap_desc),
                R.drawable.park_japanese_garden,
                getString(R.string.park_jap_open),
                getString(R.string.park_jap_loc)));

        attractions.add(new Attraction(getString(R.string.park_orm_title),
                getString(R.string.park_orm_desc),
                R.drawable.park_orman_garden,
                getString(R.string.park_orm_open),
                getString(R.string.park_orm_loc)));

    }
}
