package com.example.lavacake.barhopapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lavacake.barhopapp.fragments.EventsFragment;

/**
 * Created by lavacake on 3/16/2015.
 */
public class ViewPageAdapter extends FragmentPagerAdapter  {

    private final int PAGE_COUNT = 2;

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        EventsFragment eventsFragment = new EventsFragment();
        return eventsFragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String[] tabTitles = {"EVENTS" , "LOCATION"};
        return tabTitles[position];
    }
}