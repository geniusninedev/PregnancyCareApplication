package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterOne;

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

public class StrengthExcercise extends AppCompatActivity implements
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
                "BENT-OVER Y RAISE\n" +

                        "*Instead of lying down, perform the movement in a bentover position.\n" +
                        "*Raise your arms at a 30-degree angle to your body (so that they form a Y) until they're in line with your body. \n" +
                        "*Pause, then slowly lower back to the starting position." +
                        "\n\n\n\n\n\n\n",

                "UNDERHAND-GRIP REAR LATERAL RAISE\n" +

                        "*Grab a pair of dumbbells and bend forward at your hips until your torso is nearly parallel to the floor. Let the dumbbells hang straight down from your shoulders, your palms facing forward. \n" +
                        "*Without moving your torso, raise your arms straight out to your side until they're in line with your body. \n" +
                        "*Pause, then slowly return to the starting position.\n"+
                        "\n\n\n\n\n\n\n",

                "MODIFIED PUSHUP\n" +

                        "*Bend your knees and cross your ankles behind you.\n" +
                        "*Place your hands on the floor so that they're slightly wide than and in line with your shoulders. \n" +
                        "*Lower your body until your chest nearly touches the floor. \n" +
                        "*Pause at the bottom, and then push yourself back to the starting position as quickly as possible."+
                        "\n\n\n\n\n\n\n",

                "BRACED SQUAT\n" +

                        "*Hold a weight plate in front of your chest with both hands, your arms completely straight. \n" +
                        "*Lower your body as far as your can by pushing your hips back and bending your knees. \n" +
                        "*Pause, then slowly push yourself back to the starting position."+
                        "\n\n\n\n\n\n\n",

                "SIDE PLANK\n" +

                        "*Lie on your left side with your knees straight. \n" +
                        "*Prop your upper body up on your left elbow and forearm. \n" +
                        "*Brace your core by contracting your abs forcefully as if you were about to be punched in the gut. \n" +
                        "*Raise your hips until your body forms a straight line from your ankles to your shoulders. \n" +
                        "*Breathe deeply for the duration of the exercise. \n" +
                        "*Hold this position for 30 seconds. That's one set. \n" +
                        "*Turn around so that you're lying on your right side and repeat."+
                        "\n\n\n\n\n\n\n",

                "REVERSE DUMBBELL LUNGE\n" +

                        "*Grab a pair of dumbbells and hold them at arm's length next to your sides, your palms facing each other.\n" +
                        "*Step backward with your left leg and slowly lower your body until your front knee is bent at least 90 degrees. \n" +
                        "*Pause, then push yourself back to the starting position as quickly as you can. \n" +
                        "*Complete 8 reps with your left leg, then do the same on the right leg."+
                        "\n\n\n\n\n\n\n",

                "DUMBBELL ROW\n" +

                        "*Grab a pair of dumbbells, bend at your hips and knees, and lower your torso until it's almost parallel to the floor. \n" +
                        "*Let the dumbbells hang at arm's length from your shoulders, your palms facing behind you. \n" +
                        "*Bend your elbows and pull the dumbbells to the sides of your torso. \n" +
                        "*Pause, then slowly lower the dumbbells."+
                        "\n\n\n\n\n\n\n",

                "BIRD DOG\n" +

                        "*Start by drawing your stomach in as if you were trying to pull your belly button to your spine. \n" +
                        "*Then raise one arm and one leg, but hold only for a moment, and without allowing your lower back posture to change, " +
                        "bring your elbow to your knee. That's one rep. Raise them up again and repeat. Do all your reps and then switch arms and legs."+
                        "\n\n\n\n\n\n\n",

                "ALTERNATING DUMBBELL SHOULDER PRESS\n" +

                        "*Hold the dumbbells next to your shoulders with your elbows bent. \n" +
                        "*Instead of pressing both dumbbells up at once, lift them on at a time, in an alternating fashion.\n" +
                        "\n\n\n\n\n\n\n",

                "GLUTE STRETCH\n" +

                        "*Lie faceup on the floor with your knees and hips bent. \n" +
                        "*Cross your left leg over your right so that your left ankle sits across your right thigh. \n" +
                        "*Grab your left knee with both hands and pull it toward the middle of your chest until you feel a comfortable stretch in your glutes.\n" +
                        "\n" +
                        "\n\n\n\n\n\n\n",

                "DOORWAY STRETCH\n" +

                        "*Bend your right arm 90 degrees (the \"high-five\" position) and place your forearm against a doorframe. \n" +
                        "*Step through the doorway with your right foot until you feel a comfortable stretch in your chest and the" +
                        " front of your shoulder. Switch arms and legs and repeat on your other side."+
                        "\n\n\n\n"
        };


        int[] images = new int[]{
                R.drawable.y_raise,
                R.drawable.under_lat_raise,
                R.drawable.mod_push,
                R.drawable.brace_squat,
                R.drawable.sideplank,
                R.drawable.dumb_lunge,
                R.drawable.dumb_row,
                R.drawable.bird_dog,
                R.drawable.shoulder_press,
                R.drawable.glute,
                R.drawable.door

        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(StrengthExcercise.this, images, warmUpExcercise);

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