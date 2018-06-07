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
 * Fragment that used to display Most Beautiful Mosques
 *
 */
public class MosquesFragment extends Fragment {

    private RecyclerView recyclerView;
    private AttractionAdapter adapter;
    private List<Attraction> attractions;

    public MosquesFragment() {
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

        attractions.add(new Attraction(getString(R.string.mosq_ali_title),
                getString(R.string.mosq_ali_desc),
                R.drawable.mosque_mohamed_ali,
                getString(R.string.mosq_ali_open),
                getString(R.string.mosq_ali_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_as_title),
                getString(R.string.mosq_as_desc),
                R.drawable.mosque_amr_ibn_alas,
                getString(R.string.mosq_as_open),
                getString(R.string.mosq_as_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_tulun_title),
                getString(R.string.mosq_tulun_desc),
                R.drawable.mosque_ibn_tulun,
                getString(R.string.mosq_tulun_open),
                getString(R.string.mosq_tulun_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_hassan_title),
                getString(R.string.mosq_hassan_desc),
                R.drawable.mosque_sultan_hassan,
                getString(R.string.mosq_hassan_open),
                getString(R.string.mosq_hassan_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_rifa_title),
                getString(R.string.mosq_rifa_desc),
                R.drawable.mosque_al_rifa_i_mosque,
                getString(R.string.mosq_rifa_open),
                getString(R.string.mosq_rifa_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_hakim_title),
                getString(R.string.mosq_hakim_desc),
                R.drawable.mosque_al_hakim_bi_amr_allah_mosque,
                getString(R.string.mosq_hakim_open),
                getString(R.string.mosq_hakim_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_azhar_title),
                getString(R.string.mosq_azhar_desc),
                R.drawable.mosque_al_azhar_mosque,
                getString(R.string.mosq_azhar_open),
                getString(R.string.mosq_azhar_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_qala_title),
                getString(R.string.mosq_qala_desc),
                R.drawable.mosque_qalawun_complex,
                getString(R.string.mosq_qala_open),
                getString(R.string.mosq_qala_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_aqsun_title),
                getString(R.string.mosq_aqsun_desc),
                R.drawable.mosque_aqsunqur_mosque,
                getString(R.string.mosq_aqsun_open),
                getString(R.string.mosq_aqsun_loc)));

        attractions.add(new Attraction(getString(R.string.mosq_naser_title),
                getString(R.string.mosq_naser_desc),
                R.drawable.mosque_al_nasser_mohammed_mosque,
                getString(R.string.mosq_naser_open),
                getString(R.string.mosq_naser_loc)));
    }
}
