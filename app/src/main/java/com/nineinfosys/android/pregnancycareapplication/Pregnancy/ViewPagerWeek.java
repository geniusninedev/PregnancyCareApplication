package com.nineinfosys.android.pregnancycareapplication.Pregnancy;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nineinfosys.android.pregnancycareapplication.R;


public class ViewPagerWeek extends PagerAdapter {
    // Declare Variables
    Context context;
    String[] rank;
    String[] textViewweek;


    LayoutInflater inflater;

    public ViewPagerWeek(Context context, String[] country) {
        this.context = context;
        this.textViewweek = country;


    }

    @Override
    public int getCount() {
        return textViewweek.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView txtrank;
        TextView txtcountry;
        TextView txtpopulation;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.activity_pager, container,
                false);

        // Locate the TextViews in viewpager_item.xml

        txtcountry = (TextView) itemView.findViewById(R.id.brainpuz);


        // Capture position and set to the TextViews

        txtcountry.setText(textViewweek[position]);


        // Locate the ImageView in viewpager_item.xml

        // Capture position and set to the ImageView

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}

