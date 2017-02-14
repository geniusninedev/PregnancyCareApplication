package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterOne;

import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.nineinfosys.android.pregnancycareapplication.Excersise.ViewPagerAdapter;
import com.nineinfosys.android.pregnancycareapplication.R;

import java.util.ArrayList;


public class WarmupExcercise extends AppCompatActivity implements
        View.OnClickListener, ViewPager.OnPageChangeListener {

    private Button btnImagePrevious, btnImageNext;
    private int position = 0, totalImage;
    private ViewPager viewPage;

    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warmup_excercise);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        String[] warmUpExcercise = new String[]{
                "WALL SLIDE\n\n"+
                "*Lean your head, upper back, and butt against the wall. \n" +
                        "*Place your hands and arms against the wall in the \"high-five\" position, your elbows bent 90 degrees and your upper arms at shoulder height. \n" +
                        "*Keeping your elbows, wrists, and hands pressed into the wall, slide your elbows down toward your sides as far as you can. Squeeze your shoulder blades together.\n" +
                        "\n\n\n\n\n\n\n",

                "BODY-WEIGHT SQUAT\n\n"+
                "*Stand as tall as you can with your feet spread about twice as far apart as shown in the above image. \n" +
                        "*Lower your body as das as you can by pushing your hops back and bending your knees. \n" +
                        "*Pause, then slowly push yourself back to the starting position.\n"+
                        "\n\n\n\n\n\n\n",

                "CAT CAMEL\n\n"+
                "*Position yourself on your hands and knees. \n" +
                        "*Gently arch your lower back—don't push—then lower your head between your shoulders and raise your upper back toward the ceiling, rounding your spine. That's one repetition. \n" +
                        "*Move back and forth slowly, without pushing at either end of the movement."+
                        "\n\n\n\n\n\n\n",

                "CLAMSHELL\n\n"+
                "*Lie on your left side on the floor, with your hips and knees bent 45 degrees. \n" +
                        "*Your right leg should be on top of your left leg, your heels together.\n" +
                        "*Keeping your feet in contact with each other, raise your right knee as high as you can without moving your pelvis. \n" +
                        "*Pause, then return to the starting position. *Don't allow your left leg to move off the floor."+
                        "\n\n\n\n\n\n\n",

                "HIP RAISES\n\n"+
                "*Lie faceup on the floor with your knees bent and your feet flat on the floor. \n" +
                        "*Raise your hips so your body forms a straight line from your shoulders to your knees. \n" +
                        "*Pause for 1 second in the up position, then lower your body back to the starting position."+
                        "\n\n\n\n\n\n\n",

                "PELVIC TILT\n\n"+
                "*Get down on your hands and knees with your palms flat on the floor and shoulder-width apart.\n" +
                        "*Relax your core so that your lower back and abdomen are in their natural positions.\n" +
                        "*Draw your stomach in toward your spine and hold while breathing deeply. Then without moving your thighs," +
                        " push your hips forward so that only your pelvis moves and your lower back flattens. Hold for a moment, then release. That's one rep."+
                        "\n\n\n\n\n\n\n",

                "LYING TUMMY PULL\n\n"+
                "*Lie faceup on the floor with your knees bent and feet flat. \n" +
                        "*Inhale like you have lungs in your stomach. Exhale as you use your abdominal muscles to pull your belly button toward your spine. " +
                        "Hold for 2 or 3 seconds and release. (You should be able to talk while you hold the position.) That's one rep."+
                        "\n\n\n\n\n\n\n",

                "KEGELS\n\n"+
                "*Sit comfortably on a chair or bench, squeeze your pelvic floor muscle, and hold for 3 seconds. To locate this muscle, imagine you are " +
                        "trying to stop yourself from peeing. (It's that simple.)"+
                        "\n\n\n\n\n\n\n"
        };


        int[] images = new int[]{R.drawable.wall,
                R.drawable.body_weight,
                R.drawable.cat,
                R.drawable.clam,
                R.drawable.hip_raise,
                R.drawable.pelvic_tilt,
                R.drawable.lying_tummy,
                R.drawable.kegels};


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(WarmupExcercise.this, images, warmUpExcercise);

        viewPage.setAdapter(adapter);


        btnImagePrevious.setOnClickListener(this);
        btnImageNext.setOnClickListener(this);


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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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