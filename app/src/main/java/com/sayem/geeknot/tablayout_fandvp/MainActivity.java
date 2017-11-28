package com.sayem.geeknot.tablayout_fandvp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.sayem.geeknot.tablayout_fandvp.mFragments.Fragment1;
import com.sayem.geeknot.tablayout_fandvp.mFragments.Fragment2;
import com.sayem.geeknot.tablayout_fandvp.mFragments.Fragment3;
import com.sayem.geeknot.tablayout_fandvp.mFragments.Fragment4;
import com.sayem.geeknot.tablayout_fandvp.mFragments.MyPagerAdapter;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    ViewPager vp;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vp = (ViewPager) findViewById(R.id.mViewpager_ID);
        this.addPages();
        tabLayout = (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(this.getSupportFragmentManager());
        pagerAdapter.addFragment(new Fragment1());
        pagerAdapter.addFragment(new Fragment2());
        pagerAdapter.addFragment(new Fragment3());
        pagerAdapter.addFragment(new Fragment4());



        vp.setAdapter(pagerAdapter);
    }

    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }



    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }
    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void TestUpload(){
        int i = 1+1;
    }
}