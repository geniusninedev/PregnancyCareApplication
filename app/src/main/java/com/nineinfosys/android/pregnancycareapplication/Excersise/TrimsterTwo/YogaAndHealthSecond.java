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

public class YogaAndHealthSecond extends AppCompatActivity implements
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
                "1. Matsya Kridasan (Flapping Fish Pose)\n" +
                        "How to do?\n" +
                        "\n" +
                        "Lie on stomach with fingers interlocked under the head. Bend the left leg sideways and bring the left knee close to the ribs.\n" +
                        "\n" +
                        "Right leg should remain straight. Swivel the arms to the left and rest the left elbow on the left knee. If this is not comfortable rest it on the floor. Rest the right side of the head on the right arm. Relax in the final pose, and after some time, change sides. Bent knee and head may be supported on a pillow for further comfort. Flapping Fish Pose" +
                        "\nBenefits\n" +
                        "Stimulates digestion and removes constipation. Relaxes nerves of the legs. In later months of pregnancy, lying on the back may cause pressure over major veins and block the circulation. In such circumstances, this posture is ideal for relaxing and sleeping. Also redistributes excess weight around waistline.\n" +
                        "\n" +
                        "\n" ,
                        "2. Vajrasan (Thunderbolt Pose)\n" +
                        "\n" +
                        "How to do? " +
                                "\nKneel on the floor. Bring big toes together and separate the heels. Lower the buttocks onto the inside surface of the feet with heels touching the side of the hips. Place hands on knees, palms down. Back and head should be straight , but not tense.\n" +
                        "\nBenefits\n" +
                        "\n" +
                        "Enhances digestive functions and can be practices directly after meals. Relieves stomach ailments like hyperacidity often a trouble" +
                                " faced during pregnancy. Alters blood flow and nervous impulses in the pelvic region and strengthens pelvic muscles." +
                                " Assists women in labor. Vajrasan (Thunderbolt Pose)" +
                                "\n" +
                                "\n" ,
                                "3. Bhadrasan (Gracious Pose)\n" +
                        "How to do?\n" +
                        "\n" +
                        "Sit in vajrasan (above). Separate the knees as far as possible, while keeping the toes in contact with the floor. Separate the feet just enough to allow the buttocks and perineum to rest on the floor. Try to separate the knees. Do not strain.\n" +
                        "\n" +
                        "Benefits\n" +
                        "\n" +
                        "Same as vajrasan.\n" +
                        "\n" +
                        "\n" ,
                        "4. Marjari Asan (Cat Stretch Pose)\n" +
                        "\n" +
                        "How to do?\n" +
                        "\n" +
                        "Sit with buttocks on the heels (Vajrasan). Raise the buttocks and stand on the knees. Lean forward and place the hands flat on the floor. This is the starting position. " +
                                "Inhale while raising the head and depressing the spine so that the back becomes concave. Exhale, while lowering the head and stretching the spine upward. At the" +
                                " end of the exhalation contract the abdomen and pull in the buttocks.\n" +
                        "\n" +
                        "Head will be now between the arms, facing the thighs. This is one round. It may be done for 5-10 times .Be careful not to strain yourself. Cat Stretch Pose" +
                                "\n" +
                                "Benefits\n" +
                        "This asan improves flexibility of the neck, shoulders and spine. Tones female reproductive system. Can be safely practiced during first 6 months of pregnancy.\n" +
                        "\n" +
                        "\n" ,
                        "5. Hasta Utthanasan (Hand Raising Pose)\n" +
                        "\n" +
                        "How to do?\n" +
                        "\n" +
                        "Stand with feet together and arms on the sides. Cross hands in front of body. Inhale and slowly raise arms over the head, keeping them crossed. At same time bend head slightly backward and look up at the hands.\n" +
                        "\n" +
                        "Exhale and spread arms out to the sides at shoulder level.. Inhale and reverse the movement, re-crossing the arms above the head. Exhale and lower the arms straight down in front of the body. Hand Raising PoseBenefits\n" +
                        "Removes stiffness from the shoulders and upper back. The deep synchronized breath improves breathing capacity. Influences heart and improves blood circulation. Whole body, especially the brain receives an extra supply of oxygen.\n" +
                        "\n" +
                        "\n" ,
                        "6. Tadasan (Palm Tree Pose) " +
                                "\nHow to do?\n" +
                        "Stand with feet together and arms on the side. Raise arms over the head, interlock fingers and then turn the palms upward. Place hands over the head. Inhale and stretch the arms, shoulders and chest upwards. Raise heels to come up on the toes. Stretch whole body from top to bottom. Lower heels while exhaling and bring hands on top of the head. Relax for few seconds and repeat whole round 5-10 times.\n" +
                        "\n" +
                        "Benefits\n" +
                        "\n" +
                        "Helps develop physical and mental balance. Entire spine is stretched and loosened, helping to clear congestion of the spinal nerves. Also stretches rectos abdominal muscles keeping them nerves toned." +
                                "\n\n" ,
                                " 7. Kati Chakrasan (Waist Rotating Pose)How to do?\n" +
                        "Stand with the feet about half a meter apart and the arms by the sides. Inhale while raising the arms to shoulder level. Exhale and twist body to left. Bring right hand to left shoulder and wrap left arm around the back. Look over left shoulder. Hold breath for 2 seconds, inhale and return to starting position. Keep feet firmly on ground while twisting. Repeat on other side. Do twisting smoothly without any jerks. Do about 5-10 rounds.\n" +
                        "\n" +
                        "Benefits\n" +
                        "\n" +
                        "Tones waist, back and hips . Induces a feeling of lightness and used to relieve physical and mental tension.\n" +
                        "\n\n" ,
                        "8. Utthanasan (Squat and Rise Pose)\n" +
                        "How to do?\n" +
                        "\n" +
                        "Stand erect on feet about a meter apart, with toes turned out. Interlock fingers of both hands and let them hang loosely in front of the body. Slowly bend knees and lower buttocks. Straighten knees and return to upright position.\n" +
                        "\n" +
                        "Benefits\n" +
                        "\n" +
                        "Strengthens muscles of middle back, uterus, thighs and ankles \n" +
                        "\n" +
                                "\n" ,

                                "9. Meru Akarshanasan (Spinal Bending pose)\n" +
                        "How to do?\n" +
                        "\n" +
                        "Lie on right side with left leg on right leg. Bend right arm. Placing the elbow on the floor. Support head on right palm. Place left arm on left thigh. Raise the left leg as high as possible, slide the left hand to the foot and grasp the big toe. Repeat on other side. Spinal Bending pose" +
                                        "\nBenefits\n" +
                        "\n" +
                        "Relaxes the hamstring, inner thigh and abdominal muscles and stretches the muscles of the sides of the body rendering them stronger and flexible."+
                        "\n\n\n\n\n\n\n",


        };


        int[] images = new int[]{
                R.drawable.maxresdefault,
                R.drawable.vajarasana,
                R.drawable.bhadarasana,
                R.drawable.cat,
                R.drawable.hasta_uttahsana,
                R.drawable.tadasana,
                R.drawable.kati_chakrasana,
                R.drawable.utthasana,
                R.drawable.merukasana
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(YogaAndHealthSecond.this, images, warmUpExcercise);

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
