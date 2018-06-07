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
        attractions.add(new Attraction("Pyramids of Giza",
                "The last remaining wonder of the ancient world; for nearly 4000 years, the extraordinary shape, impeccable geometry and sheer bulk of the Giza Pyramids have invited the obvious questions: ‘How were we built, and why?’. Centuries of research have given us parts of the answer. Built as massive tombs on the orders of the pharaohs, they were constructed by teams of workers tens-of-thousands strong. Today they stand as an awe-inspiring tribute to the might, organisation and achievements of ancient Egypt.",
                R.drawable.attraction_pyramids_of_giza,
                "Daily: 8:00 am - 4:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=29.979235,31.134202"));

        attractions.add(new Attraction("Egyptian Museum",
                "One of the world’s most important collections of ancient artefacts, the Egyptian Museum takes pride of place in Downtown Cairo, on the north side of Midan Tahrir. Inside the great domed, oddly pinkish building, the glittering treasures of Tutankhamun and other great pharaohs lie alongside the grave goods, mummies, jewellery, eating bowls and toys of Egyptians whose names are lost to history.",
                R.drawable.attraction_egyptian_museum,
                "Daily: 9:00 am - 7:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.047847,31.233649"));

        attractions.add(new Attraction("Museum of Islamic Art",
                "This museum, on the edge of Islamic Cairo, holds one of the world’s finest collections of Islamic art and is Egypt's (and one of the entire Middle East's) most beautifully curated museums. What’s on display is only a sliver of the 80,000 objects the museum owns, but the selected items are stunning. The museum was heavily damaged in January 2014 in a car-bomb attack on nearby police headquarters but after extensive renovations was finally reopened in early 2017.",
                R.drawable.attraction_museum_of_islamic_art,
                "Daily: 9:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.044362,31.252368"));

        attractions.add(new Attraction("Al Azhar Mosque",
                "Founded in AD 970 as the centrepiece of the newly created Fatimid city, Al Azhar is one of Cairo’s earlier mosques, and its sheikh is considered the highest theological authority for Egyptian Muslims. The building is a harmonious blend of architectural styles, the result of numerous enlargements over more than 1000 years. The tomb chamber, located through a doorway on the left just inside the entrance, has a beautiful mihrab (a niche indicating the direction of Mecca) and should not be missed.",
                R.drawable.attraction_al_azhar_mosque,
                "Daily: 24 hours",
                "https://www.google.com/maps/dir/?api=1&destination=30.045688,31.262685"));

        attractions.add(new Attraction("Khan Al Khalili",
                "The skinny lanes of Khan Al Khalili are basically a medieval-style mall. This agglomeration of shops – many arranged around small courtyards – stocks everything from soap powder to semiprecious stones, not to mention tacky toy camels and alabaster pyramids. Most shops and stalls open from around 9am to well after sundown (except Friday morning and Sunday), although plenty of the souvenir vendors are open as long as there are customers, even on Sunday.",
                R.drawable.attraction_khan_al_khalili,
                "Daily: 24 hours",
                "https://www.google.com/maps/dir/?api=1&destination=30.047739,31.262254"));

        attractions.add(new Attraction("Citadel",
                "Sprawling over a limestone spur on the city's eastern edge, the Citadel, started by Saladin in 1176 as a fortification against the Crusaders, was home to Egypt’s rulers for 700 years. Their legacy is a collection of three very different mosques, several palaces (housing some either underwhelming, or nearly-always closed museums) and a couple of terraces with superb Cairo views – on a clear day you'll see Giza's Pyramids poking up in the far distance.",
                R.drawable.attraction_citadel,
                "Daily: 9:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.029860,31.261105"));

        attractions.add(new Attraction("Mosque of Sayyidna Al Hussein",
                "One of the most sacred Islamic sites in Egypt, this mosque is the reputed burial place of the head of Hussein, the grandson of Prophet Mohammed. Most of the building dates from about 1870, except for the beautiful 14th-century stucco panels on the minaret. The modern metal sculptures in front are elegant Teflon canopies that expand to cover worshippers during Friday prayers. This is one of the few mosques where non-Muslims can't enter.",
                R.drawable.attraction_mosque_of_sayyidna_al_hussein,
                "Daily: 10:00 am - 10:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.047819,31.263169"));

        attractions.add(new Attraction("Cairo Tower",
                "This 187m-high tower is the city’s most famous landmark after the Pyramids. Built in 1961, the structure, which resembles a stylised lotus plant with its latticework casing, was a thumb to the nose at the Americans, who had given Nasser the money used for its construction to buy US arms. The 360-degree views across the city from the top are clearest in the late morning, after the haze burns off, or late afternoon when you can often spy the Pyramids.",
                R.drawable.attraction_cairo_tower,
                "Daily: 8:00 am - midnight, to 1am summer",
                "https://www.google.com/maps/dir/?api=1&destination=30.045915,31.224290"));

    }
}
