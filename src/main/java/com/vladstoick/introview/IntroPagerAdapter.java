package com.vladstoick.introview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Vlad on 10/14/13.
 */
public class IntroPagerAdapter extends FragmentStatePagerAdapter {
    public ArrayList<IntroPage> pages;
    public IntroPagerAdapter(FragmentManager fm, ArrayList<IntroPage> pages){
        super(fm);
        this.pages = pages;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new IntroFragment();
        Bundle arguments = new Bundle();
        arguments.putParcelable(IntroFragment.TAG_ITEM, pages.get(i));
        fragment.setArguments(arguments);
        return fragment;
    }

    @Override
    public int getCount() {
        return pages.size();
    }
}
