package com.example.lavacake.barhopapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lavacake.barhopapp.R;

/**
 * Created by lavacake on 3/16/2015.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_events, container, false);
        return layout;
    }
}
