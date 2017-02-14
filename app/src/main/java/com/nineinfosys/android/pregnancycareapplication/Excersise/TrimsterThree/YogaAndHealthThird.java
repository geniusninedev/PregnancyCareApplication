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

public class YogaAndHealthThird extends AppCompatActivity implements
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
                "1. Ardha Titali Asan (Half Butterfly)" +
                        "\nHow to do?\n" +
                        "Sit with legs outstretched. Bend the right leg and place the right foot as far up on the left thigh as possible. Place the right hand on top of the bent right knee.\n" +
                        "\n" +
                        "Hold the toes of the right foot with the left hand. While breathing in, gently move the right knee up towards the chest. Breathing out, gently push the knee down and try to touch the floor. The trunk should not move. Movement of leg should be achieved by the exertion of the right arm. Repeat with left leg. Slowly practice about 10 up and down movements with each leg. DO NOT STRAIN. Pregnancy ExercisesBenefits\n" +
                        "It is an excellent practice for loosening of hip and knee joints, which shall enable faster delivery.\n" +
                        "\n" +
                        "\n\n\n\n\n" ,

                        "2. Poorna Titali Asan (Full Butterfly) " +
                                "\nHow to do?\n" +
                        "Sit with legs outstretched. Bend the knees and bring the soles of the feet together, keeping the heels as close to the body as possible. Fully relax the inner thighs. Clasp the feet with both hands. Gently bounce the knees up and down, using the elbows as levers to press the legs down.\n" +
                        "\n" +
                        "Do not use any force. Repeat up to 20-30 times. Straighten the legs and relax.\n" +
                        "\n" +
                        "Benefits\n" +
                        "\n" +
                        "Tension from inner thigh muscles is relieved. Removes tiredness from legs. Pregnancy Exercises" +
                        "\n" +
                        "\n\n\n\n\n" ,

                        "3. Supta UdarakarshanAsan (Sleeping Abdominal Stretch Pose)" +
                                "\n How to do?\n" +
                        "Lie in the back. Interlock fingers of both hands and place hands beneath the head. Bend knees, keeping the soles of feet on the floor.\n" +
                        "\n" +
                        "At the same time move the head towards the left, giving uniform twisting stretch to the entire spine. Repeat on the other side by bending legs towards left, and head towards right.Pregnancy ExercisesBenefits\n" +
                        "Removes constipation, improves digestion. Relieves stiffness and strain of spine caused by prolonged sitting.\n" +
                        "\n" +
                        "\n\n\n\n\n" ,

                        "4. Ankle Crank" +
                                "\n How to do?\n" +
                        "Bend the right leg up and place the foot overhanging the left knee. Hold the right toes with the left hand. Steady the right ankle with the the right hand. Crank the right ankle around in a large circle, exploring to the very perimeters of movement. Do 10 rotations in each direction and then 10 rotations in each direction with the other ankle\n" +
                        "\n" +
                        "Benefits\n" +
                        "\n" +
                        "Good for stiffness and poor circulation in the feet. Helps extend setting time in meditation postures. Ankle CrankPregnancy Advice\n" +
                        "\n" +
                        "Specially useful in case of edema, cramping, post epidural numbness in the feet and legs. " +
                        "\n" +
                        "\n" +
                        "\n\n\n" ,


                        "5. Shoulder Rotation\n" +
                        "How to do?\n" +
                        "\n" +
                        "Single Arm Place the right fingertips up on the right shoulder. Slowly rotate the arm and shoulder joint around as if drawing a large circle with the tip of the elbow. Single ArmExtend the movement to rotate fully into the shoulder joint. Do 5 times one way and then reverse the direction for 5 circles. Repeated on the left side. \n" +
                        "\n" +
                        "Double Arm Raise the arms up, fingers on both shoulders. Slowly rotate both arms together in large circles. Try to stretch the elbows as far back as possible, and try to touch them together at the front. Go 5 times in one direction and then 5 times reverse. Shoulder RotationBoth Shoulders RotationBoth Shoulders RotationBoth Shoulders RotationBreath Inhale when opening the chest as the elbows go backwards, exhale when the elbows move towards touching at the front.\n" +
                        "\nBenefits\n" +
                        "\n" +
                        "Improves circulation and flexibility in the shoulders and upper back. Releases tensions from around the heart and lungs. Encourages better breathing. Especially effective for release of neck tension if followed by the neck series.\n" +
                        "\n" +
                        "For mothers-to-be, practice throughout pregnancy and post-nasally as this exercise helps to stimulate proper function of the mammary glands."+
                                "\n\n\n\n\n\n"
        };


        int[] images = new int[]{R.drawable.half_butterfly,
                R.drawable.purna_titali_asana,
                R.drawable.sapta_udra,
                R.drawable.ankle_crank,
              R.drawable.shuolder_rotation
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(YogaAndHealthThird.this, images, warmUpExcercise);

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

