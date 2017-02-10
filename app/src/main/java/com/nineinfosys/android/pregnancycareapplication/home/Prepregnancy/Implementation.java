package com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;

/**
 * Created by Dev on 10-02-2017.
 */
public class Implementation extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {"Implementation Bleeding"+
                "\n"+
                "\n"+
               "\n"+
                "If you see light bleeding small pink or brown spots " +
                "in your underwear and you think you might be pregnant," +
                " it could be implantation bleeding. That happens " +
                "6 to 12 days after conception, and you may " +
                "mistake it for your regular period." +

                "It’s actually an early sign of pregnancy. " +
                "It’s not dangerous, and you don’t need treatment." +
                "Heavy bleeding (more than a typical period) is " +
                "cause for concern, though. Contact your doctor " +
                "if you have this alone or combined with fever, " +
                "chills, or cramps that get worse.",

                     "Cause:" +
                        "\n"+
                        "\n"+
                        "\n"+
                             "After a sperm fertilizes your egg, " +
                             "they become an embryo. It then travels to " +
                             "the uterus, where it implants itself into the lining." +
                            "Sometimes, as the embryo attaches, it causes a " +
                             "ittle bleeding. This doesn't cause any problems " +
                             "for the baby that will develop."+
                             "\n"+
                             "\n"+
                "Symptoms:"+
                             "\n"+
                             "\n"+
                "The blood may be lighter in color and flow" +
                             " than what you see during your period." +
                             " Mild cramping is common." +
                             "This bleeding tends to happen sooner" +
                             " than you'd notice morning sickness.",

                "Other Causes Of Bleeding."+
                        "\n"+
                        "\n"+

                        "Pregnant women can bleed for reasons other " +
                        "than implantation. If it’s heavy plus with " +
                        "or without pain or cramping at any time, call your doctor." +

                        "If you’re pregnant and you see blood, it may be caused by:"+
                "\n"+
                        "\n"+
                        "1.Sex:"+
                        "\n"+
                      "\n"+
                        "Sometimes this happens early on, although " +
                        "it can happen at any time during pregnancy." +
                        " Hormone changes in your body may be to blame. " +
                        "It should stop on its own."+
                        "\n"+
                        "\n"+

                        "2.Ectopic pregnancy:"+
                        "\n"+
                         "\n"+
                        "This is when an embryo implants outside" +
                        " of the uterus. You may have bleeding " +
                        "with pain and cramps. It’s dangerous, " +
                        "and you need to see a doctor right away."+
                        "\n"+
                        "\n"+

                        "3.Miscarriage:"+
                        "\n"+
                        "\n"+

                        "About 15% of known pregnancies end during the first " +
                        "few months. Most women bleed and cramp afterward. " +
                        "Call your doctor right away if you know you're " +
                        "pregnant and you have these symptoms."+
                "\n"+
                        "\n"+
                        "\n"+
                        ""







        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(Implementation.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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


