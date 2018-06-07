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
        attractions.add(new Attraction("Muizz Street",
                "Muizz Street should totally be on the top of your list when visiting Cairo. Named after the fourth Fatimid Caliph Al-Mu’izz li-Deen Illah, Muizz Street is considered to be one of the oldest streets in Cairo and is one of the most vibrant and historic spots in the city. It extends from Bab A-Futuh (one of three remaining gates in the walls of Old Cairo) to Bab Zuweila, where you’ll find several markets in Al-Azhar Street and the Ghuriya Complex and the area around it. Here, there are plenty of stalls to buy souvenirs and antiques from. The whole area is rich with dozens of historic buildings from different eras including the Tulunid, Fatimid and Mamluk eras. According to a United Nation’s study, the street contains the largest gathering of medieval architectural treasures in the Islamic world.",
                R.drawable.street_muizz_street,
                "Daily: 24 hours",
                "https://www.google.com/maps/dir/?api=1&destination=30.050931,31.261575"));
        attractions.add(new Attraction("Saliba Street",
                "Saliba (Cross) Street is another significant historic spot that dates back to the Middle Ages’ Cairo with numerous examples of great architecture from the Islamic period. The area, which now can be considered as an open-air museum, was once a residence to the state’s most important men — mostly from 1312 until 1517. Extending from the Citadel to the Ibn Tulun, and Sayyida Zeinab Mosque, the area has an abundance of Islamic monuments including mosques, schools, kuttab (an Islamic primary school mostly connected to the mosque), shrines and others.",
                R.drawable.street_saliba_street,
                "Daily: 24 hours",
                "https://www.google.com/maps/dir/?api=1&destination=30.030432,31.251241"));
        attractions.add(new Attraction("Talaat Harb Street",
                "Named after Talaat Pasha Harb, a famous Egyptian economist, the street was once a center for many social activities among the elites in Cairo. Now, it is considered as one of the most active streets in the city. It is located in the heart of Cairo’s European-ized area, Wust El-Balad (downtown). While strolling the street, you’ll be fascinated with the elegant historic buildings and the artistic atmosphere. You’ve got to try taking a walk there late at night.",
                R.drawable.street_talaat_harb_street,
                "Daily: 24 hours",
                "https://www.google.com/maps/dir/?api=1&destination=30.048963,31.239492"));
        attractions.add(new Attraction("Qasr El Nil Street",
                "One of the biggest streets in Wust El-Balad and a home to several stores, nightlife spots, and important historic landmarks in Cairo is Qasr El Nil Street. It starts from Abdeen Square, passing by Bab El-Louq Market, American University downtown, Tahrir Square and the Egyptian Museum until it crosses the Nile through Qasr El Nil Bridge and then reaches Gezira Island. The important landmarks located here include Abdeen Palace (a historic royal residence), Egyptian Museum, Mogamma El Tahrir, Cairo Opera House and Museum Of Modern Egyptian Art.",
                R.drawable.street_qasr_el_nil_street,
                "Daily: 24 hours",
                "https://www.google.com/maps/dir/?api=1&destination=30.043747,31.229464"));

    }
}
