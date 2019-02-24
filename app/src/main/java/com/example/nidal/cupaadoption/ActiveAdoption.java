package com.example.nidal.cupaadoption;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ActiveAdoption extends Fragment {


    View v;
    private RecyclerView aarecyclerView;
    private List<CardActiveAdoption> cardaa;
    public ActiveAdoption() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_active_adoption, container, false);
        aarecyclerView = v.findViewById(R.id.aarecyclerView);
        AARecyclerViewAdapter aaRecyclerViewAdapter = new AARecyclerViewAdapter(getContext(), cardaa);
        int NoOfColaa = 2;
        aarecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),NoOfColaa));
        aarecyclerView.setAdapter(aaRecyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cardaa = new ArrayList<>();

        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));
        cardaa.add(new CardActiveAdoption("Doge", "Location: Second Chance Adoption Home", R.drawable.ic_launcher_foreground));

    }
}
