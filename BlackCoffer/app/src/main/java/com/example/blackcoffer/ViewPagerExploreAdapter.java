package com.example.blackcoffer;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerExploreAdapter extends FragmentPagerAdapter {

    Context context;
    public ViewPagerExploreAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new PersonalFragment(context);
        } else if(position == 1) {
            return new BusinessFragment(context);
        } else {
            return new MerchantFragment(context);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return "Personal";
        } else if(position == 1) {
            return "Business";
        } else {
            return "Merchant";
        }
    }
}
