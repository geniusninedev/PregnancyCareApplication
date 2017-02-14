package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterThree;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.nineinfosys.android.pregnancycareapplication.Excersise.ViewPagerAdapter;
import com.nineinfosys.android.pregnancycareapplication.R;

import java.util.ArrayList;

/**
 * Created by Supriya on 13-02-2017.
 */

public class WarmupExcerciseThird extends AppCompatActivity implements
        View.OnClickListener, ViewPager.OnPageChangeListener {

    private Button btnImagePrevious, btnImageNext;
    private int position = 0, totalImage;
    private ViewPager viewPage;
    private ArrayList<Integer> itemData;
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
                "*Lean your head, upper back, and butt against the wall.\n" +
                        "\n" +
                        "*Place your hands and arms against the wall in the \"high-five\" position, your elbows bent 90 degrees and your upper arms at shoulder height.\n" +
                        "\n" +
                        "*Keeping your elbows, wrists, and hands pressed into the wall, slide your elbows down toward your sides as far as you can. Squeeze your shoulder blades together." +
                        "\n\n\n\n\n\n\n",

                "THORACIC ROTATION\n\n"+
                "*Get down on all fours.\n" +
                        "\n" +
                        "*Place your right hand behind your head.\n" +
                        "\n" +
                        "*Brace your core.\n" +
                        "\n" +
                        "*Rotate your upper back downward so your elbow is pointed down and to your left.\n" +
                        "\n" +
                        "*Raise your right elbow toward the ceiling by rotating your head and upper back up and to the right as far as possible.\n" +
                        "\n" +
                        "*Complete the prescribed number of reps, then do the same number on your left."+
                        "\n\n\n\n\n\n\n",

                "CAT CAMEL\n\n"+
                "*Position yourself on your hands and knees.\n" +
                        "\n" +
                        "*Gently arch your lower back—don't push—then lower your head between your shoulders and raise your upper back toward the ceiling, rounding your spine. That's one repetition.\n" +
                        "\n" +
                        "*Move back and forth slowly, without pushing at either end of the movement.\n" +
                        "\n\n\n\n\n\n\n",

                "CLAMSHELL\n\n"+
                "*Lie on your left side on the floor, with your hips and knees bent 45 degrees.\n" +
                        "\n" +
                        "*Your right leg should be on top of your left leg, your heels together.\n" +
                        "\n" +
                        "*Keeping your feet in contact with each other, raise your right knee as high as you can without moving your pelvis.\n" +
                        "\n" +
                        "*Pause, then return to the starting position.\n" +
                        "\n" +
                        "*Don't allow your left leg to move off the floor."+
                        "\n\n\n\n\n\n\n",


                "QUADRUPED\n\n"+
                "*Get down on your hands and knees with your palms flat on the floor and shoulder-width apart.\n" +
                        "\n" +
                        "*Relax your core so that your lower back and abdomen are in their natural positions.\n" +
                        "\n" +
                        "*Without allowing your lower back to rise or round, draw your stomach in as if you were trying to pull your belly button to your spine. Then hold for 5 seconds while breathing deeply. Relax for a moment and repeat. That's one rep."+
                        "\n\n\n\n\n\n\n",


                "KEGELS\n\n"+
                "*Sit comfortably on a chair or bench, squeeze your pelvic floor muscle, and hold for 3 seconds. To locate this muscle, imagine you are trying to stop yourself from peeing. (It's that simple.)"+
                        "\n\n\n\n\n\n\n"
        };


        int[] images = new int[]{R.drawable.wall,
                R.drawable.warmup_thor_rot,
                R.drawable.cat,
                R.drawable.clam,

                R.drawable.warmup_quadruped,

                R.drawable.kegels
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(WarmupExcerciseThird.this, images, warmUpExcercise);

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

