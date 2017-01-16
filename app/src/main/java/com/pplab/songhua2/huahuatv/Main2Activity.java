package com.pplab.songhua2.huahuatv;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;

import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private CommonTabLayout mBottomTablayout;
    private int mTabCount = 4;
    private String[] mTitles;//=new String[]{"推荐","栏目","直播","我的"};
    private MainFragmentPagerAdapter fragmentPagerAdapter;
    private int[] mIconSelectIds=new int[]{R.drawable.btn_tabbar_home_selected,R.drawable.btn_tabbar_lanmu_selected,
            R.drawable.btn_tabbar_zhibo_selected,R.drawable.btn_tabbar_wode_selected};
    private int[] mIconUnselectIds=new int[]{R.drawable.btn_tabbar_home_normal,R.drawable.btn_tabbar_lanmu_normal,
            R.drawable.btn_tabbar_zhibo_normal,R.drawable.btn_tabbar_wode_normal};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mBottomTablayout = (CommonTabLayout) findViewById(R.id.tablayout);

        fragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager(), mTabCount);
        mViewPager.setAdapter(fragmentPagerAdapter);
        mTitles = getResources().getStringArray(R.array.col_name);

        mTabLayout.setupWithViewPager(mViewPager);

        initTab();

    }
    public class TabEntity implements CustomTabEntity {
        public String title;
        public int selectedIcon;
        public int unSelectedIcon;

        public TabEntity(String title, int selectedIcon, int unSelectedIcon) {
            this.title = title;
            this.selectedIcon = selectedIcon;
            this.unSelectedIcon = unSelectedIcon;
        }

        @Override
        public String getTabTitle() {
            return title;
        }

        @Override
        public int getTabSelectedIcon() {
            return selectedIcon;
        }

        @Override
        public int getTabUnselectedIcon() {
            return unSelectedIcon;
        }
    }
    private void initTab() {
        ArrayList<CustomTabEntity> tabList = new ArrayList<CustomTabEntity>();
        for(int i =0 ; i < mTitles.length; i++){
            tabList.add(new TabEntity(mTitles[i],mIconSelectIds[i],mIconUnselectIds[i]));
        }
        mBottomTablayout.setTabData(tabList);
    }
}
