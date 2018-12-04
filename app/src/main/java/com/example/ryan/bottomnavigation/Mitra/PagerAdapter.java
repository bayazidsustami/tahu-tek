package com.example.ryan.bottomnavigation.Mitra;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PesananFragment();
            case 1:
                return new RiwayatFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Pesanan";
            case 1:
                return "Riwayat";
        }
        return super.getPageTitle(position);
    }
}
