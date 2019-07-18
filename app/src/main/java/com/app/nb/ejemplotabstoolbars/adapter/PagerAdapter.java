package com.app.nb.ejemplotabstoolbars.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.app.nb.ejemplotabstoolbars.fragments.FirstFragment;
import com.app.nb.ejemplotabstoolbars.fragments.SecondFragment;
import com.app.nb.ejemplotabstoolbars.fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    // numero de tabs
    private int numbreOfTabs;


    public PagerAdapter(FragmentManager fm, int numbreOfTabs) {
        super(fm);
        this.numbreOfTabs = numbreOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        //Depediendo del la posicion
        //Se laza en cada swipe o click
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numbreOfTabs;
    }
}
