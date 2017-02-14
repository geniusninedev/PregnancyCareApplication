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

public class StrengthExcerciseThird extends AppCompatActivity implements
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
                "BENT-OVER Y RAISE\n\n"+
                "*Instead of lying down, perform the movement in a bentover position.\n" +
                        "\n" +
                        "*Raise your arms at a 30-degree angle to your body (so that they form a Y) until they're in line with your body.\n" +
                        "\n" +
                        "*Pause, then slowly lower back to the starting position." +
                        "\n\n\n\n\n\n\n",


                "REAR LATERAL RAISE\n" +
                        "\n" +
                        "\n" +
                        "*Grab a pair of dumbbells and bend forward at your hips until your torso is nearly parallel to the floor.\n" +
                        "\n" +
                        "*Let the dumbbells hang straight down from your shoulders, your palms facing each other.\n" +
                        "\n" +
                        "*Without moving your torso, raise your arms straight out to your side until they're in line with your body.\n" +
                        "\n" +
                        "*Pause, then slowly return to the starting position."+
                        "\n\n\n\n\n\n\n",


                "SWISS-BALL BODY-WEIGHT WALL SQUAT\n" +
                        "\n" +
                        "\n" +
                        "*Hold a Swiss ball behind you and stand so that the ball is pinned between your back and the wall.\n" +
                        "\n" +
                        "*Place your feet about 2 feet in front of your body.\n" +
                        "\n" +
                        "*Keeping your back in contact with the ball, lower your body until your upper thighs are at least parallel to the floor.\n" +
                        "\n\n\n\n\n\n\n",


                "MODIFIED SIDE PLANK\n" +
                        "\n" +
                        "\n" +
                        "*Lie on your left side with your knees bent 90 degrees.\n" +
                        "\n" +
                        "*Prop your upper body up on your left elbow.\n" +
                        "\n" +
                        "*Brace your core by contracting your abs forcefully.\n" +
                        "\n" +
                        "*Raise your hips until your body forms a straight line from your knees to your shoulders.\n" +
                        "\n" +
                        "*Breathe deeply for the duration of the exercise.\n" +
                        "\n" +
                        "*Hold this position for as long as you can. That's one set.\n" +
                        "\n" +
                        "*Turn around so that you're lying on your right side and repeat."+
                        "\n\n\n\n\n\n\n",

                "SINGLE-ARM DUMBBELL SHOULDER PRESS\n" +
                        "\n" +
                        "\n" +
                        "*Perform a dumbbell shoulder press using only one dumbbell at a time.\n" +
                        "\n" +
                        "*Complete 8 reps with your right arm, then immediately do the same number with your left arm."+
                        "\n\n\n\n\n\n",

                "CROSSOVER DUMBBELL STEPUP\n" +
                        "\n" +
                        "\n" +
                        "*Grab a pair of dumbbells and stand with your left side next to a step.\n" +
                        "\n" +
                        "*Place your right foot on the step.\n" +
                        "\n" +
                        "*Press your right foot into the bench and push your body up untul both legs are straight.\n" +
                        "\n" +
                        "*Lower your body back down to the starting position.\n" +
                        "\n" +
                        "*Complete 10 reps with your right leg, then do the same number with your left leg."+
                        "\n\n\n\n\n\n\n",

                "BIRD DOG\n" +
                        "\n" +
                        "\n" +
                        "*Start by drawing your stomach in as if you were trying to pull your belly button to your spine.\n" +
                        "\n" +
                        "*Then raise one arm and one leg, but hold only for a moment, and without allowing your lower back posture to change, bring your " +
                        "elbow to your knee. That's one rep. Raise them up again and repeat. Do all your reps and then switch arms and legs."+
                        "\n\n\n\n\n\n\n",

                "GLUTE STRETCH\n" +
                        "\n" +
                        "\n" +
                        "*Lie faceup on the floor with your knees and hips bent.\n" +
                        "\n" +
                        "*Cross your left leg over your right so that your left ankle sits across your right thigh.\n" +
                        "\n" +
                        "*Grab your left knee with both hands and pull it toward the middle of your chest until you feel a comfortable stretch in your glutes."+
                        "\n\n\n\n\n\n\n",

                "DOORWAY STRETCH\n" +
                        "\n" +
                        "\n" +
                        "*Bend your right arm 90 degrees (the \"high-five\" position) and place your forearm against a doorframe.\n" +
                        "\n" +
                        "*Step through the doorway with your right foot until you feel a comfortable stretch in your chest and " +
                        "the front of your shoulder. Switch arms and legs and repeat on your other side."+
                        "\n\n\n\n\n\n",

                "NECK ROTATIONS\n" +
                        "\n" +
                        "\n" +
                        "*Stand tall with your feet shoulder width apart.\n" +
                        "\n" +
                        "*Roll your neck in a circular motion to the right.\n" +
                        "\n" +
                        "*Reverse directions, rolling in a circular motion to the left."+
                        "\n\n\n\n\n",
                "KNEELING HIP FLEXOR STRETCH\n" +
                        "\n" +
                        "\n" +
                        "*Kneel down on your left knee, with your right foot on the floor and your right knee bent 90 degrees.\n" +
                        "\n" +
                        "*Reach up with your right hand as high as you can.\n" +
                        "\n" +
                        "*Bend your torso to your right.\n" +
                        "\n" +
                        "*Rotate your torso to the right as you reach with your right hand as far behind you as you can. Hold this position for the prescribed length of time.\n" +
                        "\n" +
                        "*Kneel on your right knee, switch arms, and repeat."+
                        "\n\n\n\n\n"
        };


        int[] images = new int[]{R.drawable.y_raise,
                R.drawable.strength_rear_lat_raise,
                R.drawable.strength_swiss_slider,
                R.drawable.modisideplank,
                R.drawable.shoulder_press,
                R.drawable.strengthy_dbell_step,
                R.drawable.bird_dog,
                R.drawable.glute,
                R.drawable.door,
                R.drawable.lying_tummy,
                R.drawable.cardio_knee_hip



        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(StrengthExcerciseThird.this, images, warmUpExcercise);

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

