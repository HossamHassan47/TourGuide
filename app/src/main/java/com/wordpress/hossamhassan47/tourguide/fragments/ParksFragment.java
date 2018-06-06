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
        attractions.add(new Attraction("Al-Azhar Park",
                "Al-Azhar Park is one of Cairo’s largest parks as it covers a space of 80 acres. The space, originally a garbage dump, took seven years to be transformed to one of the most beautiful parks in Cairo. It opened to the public in 2005 and is located in the heart of historical Cairo, where the Citadel and Al Sultan Hassan Mosque surround it. Its position over a hill gives its visitors a magnificent view of Cairo. The green park has several fountains and restaurants where visitors can enjoy the natural beauty and the breathtaking views of Cairo.",
                R.drawable.park_al_azhar_park,
                "Daily: 9:00 am - 10:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.040632,31.264733"));

        attractions.add(new Attraction("Family Park",
                "The Family Park is one of Cairo’s newest parks. Located on the Suez Road in New Cairo, the park offers many ways to enjoy the beauty of nature as well as amuse children. Activities inside the park can be categorized into two groups: educational and entertaining. An educational center has buildings that look like Bibliotheca Alexandria, the Giza Zoo, and the Martial Museum; all to give knowledge to children. There are also several theaters where kids can perform to the park’s visitors. In addition, the park displays various infotainment movies in its 3D cinema. On the entertainment side, the park has its own mini zoo and safari plaza where kids can see ostriches, ducks, deer, and other animals as well as explore different types of plants. A train takes visitors on a tour around the park and through a lighthouse where riders can see panoramic views of the park.",
                R.drawable.park_family_park,
                "Daily: 9:00 am - 10:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.080482,31.502140"));

        attractions.add(new Attraction("International Park",
                "This park has International in its name because some of its flowers, trees, and animals originate from different countries around the world. One of its entrances has flags of the countries that are represented in the garden. The International Park offers a train ride where visitors can explore its different parts within 15 minutes. There is also a theatre inside the park as well as a mini zoo whose museum contains some mummified bodies and skeletons of animals with a small board of information for each.",
                R.drawable.park_international_park,
                "Daily: 9:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.049414,31.336508"));

        attractions.add(new Attraction("Al Horreya Garden",
                "Located in Zamalek across from Cairo Opera House and Al Andalus Garden, the Al Horreya Garden is known for its unique eleven statues of very important figures who had significant impact and positive change in their countries. Statues at Al Horreya, which means freedom, include Ahmed Shawky, the Prince of Poets, Talaat Harb Basha, a great Egyptian economist, and Hafez Ibrahim, the poet of the Nile. Others include some great people from Mexico, Ecuador, Venezuela, and other Latin-American countries. Most of these statues were gifts to Egypt from the countries they represent. Through the red-bricked pathway across its different parts, palm trees and fresh-green grass, Al Horreya offers a natural escape from Cairo’s noise and crowd.",
                R.drawable.park_al_horreya_garden,
                "Daily: 9:00 am - 7:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.042082,31.225919"));

        attractions.add(new Attraction("Aquarium Grotto Garden",
                "The Aquarium Grotto Garden—also called El Gabalaya Garden after the name of the street where it is located—was built in 1867 by Khedive Ismail, the viceroy of Egypt and Sudan. Unique for its architectural beauty, the garden’s formations are made of clay to look like fish gills. The Aquarium Grotto Garden has many underground grottoes that used to host various unique types of fish from the Nile and other places. Although the number of fish has decreased and some of the grottoes lie empty, the garden still hosts some rare fish that are worth watching. Besides the fish, a wide collection of various types of trees and flowers call the Aquarium Grotto home as well. The garden has been featured in several movies as a romantic spot since 1956.",
                R.drawable.park_aquarium_grotto_garden,
                "Daily: 9:00 am - 4:30 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.056570,31.218614"));

        attractions.add(new Attraction("Gezira Island",
                "Located in the Nile in Central Cairo, three bridges connect Gezira Island across the river. The island was first called “Garden of Plants” because it had a unique variety of plants from all over the world. The northern part—known as Zamalek—is one of Cairo’s most-affluent districts and one of the most-appealing attractions to tourists as well as Egyptians. Besides the natural beauty and the green areas on the island, there are a lot of places to visit like the Cairo Tower, the Cairo Opera House, and the Gezira Sporting Club. It also headquarters many embassies and businesses, the best hotels, and the finest schools, which is why the island is a very attractive place to visit in Cairo.",
                R.drawable.park_gezira_island,
                "Daily: 9:00 am - 10:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.060942,31.219709"));

        attractions.add(new Attraction("Al-Andalus Garden",
                "Formally known as El Tahrir Garden, Al-Andalus is located at the end of Zamalek between the Qasr El Nil and the 6 October bridges. Built by Zulfaqar Basha in 1935, who originally designed it to be part of the royal mansion of Khedive Ismail, the Garden is unique for the Andalusian-architectural style. This can be seen in the design of the entrance as well as the Andalusian-styled arches. Statues include those of some Pharaohs, lions, and one of Ahmed Shawky, the “Prince of Poets”. The park also hosts various types of palm trees and the vine-covered pergolas. A walk through nature with a breathtaking Nile view, attractive natural beauty, and unique-architectural art, Al-Andalus Garden is great escape to enjoy a mixture of distinct cultures, human civilizations, and nature.",
                R.drawable.park_al_andalus_garden,
                "Daily: 9:00 am - 10:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.045573,31.225896"));

        attractions.add(new Attraction("Japanese Garden",
                "The Japanese Garden, located in Helwan, Cairo, was built in 1917 by the Egyptian architect Zulfaqar Basha to represent cultures of the East. Full of fish ponds, hills, canals, and diverse trees the garden is most famous for its unique statues. For example, more than 30 Buddha statues—including the famous seated Buddha statue over a Lotus flower—and three statues of elephants adorn the garden. A lake there contains a statue of the three wise monkeys and their proverbial principle: “See no evil, Hear no evil, Speak no evil”. In front of that lake stands another statue of a master sitting with 48 students to teach them Buddhism. Along with the statues, the garden also has a promenade flanked by lanterns, a tall pagoda—a Buddhist temple—and a gazebo where some bands perform.",
                R.drawable.park_japanese_garden,
                "Daily: 10:00 am - 4:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=29.848854,31.340224"));

        attractions.add(new Attraction("Orman Garden",
                "Orman Garden, one of Egypt’s most famous botanical gardens, was built during Khedive Ismail’s rule in 1875. He ordered French architects to build it as he wanted to provide different types of fruits and vegetables to the royal palace. Brought from different parts of the world including Europe and China, this garden used to host more than 150 types of flowers and over 500 kinds of rare plants. This makes the garden a perfect host for its famous yearly spring festival which attracts visitors during March and April. Covering around 28 acres, the garden also has a pond with a wooden bridge that stretches over it. The Orman, Turkish for the forest, is located west of the Nile River, east of the Cairo University, and next to the Giza Zoo.",
                R.drawable.park_orman_garden,
                "Daily: 9:00 am - 4:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.029038,31.212977"));

    }
}
