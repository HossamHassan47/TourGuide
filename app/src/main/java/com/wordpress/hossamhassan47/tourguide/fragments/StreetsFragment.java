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
 * Fragment that used to display Coolest Streets
 *
 */
public class StreetsFragment extends Fragment {
    private RecyclerView recyclerView;
    private AttractionAdapter adapter;
    private List<Attraction> attractions;

    public StreetsFragment() {
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

        attractions.add(new Attraction(getString(R.string.street_title_Muizz),
                getString(R.string.street_desc_muizz),
                R.drawable.street_muizz_street,
                getString(R.string.street_hours_muizz),
                getString(R.string.street_dir_muizz)));
        attractions.add(new Attraction(getString(R.string.street_title_saliba),
                getString(R.string.street_desc_saliba),
                R.drawable.street_saliba_street,
                getString(R.string.street_open_saliba),
                getString(R.string.street_loc_saliba)));
        attractions.add(new Attraction(getString(R.string.street_title_talaat),
                getString(R.string.street_desc_talaat),
                R.drawable.street_talaat_harb_street,
                getString(R.string.street_open_talaat),
                getString(R.string.street_loc_talaat)));
        attractions.add(new Attraction(getString(R.string.street_title_qasr),
                getString(R.string.street_desc_qasr),
                R.drawable.street_qasr_el_nil_street,
                getString(R.string.street_open_qasr),
                getString(R.string.street_loc_qasr)));

    }
}
