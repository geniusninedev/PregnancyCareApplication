package com.nineinfosys.android.pregnancycareapplication.home;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.nineinfosys.android.pregnancycareapplication.R;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.ViewPagerAdapterClothes;

public class Excercise extends AppCompatActivity implements View.OnClickListener,ViewPager.OnPageChangeListener{
    private Button btnImagePrevious, btnImageNext;
    private ViewPager viewPage;
    private int position = 0, totalImage;


    private ViewPagerAdapterClothes adapter;
    String List[]=new String[]{"   Safe Pregnancy Excercise" +
            "\n" +
            "\n"+
            "\n" +

            "Swimming" +
            "\n"+
            "\n"+
            "Swimming and water aerobics may just be the " +
            "perfect pregnancy workout. Why? In the water " +
            "you weigh a tenth of what you do on land, " +
            "so you’ll feel lighter and more limber. " +
            "A dip in the pool may also help relieve nausea, " +
            "sciatic pain and puffy ankles and because baby’s " +
            "floating along with you, it’s gentle on" +
            " your loosening joints and ligaments " +
            "(your body’s natural response to pregnancy hormones)." +
            "\n"+
            "\n"+
            "\n\n\n",

            "Brisk walking" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "There’s no easier exercise to fit into " +
                    "your busy schedule than walking…and it’s a " +
                    "workout you can continue to fit in right up" +
                    " until delivery date (and even on D-day if " +
                    "you’re anxious to help the contractions along)." +
                    " What’s more, you don’t need any special equipment" +
                    " or a gym membership to participate just some " +
                    "good sneakers. If you opt for a hike, " +
                    "be sure to avoid uneven terrain " +
                    "\n" +
                    "\n"+
                    "\n\n\n" ,

            "Running" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Want to go a little faster? Experienced runners " +
                    "can stay on track during pregnancy. Just stick " +
                    "to level terrain (or a treadmill or an elliptical machine)" +
                    " and never overdo it (loose ligaments and joints" +
                    " during pregnancy can make jogging harder on " +
                    "your knees — and make you more prone to injury)."+
                    "\n" +
                    "\n"+
                    "\n" ,

            "Group Dance" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Low-impact aerobics and dance workout " +
                    "classes are a great way to increase your heart " +
                    "rate and get the endorphins flowing if you’re " +
                    "a newbie exerciser. As your abdomen expands, " +
                    "avoid any activities that require careful balance. " +
                    "If you’re an experienced athlete, just be sure to" +
                    " listen to your body and never exercise " +
                    "to the point of exhaustion. "+
                    "\n" +
                    "\n"+
                    "\n" ,

            "Prenatal Yoga" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Prenatal yoga is another ideal workout " +
                    "for the mama-to-be: It encourages relaxation, " +
                    "flexibility, focus and deep breathing " +
                    "all great preparation for the marathon of birth. " +
                    "Look for a class specifically tailored " +
                    "for pregnant women, or ask your regular yoga " +
                    "instructor to modify the poses so that " +
                    "they’re safe for you. Just avoid Bikram " +
                    "yoga (the kind done in a hot room), " +
                    "since you need to pass on exercises " +
                    "that heat you up too much.  "+
                    "\n" +
                    "\n"+
                    "\n" ,



            "Indoor cycling" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "A wonderful way to break a sweat without putting " +
                    "pressure on your ankle and knee joints, indoor " +
                    "cycling lets you pedal at your own pace without " +
                    "the risk of falling. Try transitioning your " +
                    "cardio workouts to a stationary bike, or hop " +
                    "into an indoor cycling class for a more " +
                    "structured ride. (Just make sure your instructor " +
                    "knows you’re expecting, and feel free to sit out " +
                    "sprints and hills if you feel overheated or exhausted at any point.) "+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,




            "Pilates" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "A pregnancy-appropriate Pilates routine focuses" +
                    " mainly on strengthening your core and " +
                    "lengthening your muscles. And all that " +
                    "core strengthening will help ease backaches " +
                    "and improve your posture (which you’ll also " +
                    "be grateful for as your belly gets bigger)" +
                    " as well as your flexibility (which comes " +
                    "in handy during labor)."+
                    "\n" +
                    "\n"+
                    "\n\n\n"
    };
    int[] ImagesClothes=new int[]{R.drawable.swimming,
            R.drawable.walking,
            R.drawable.running,
            R.drawable.groupdance,
            R.drawable.yogagg,
            R.drawable.cycling,
            R.drawable.moves};









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);



        viewPage = (ViewPager) findViewById(R.id.viewPagerClothes);
        btnImagePrevious = (Button) findViewById(R.id.btnnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnnImageNext);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setPage(position);

        adapter = new ViewPagerAdapterClothes(Excercise.this,ImagesClothes,List);
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
