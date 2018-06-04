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
        View rootView = inflater.inflate(R.layout.fragment_mosques, container, false);

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
        attractions.add(new Attraction("MOSQUE OF MUHAMMED ALI",
                "With a distinguished exterior and interior, the Mosque of Muhammed Ali is also known as the Alabaster Mosque. It is one of Egypt’s top tourist attractions. The mosque is situated on the Summit of Saladin Citadel, and has minarets measuring 270 feet in height–way above average! Tourists can view almost all of Cairo from above, including the Giza Plateau. The mosque was built between 1830 and 1957 by prominent architect Yussuf Bushnaq, and was commissioned by Muhammed Ali Pasha, erstwhile ruler of Egypt.",
                R.drawable.mosque_mohamed_ali));
        attractions.add(new Attraction("MOSQUE OF AMR IBN AL-AS",
                "This is a particularly historically significant site, in that it was the first mosque to be built in Africa (641-642 CE). The mosque was home to General Amr Ibn Al-As’s tent, the commander of the Muslim army back then. It also holds the tomb of his son, Abd Allah Ibn Amr Ibn Al-As. The mosque was the first real university in the entire world, a center for learning and teaching, although it no longer serves this purpose. The site has been expanded and reconstructed over the years.",
                R.drawable.mosque_amr_ibn_alas));
        attractions.add(new Attraction("MOSQUE OF IBN TULUN",
                "In the heart of Cairo lies the oldest and largest mosque in the city, the Mosque of Ibn Tulun. It is the oldest mosque to exist in its original form, and is also the largest in terms of land. It was constructed in 879 CE, commissioned by Ahmad ibn Tulun, Egypt’s governor at the time. The historical landmark is built on Gebel Yashkur, allowing visitors to take worthy shots of Cairo from its famous staircase minaret.",
                R.drawable.mosque_ibn_tulun));
        attractions.add(new Attraction("MOSQUE-MADRASSA OF SULTAN HASSAN",
                "Considered one of the largest mosques in the world, the Mosque-Madrassa of Sultan Hassan is an historical and architectural landmark not to be missed. It was built during the Mamluk Islamic era (14th century) by Sultan Hassan, famous for his lavish spending. The landmark acted as a Madrassa (school) too, beside being a site of worship. There are teaching areas in the inner courtyard for the four main schools of Sunni Islamic theology: Hanafi, Malaki, Hanbali, and Shafi’i.",
                R.drawable.mosque_sultan_hassan));
        attractions.add(new Attraction("AL-RIFA’I MOSQUE",
                "Right next to Sultan Hassan Mosque lies the beautiful Al-Rifa’i Mosque. It was built over 40 years, between 1869 and 1912, by the famous Egyptian engineer Hussein Fahmy Pasha. The mosque was commissioned by Khushyar Hanim, mother of Khedive Ismail Pasha, to expand the preexisting shrine of Islamic sanit Ahmed Al-Rifa’i. The mosque is home to Al-Rifa’i’s tomb, as well as many royal family members. Prayer takes place inside the mosque, despite the fact that it is against Islamic rules to pray in a mosque with tombs.",
                R.drawable.mosque_al_rifa_i_mosque));

    }
}
