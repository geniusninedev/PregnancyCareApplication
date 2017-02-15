package com.nineinfosys.android.pregnancycareapplication.Pregnancy;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;
import com.nineinfosys.android.pregnancycareapplication.Tips.ViewPagerAdapterTips;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.Symtomps;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.ViewPagerAdapter;

import static com.nineinfosys.android.pregnancycareapplication.R.id.viewPager;

/**
 * Created by Dev on 14-02-2017.
 */
public class Misscarriage extends AppCompatActivity implements
        ViewPager.OnPageChangeListener{


    private int position ;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_healthlist);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        String[] List = new String []{"Causes Of Miscarriages"+
                "\n\n\n"+

                "Most miscarriages happen when the unborn baby has" +
                        "fatal genetic problems. Usually, these" +
                        " problems are unrelated to the mother.\n" +
                        "\n" +
                        "Other causes of miscarriage include:\n" +
                        "\n" +
                        "Infection\n" +
                        "Medical conditions in the mother, such as diabetes or thyroid disease\n" +
                        "Hormone problems\n" +
                        "Immune system responses\n" +
                        "Physical problems in the mother\n" +
                        "Uterine abnormalities\n" +
                        "A woman has a higher risk of miscarriage if she:\n" +
                        "\n" +
                        "Is over age 35\n" +
                        "Has certain diseases, such as diabetes or thyroid problems\n" +
                        "Has had three or more miscarriages"+
                "\n"+
                "\n"+
                "\n"+
                "\n",



                "Symptoms of a Miscarriage include:\n" +
                        "\n\n" +
                        "Bleeding which progresses from light to heavy\n" +
                        "Severe cramps\n" +
                        "Abdominal pain\n" +
                        "Fever\n" +
                        "Weakness\n" +
                        "Back pain\n" +
                        "If you experience the symptoms listed above, " +
                        "contact your obstetric health care provider" +
                        " right away. He or she will tell you to come" +
                        " in to the office or go to the emergency room."+
                        "\n"+
                        "\n"+
                        "\n"+
                        "\n",

                "How Is a Miscarriage Treated?\n"+
                        "\n\n"+
                        " Your health care provider will perform\n"+
                        "a pelvic exam, an ultrasound test and bloodwork " +
                        "to confirm a miscarriage. If the miscarriage is" +
                        " complete and the uterus is empty, then no further" +
                        " treatment is usually required. Occasionally, " +
                        "the uterus is not completely emptied, so a dilation " +
                        "and curettage (D&C) procedure is performed. During" +
                        "this procedure, the cervix is dilated and any " +
                        "remaining fetal or placental tissue is gently " +
                        "removed from the uterus. As an alternative to " +
                        "a D&C, certain medications can be given to cause" +
                        " your body to expel the contents in the uterus." +
                        " This option may be more ideal in someone who wants" +
                        " to avoid surgery and whose condition is otherwise stable."+
                        "\n"+
                        "\n"+
                        "\n",

                "How Do I Know if I Had a Miscarriage?\n"+
                        "\n\n"+
                        "Bleeding and mild discomfort are common symptoms" +
                        " after a miscarriage. If you have heavy bleeding " +
                        "with fever, chills, or pain, contact your health " +
                        "care provider right away. These may be signs of an infection."+
                        "\n"+
                        "\n"+
                        "\n"+
                        "\n"



        };




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(Misscarriage.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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
        viewPager.setCurrentItem(position);
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