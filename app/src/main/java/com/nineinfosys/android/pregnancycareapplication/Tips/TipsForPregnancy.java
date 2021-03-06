package com.nineinfosys.android.pregnancycareapplication.Tips;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.R;

import java.util.ArrayList;
import java.util.List;

public class TipsForPregnancy extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
   private int[] tabIcons = {
            R.mipmap.ic_clear_all_black_24dp,
            R.mipmap.ic_wc_black_24dp,
            R.mipmap.ic_child_care_black_24dp,
            R.mipmap.ic_pregnant_woman_black_24dp,
            R.mipmap.ic_insert_emoticon_black_24dp,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_and_dont);

      /* toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
         setupTabIcons();
    }

   private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new GeneralTipsForPregnancyIndex(), "");
        adapter.addFrag(new HusbandTipsIndex(), "");
        adapter.addFrag(new BabyTipsIndex(), "");
        adapter.addFrag(new MotherTipsIndex(), "");
        adapter.addFrag(new HealthCareTipsIndex(), ""+

                "" +
                "");
        viewPager.setAdapter(adapter);
    }


}class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFrag(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}