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

public class YogaAndHealth  extends AppCompatActivity implements
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
                "1. Ardha Titali Asan (Half Butterfly)\n" +
                        "\nHow to do?\n" +
                        "Sit with legs outstretched. Bend the right leg and place the right foot as far up on the left thigh as possible. Place the right hand on top of the bent right knee.\n" +
                        "\n" +
                        "Hold the toes of the right foot with the left hand. While breathing in, gently move the right knee up towards the chest. Breathing out, gently push the knee down and try to touch the floor. The trunk should not move. Movement of leg should be achieved by the exertion of the right arm. Repeat with left leg. Slowly practice about 10 up and down movements with each leg. DO NOT STRAIN. " +
                        "\nBenefits\n" +
                        "\n" +
                        "It is an excellent practice for loosening of hip and knee joints, which shall enable faster delivery.\n" +
                        "\n" +
                        "\n" ,
                        "2. Poorna Titali Asan (Full Butterfly) " +
                                "\nHow to do?\n" +
                        "\n" +
                        "Sit with legs outstretched. Bend the knees and bring the soles of the feet together, keeping the heels as close to the body as possible. Fully relax the inner thighs. Clasp the feet with both hands.Pregnancy ExercisesGently bounce the knees up and down, using the elbows as levers to press the legs down. Do not use any force. Repeat up to 20-30 times. Straighten the legs and relax.\n" +
                        "\nBenefits\n" +
                        "\n" +
                        "Tension from inner thigh muscles is relieved. Removes tiredness from legs." +
                                "\n"+
                                "\n",
                                "3. Supta UdarakarshanAsan (Sleeping Abdominal Stretch Pose)?\n" +
                        "\n" +
                        "How to do? " +
                                        "\nLie in the back. Interlock fingers of both hands and place hands beneath the head. Bend knees, keeping the soles of feet on the floor. \n" +
                        "\n" +
                        "While breathing out lower the legs towards the right, trying to touch the knees on the floor. At the same time move the head towards the left, giving uniform twisting stretch to the entire spine. Repeat on the other side by bending legs towards left, and head towards right. " +
                                        "\nBenefits\n" +
                        "Removes constipation, improves digestion. Relieves stiffness and strain of spine caused by prolonged sitting.\n" +
                        "\n" +
                        "\n" ,
                        "4. Chakki Chalan Asan (Churning the Mill Pose)\n" +
                        "\n" +
                        "How to do?\n" +
                        "\n" +
                        "Sit with legs stretched out in front of the body about one foot apart. Interlock fingers of both hands and hold the arms out straight in front of the chest.\n" +
                        "\n" +
                        "Make large circular movements over both feet, trying to take the hands over the toes on the forward swing and coming as far back as possible on the backward swing. Practice 10 times in each direction. " +
                                "\nBenefits\n" +
                        "Excellent asan for toning the nerves and organs of pelvis and abdomen preparing them for pregnancy. Useful in regulating menstrual cycle. Also an excellent post natal exercise.\n" +
                        "\n" +
                        "\n" ,
                        "5. Kashta Takshan Asan (Chopping Wood Pose)\n" +
                        "\n" +
                        "How to do? " +
                                "\nSit in squatting pose with feet flat on the ground and one and a half feet apart. Clasp fingers of hand and place them on the floor between the feet. Straighten the arms and keep them straight throughout the practice. Elbows should be inside the knees. Imagine the action of chopping wood. Raise arms as high as possible, behind the head, stretching the spine upward. Look up towards the hands. \n" +
                        "\n" +
                        "Make a downward stroke. Expel the breath making an \"Ha\" sound and removing all air from the lungs. Hands should return towards the feet. This is one round. Practice 5-10 rounds. " +
                                "\nBenefits\n" +
                        "\n" +
                        "It loosens the pelvic girdle and tones the pelvic muscles.\n" +
                                "\n"+
                                "\n",
                        "6. Marjari Asan (Cat Stretch Pose)\n" +
                        "\n" +
                        "How to do?\n" +
                        "\n" +
                        "Sit with buttocks on the heels (Vajrasan). Raise the buttocks and stand on the knees. Lean forward and place the hands flat on the floor. This is the starting position. Inhale while raising the head and depressing the spine so that the back becomes concave. Exhale, while lowering the head and stretching the spine upward.\n" +
                        "\n" +
                        "At the end of the exhalation contract the abdomen and pull in the buttocks. Head will be now between the arms, facing the thighs. This is one round. It may be done for 5-10 times .Be careful not to strain yourself. " +
                                "\nBenefits\n" +
                        "This asan improves flexibility of the neck, shoulders and spine. Tones female reproductive system. Can be safely practiced during first 6 months of pregnancy.\n" +
                        "\n" +
                        "\n" ,
                        "7. Kati Chakrasan (Waist Rotating Pose)\n" +
                        "\n" +
                        "How to do? " +
                                "\nStand with the feet about half a meter apart and the arms by the sides. Inhale while raising the arms to shoulder level. Exhale and twist body to left. Bring right hand to left shoulder and wrap left arm around the back. Look over left shoulder. Hold breath for 2 seconds, inhale and return to starting position. Keep feet firmly on ground while twisting. Repeat on other side. Do twisting smoothly without any jerks. Do about 5-10 rounds.\n" +
                        "\n" +
                        "\nBenefits\n" +
                        "\n" +
                        "Tones waist, back and hips . Induces a feeling of lightness and used to relieve physical and mental tension." +
                                "\n" +
                                "\n" ,
                                "8. Tadasan (Palm Tree Pose)\n" +
                        "How to do?\n" +
                        "\n" +
                        "Stand with feet together and arms on the side. Raise arms over the head, interlock fingers and then turn the palms upward. Place hands over the head. Inhale and stretch the arms, shoulders and chest upwards. Raise heels to come up on the toes. Stretch whole body from top to bottom. Lower heels while exhaling and bring hands on top of the head. Relax for few seconds and repeat whole round 5-10 times.\n" +
                        "\n" +
                        "\nBenefits\n" +
                        "\n" +
                        "Helps develop physical and mental balance. Entire spine is stretched and loosened, helping to clear congestion of the spinal nerves. Also stretches rectos abdominal muscles keeping them nerves toned. Pregnancy Exercises" +
                                        "\n" +
                                        "\n" ,
                                        "9. Utthanasan (Squat and Rise Pose)\n" +
                        "How to do?\n" +
                        "\n" +
                        "Stand erect on feet about a meter apart, with toes turned out. Interlock fingers of both hands and let them hang loosely in front of the body. Slowly bend knees and lower buttocks. Straighten knees and return to upright position.\n" +
                        "\n" +
                        "\nBenefits\n" +
                        "\n" +
                        "Strengthens muscles of middle back, uterus, thighs and ankles Pregnancy Exercises" +
                                                "\n" +
                                                "\n" ,
                                                "10. Kandharasan (Shoulder Pose)\n" +
                        "\n" +
                        "How to do? " +
                                                        "\nLie flat on back. Bend knees, place soles of feet flat on the floor with the heels touching the buttocks. Feet and knees may be hip width apart. Grasp ankles with hands. Raise buttocks and arch back backward. \n" +
                        "\n" +
                        "Try to raise the chest and navel as high as possible, without moving feet or shoulders. In final position, the body is supported by the head, neck, shoulders, arms and feet. Hold pose as long as it is comfortable. Release ankles and relax. " +
                                                        "\n" +
                                                        "\nBenefits\n" +
                        "\n" +
                        "Realigns the spine and relieves backache. It massages and stretches the colon and abdominal organs, improving digestion. Tones female reproductive organs and especially recommended for women who tend to miscarry. Should not be done in advanced stages of pregnancy.* Under expert guidance, it has been successfully used to turn the baby when it is a breech presentation."+
                        "\n\n\n\n\n\n\n",


        };


        int[] images = new int[]{
                R.drawable.half_butterfly,
                R.drawable.purna_titali_asana,
                R.drawable.sapta_udra,
                R.drawable.chakkiasana,
                R.drawable.kasta_asana,
                R.drawable.cat,
                R.drawable.kati_chakrasana,
                R.drawable.tadasana,
                R.drawable.utthasana,
                R.drawable.shoulder_press,
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        setPage(position);

        adapter = new ViewPagerAdapter(YogaAndHealth.this, images, warmUpExcercise);

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
