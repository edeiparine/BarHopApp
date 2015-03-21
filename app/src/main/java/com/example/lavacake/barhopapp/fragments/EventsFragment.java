package com.example.lavacake.barhopapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lavacake.barhopapp.Information;
import com.example.lavacake.barhopapp.R;
import com.example.lavacake.barhopapp.adapters.EventsAdapter;

import java.util.ArrayList;
import java.util.List;

public class EventsFragment extends Fragment {

    private RecyclerView recyclerView;
    private EventsAdapter adapter;

    public EventsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_events, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.drawerList);
        adapter = new EventsAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }

    public static List<Information> getData() {
        List<Information> data = new ArrayList<>();
        int[] icons = {
                R.drawable.ic_number1,
                R.drawable.ic_number1,
                R.drawable.ic_number2,
                R.drawable.ic_number3,
                R.drawable.ic_number4
        };

        String[] titles = {
                "Valkyrie",
                "Prive",
                "Imperial",
                "Hyve",
                "Haze"
        };

        String[] subTitles = {
                "Bar and Lounge",
                "Bar and Restaurant",
                "Bar and Lounge",
                "Bar and Restaurant",
                "Pub"
        };

        for (int i = 0; i < titles.length && i < icons.length; i++) {
            Information current = new Information();
            current.iconId = icons[i];
            current.title = titles[i];
            current.subtitle = subTitles[i];
            data.add(current);
        }
        return data;
    }
}
