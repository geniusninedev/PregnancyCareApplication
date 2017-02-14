package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterTwo;

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

public class StrengthExcerciseSecond extends AppCompatActivity implements
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

                "UNDERHAND-GRIP REAR LATERAL RAISE\n\n"+
                "*Grab a pair of dumbbells and bend forward at your hips until your torso is nearly parallel to the floor. Let the dumbbells hang straight down from your shoulders, your palms facing forward.\n" +
                        "\n" +
                        "*Without moving your torso, raise your arms straight out to your side until they're in line with your body.\n" +
                        "\n" +
                        "*Pause, then slowly return to the starting position."+
                        "\n\n\n\n\n\n\n",

                "BRACED SQUAT\n\n"+
                "*Hold a weight plate in front of your chest with both hands, your arms completely straight.\n" +
                        "\n" +
                        "*Lower your body as far as your can by pushing your hips back and bending your knees.\n" +
                        "\n" +
                        "*Pause, then slowly push yourself back to the starting position."+
                "\n\n\n\n\n\n",

                "MODIFIED SIDE PLANK\n\n"+
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
                "\n\n\n\n\n\n",

                "INCLINE PUSHUP\n\n"+
                "*Place your hands on a box, bench, or step instead of the floor. This reduces the amount of your body weight you have to lift, making the exercise easier.\n" +
                        "\n" +
                        "*Lower your body until your chest nearly touches the bench.\n" +
                        "\n" +
                        "*Pause at the bottom, and then push yourself back to the starting position as quickly as possible.\n" +
                        "\n" +
                        "*If your hips sag at any point during the exercise, your form has broken down. When this happens, consider that your last repetition and end the set."+
                "\n\n\n\n\n",

                "DUMBBELL STEPUP\n\n"+
                "*Grab a pair of dumbbells and hold them at arm's length at your sides. Stand in front of a bench or step, and place your left foot firmly on the step.\n" +
                        "\n" +
                        "*The step should be high enough that your knee is bent 90 degrees.\n" +
                        "\n" +
                        "*Press your left heel into the step and push your body up until your left leg is straight and you're standing on one leg on the bench, keeping your right foot elevated.\n" +
                        "\n" +
                        "*Lower your body back down until your right foot touches the floor. That's one repetition.\n" +
                        "\n" +
                        "*Complete the prescribed number of repetitions with your left leg, then do the same number with your right leg."+
                        "\n\n\n\n\n\n",

                "BIRD DOG\n\n"+
                "*Start by drawing your stomach in as if you were trying to pull your belly button to your spine.\n" +
                        "\n" +
                        "*Then raise one arm and one leg, but hold only for a moment, and without allowing your lower back posture to change, bring your " +
                        "elbow to your knee. That's one rep. Raise them up again and repeat. Do all your reps and then switch arms and legs."+
                        "\n\n\n\n\n\n",

                "GLUTE STRETCH\n\n"+
                "*Lie faceup on the floor with your knees and hips bent.\n" +
                        "\n" +
                        "*Cross your left leg over your right so that your left ankle sits across your right thigh.\n" +
                        "\n" +
                        "*Grab your left knee with both hands and pull it toward the middle of your chest until you feel a comfortable stretch in your glutes."+
                        "\n\n\n\n\n",

                "DOORWAY STRETCH\n\n"+
                "*Bend your right arm 90 degrees (the \"high-five\" position) and place your forearm against a doorframe.\n" +
                        "\n" +
                        "*Step through the doorway with your right foot until you feel a comfortable stretch in your chest and the" +
                        " front of your shoulder. Switch arms and legs and repeat on your other side."+

                "\n\n\n\n\n"
        };


        int[] images = new int[]{
                R.drawable.y_raise,
                R.drawable.under_lat_raise,
                R.drawable.brace_squat,

                R.drawable.sideplank,
                R.drawable.strengthy_ncpush,
                R.drawable.strengthy_dbell_step,
                R.drawable.bird_dog,
                R.drawable.glute,
                R.drawable.door
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(StrengthExcerciseSecond.this, images, warmUpExcercise);

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
