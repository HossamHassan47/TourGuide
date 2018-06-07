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

        attractions.add(new Attraction("MOSQUE OF MUHAMMED ALI",
                "With a distinguished exterior and interior, the Mosque of Muhammed Ali is also known as the Alabaster Mosque. It is one of Egypt’s top tourist attractions. The mosque is situated on the Summit of Saladin Citadel, and has minarets measuring 270 feet in height–way above average! Tourists can view almost all of Cairo from above, including the Giza Plateau. The mosque was built between 1830 and 1957 by prominent architect Yussuf Bushnaq, and was commissioned by Muhammed Ali Pasha, erstwhile ruler of Egypt.",
                R.drawable.mosque_mohamed_ali,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0287015,31.259910600000012"));

        attractions.add(new Attraction("MOSQUE OF AMR IBN AL-AS",
                "This is a particularly historically significant site, in that it was the first mosque to be built in Africa (641-642 CE). The mosque was home to General Amr Ibn Al-As’s tent, the commander of the Muslim army back then. It also holds the tomb of his son, Abd Allah Ibn Amr Ibn Al-As. The mosque was the first real university in the entire world, a center for learning and teaching, although it no longer serves this purpose. The site has been expanded and reconstructed over the years.",
                R.drawable.mosque_amr_ibn_alas,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0101215,5.2331368"));

        attractions.add(new Attraction("MOSQUE OF IBN TULUN",
                "In the heart of Cairo lies the oldest and largest mosque in the city, the Mosque of Ibn Tulun. It is the oldest mosque to exist in its original form, and is also the largest in terms of land. It was constructed in 879 CE, commissioned by Ahmad ibn Tulun, Egypt’s governor at the time. The historical landmark is built on Gebel Yashkur, allowing visitors to take worthy shots of Cairo from its famous staircase minaret.",
                R.drawable.mosque_ibn_tulun,
                "Daily: 5:00 am - 10:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.02869100000001,31.249394100000018"));

        attractions.add(new Attraction("MOSQUE-MADRASSA OF SULTAN HASSAN",
                "Considered one of the largest mosques in the world, the Mosque-Madrassa of Sultan Hassan is an historical and architectural landmark not to be missed. It was built during the Mamluk Islamic era (14th century) by Sultan Hassan, famous for his lavish spending. The landmark acted as a Madrassa (school) too, beside being a site of worship. There are teaching areas in the inner courtyard for the four main schools of Sunni Islamic theology: Hanafi, Malaki, Hanbali, and Shafi’i.",
                R.drawable.mosque_sultan_hassan,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0322791,31.256170399999974"));

        attractions.add(new Attraction("AL-RIFA’I MOSQUE",
                "Right next to Sultan Hassan Mosque lies the beautiful Al-Rifa’i Mosque. It was built over 40 years, between 1869 and 1912, by the famous Egyptian engineer Hussein Fahmy Pasha. The mosque was commissioned by Khushyar Hanim, mother of Khedive Ismail Pasha, to expand the preexisting shrine of Islamic sanit Ahmed Al-Rifa’i. The mosque is home to Al-Rifa’i’s tomb, as well as many royal family members. Prayer takes place inside the mosque, despite the fact that it is against Islamic rules to pray in a mosque with tombs.",
                R.drawable.mosque_al_rifa_i_mosque,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0327091,31.257002899999975"));

        attractions.add(new Attraction("AL-HAKIM BI-AMR ALLAH MOSQUE",
                "Known for its unique minarets, Al-Hakim bi-Amr Allah Mosque is the second major Fatimid mosque in Cairo. It was built between 990 and 1012 by Caliph Aziz, and completed by his son Al-Hakim bi-Amr Allah. The mosque was influenced by the famous Ibn Tulun Mosque, which is obvious in the arches supporting the arcades of the sanctuary, as well as the courtyard. The religious site is a peaceful place visited by both tourists and locals.",
                R.drawable.mosque_al_hakim_bi_amr_allah_mosque,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0545766,31.264198999999962"));

        attractions.add(new Attraction("AL-AZHAR MOSQUE",
                "Built in 970 CE, Al-Azhar’s sheikh is considered the highest theological authority among Egyptian Muslims. The building has seen extensive enlargements over its 1000-year history, and is a harmonious blend of architectural styles. The mosque has three minarets from the 14th, 15th and 16th centuries. The central courtyard is the oldest part. The building also hosts the world’s second-oldest university, from 988 CE, with its large modern campus being the most prestigious place to study Sunni theology.",
                R.drawable.mosque_al_azhar_mosque,
                "Daily: 8:00 am - 4:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.045688,31.2626851"));

        attractions.add(new Attraction("QALAWUN COMPLEX",
                "Built by Sultan Al-Nasir Muhammad Ibn Qalawun in the 1280s, the complex includes a school, a hospital and a mausoleum. The complex was built in 13 months, which is a relatively short time considering its structure and the scope of the total complex. Its timeless design is considered the second most beautiful mausoleum, after the Taj Mahal in India.",
                R.drawable.mosque_qalawun_complex,
                "Daily: 9:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.04939919999999,31.260961700000053"));

        attractions.add(new Attraction("AQSUNQUR MOSQUE",
                "Dating from the 14th century, the Aqsunqur Mosque stands proudly in Cairo. Reflecting a clear Ottoman style, complete with typical Iznik tiles in the shape of cypress trees and tulips in vases, the mosque also contains the mausoleums of its founder, Shams El-Din Aqsunqur, and his numerous sons. The mosque is referred to as the “Blue Mosque” due to its blue and green tiles, which were added by Prince Ibrahim Agha Al-Mustahfizan between 1652 and ’54, during the Ottoman rule.",
                R.drawable.mosque_aqsunqur_mosque,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0362363,31.2602223"));

        attractions.add(new Attraction("AL-NASSER MOHAMMED MOSQUE",
                "Another mosque built by Sultan Al-Nasser Mohammed Ibn Qalawun in 1318, and renovated in 1334. It is a historical landmark as it lies inside the Citadel, across the street from the courtyard access to the Mosque of Muhammed Ali. It is where the sultans of Cairo used to perform their Friday prayers in its courtyard center. Despite the fact the the mosque is beautifully decorated inside, it has little-to-no decoration on the exterior.",
                R.drawable.mosque_al_nasser_mohammed_mosque,
                "Daily: 8:00 am - 5:00 pm",
                "https://www.google.com/maps/dir/?api=1&destination=30.0290618,31.2609377"));
    }
}
