package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new IndividualFragment();
            case 1: return new ProfessionalFragment();
            case 2: return new MerchanatFragment();
            default: return new IndividualFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position==0){
            title = "INDIVIDUAL";
        }
        if (position==1){
            title = "PROFESSIONAL";
        }
        if (position==2){
            title = "MERCHANT";
        }

        return title;
    }

}
