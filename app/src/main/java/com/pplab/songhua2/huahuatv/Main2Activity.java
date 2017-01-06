package com.pplab.songhua2.huahuatv;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.flyco.tablayout.CommonTabLayout;
import com.pplab.songhua2.huahuatv.fragment.TabListFragment;
import com.pplab.songhua2.huahuatv.MainFragmentPagerAdapter;


public class Main2Activity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private CommonTabLayout mTablayout;
    private int mTabCount = 4;
    private String[] mTitles=new String[]{"推荐","栏目","直播","我的"};
    private MainFragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
        mTablayout = (CommonTabLayout) findViewById(R.id.tablayout);
        fragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager(), mTabCount);
        mViewPager.setAdapter(fragmentPagerAdapter);

        mTabLayout.setupWithViewPager(mViewPager);

    }
}
