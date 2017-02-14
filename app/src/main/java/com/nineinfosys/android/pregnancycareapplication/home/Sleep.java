package com.nineinfosys.android.pregnancycareapplication.home;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.nineinfosys.android.pregnancycareapplication.Pregnancy.ViewPagerWeek;
import com.nineinfosys.android.pregnancycareapplication.R;

public class Sleep extends AppCompatActivity implements View.OnClickListener,ViewPager.OnPageChangeListener{
    private Button btnImagePrevious, btnImageNext;
    private ViewPager viewPage;
    private int position = 0, totalImage;


    private ViewPagerWeek adapter;
    String List[]=new String[]{"Right Clothes To Wear During Pregnancy" +
            "\n" +
            "\n"+
            "\n" +

            "Watch What You Drink" +
            "\n"+
            "\n"+
            "Did you know that drinking caffeine even in the" +
            " morning can affect the quality of your nights sleep." +
            " Try to avoid or limit caffeine intake after midday " +
            "and track the effect of having a coffee if you feel" +
            " your sleep may be affected. Also avoid drinking " +
            "too much water in the evening so you avoid the " +
            "need to use the bathroom during the night." +
            "\n"+
            "\n"+
            "\n\n",

            "Watch What You Eat" +
                    "\n" +
                    "\n"+
                    "\n" +

                    " Avoid eating spicy and acidic foods or big meals" +
                    " in the evening since these culprits can cause" +
                    " indigestion and heartburn when you lie down." +
                    " Having a light snack before bedtime can help" +
                    " you sleep better and also may help " +
                    "prevent morning sickness."+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,

            "Develop Regular Sleep Routines" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "  Your body’s internal clock is more powerful " +
                    "than you may realize. Going to bed and getting" +
                    " up at the same time each day can help you tap" +
                    " into its power as your body will naturally " +
                    "begin to relax once bedtime nears. Having" +
                    " a nighttime ritual like reading before " +
                    "sleep or taking a bath can increase the" +
                    " body’s natural sleep responses."+
                    "\n" +
                    "\n"+
                    "\n" ,

            "Make Your Bedroom an Inviting Sanctuary" +
                    "\n" +
                    "\n"+
                    "\n" +

                    " Eliminate electronics and reserve your " +
                    "room for sleep and sex only, not as " +
                    "a place to check email, watch TV or" +
                    " pay bills. Invest in soft bedding and " +
                    "a firm, comfortable mattress."+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,

            "Don’t Worry, Be Happy" +
                    "\n" +
                    "\n"+
                    "\n" +

                    " That may seem easier said than done, " +
                    "but learning a few basic meditation techniques " +
                    "or yoga postures and practicing them a few" +
                    "times a day can help reduce or eliminate " +
                    "stress that might be keeping you awake. " +
                    "Sharing your concerns with an understanding " +
                    "friend or spouse may also help."+
                    "\n" +
                    "\n"+
                    "\n" ,



            "Get Up" +
                    "\n" +
                    "\n"+
                    "\n" +

                    " If you’re tossing and turning for 20 minutes " +
                    "or more, get out of bed and listen to music or" +
                    " read until you feel drowsy. Worrying about " +
                    "not being able to sleep can make you stay awake longer." +

                    "Pregnancy is an exciting time, but it can also " +
                    "be a time of stress and worry. Some factors " +
                    "affecting your sleep like fluctuating hormones" +
                    " are out of your control. But other factors can" +
                    " be changed to help you get a better night’s sleep." +
                    " Use these guidelines as a basis for change so you" +
                    " can get the rest you need to welcome your " +
                    "new arrival into the world.\n"+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,


            "Reduce stress and anxiety." +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Stress and anxiety are key culprits in " +
                    "preventing a good night's sleep. Remember that" +
                    " worrying won't help you, but talking about your" +
                    "problems will. Find a friend or a professional " +
                    "who can listen and help you if there are issues" +
                    " in your life that are causing you to worry" +
                    "or feel upset"+
                    "\n" +
                    "\n"+
                    "\n\n\n",






            "Get into position" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "After 20 weeks, sleep on your left side to " +
                    "allow for the best blood flow to the fetus " +
                    "and to your uterus and kidneys. Avoid " +
                    "lying flat on your back."+
                    "\n" +
                    "\n"+
                    "\n\n\n",

            "Nap during the day" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "If you're not getting enough rest at night, " +
                    "take a nap to help reduce fatigue. " +
                    "Find a quiet spot and relax, " +
                    "even if only for a half-hour nap."+
                    "\n" +
                    "\n"+
                    "\n\n\n"




    };










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_by__week__pregnancy);



        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setPage(position);

        adapter = new ViewPagerWeek(Sleep.this,List);
        viewPage.setAdapter(adapter);


        btnImagePrevious.setOnClickListener(this);
        btnImageNext.setOnClickListener(this);
        int pos = getIntent().getIntExtra("key", 0);
        viewPage.setCurrentItem(pos);


    }

    @Override
    public void onClick(View v) {
        if (v == btnImagePrevious) {
            position--;
            viewPage.setCurrentItem(position);
        } else if (v == btnImageNext) {
            position++;
            viewPage.setCurrentItem(position);
        }
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int position) {
        this.position = position;
        setPage(position);
    }

    private void setPage(int page) {
        if (page == 0 && totalImage > 0) {
            btnImageNext.setVisibility(View.VISIBLE);
            btnImagePrevious.setVisibility(View.INVISIBLE);
        } else if (page == totalImage - 1 && totalImage > 0) {
            btnImageNext.setVisibility(View.INVISIBLE);
            btnImagePrevious.setVisibility(View.VISIBLE);
        } else {
            btnImageNext.setVisibility(View.VISIBLE);
            btnImagePrevious.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:

                return super.onOptionsItemSelected(item);

        }
    }
}


