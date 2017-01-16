package com.pplab.songhua2.huahuatv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pplab.songhua2.huahuatv.ui.fragment.LiveFragment;
import com.pplab.songhua2.huahuatv.ui.fragment.TabListFragment;

/**
 * author�� on 2016/9/8 09:43
 * email��
 * desc��slidingtab
 */

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {


    private int mTabCount;

    public MainFragmentPagerAdapter(FragmentManager fragmentManager, int mTabCount) {
        super(fragmentManager);
        this.mTabCount = mTabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabListFragment();

            case 1:
                return new TabListFragment();
            case 2:
                return new LiveFragment();

            case 3:
                return new TabListFragment();

            default:
                return new TabListFragment();
        }
     //   return new TabListFragment();
    }

    @Override
    public int getCount() {
        return mTabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab:" + position;
    }
}
