package com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;

public class PreCheckUp extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {"1.Make an Appointment With Your Doctor. "+
                "\n"+
                "\n"+
                "\n"+

                "It’s true: You’ll be seeing her plenty after" +
                " you conceive. But it’s a good idea to book a" +
                " visit ahead of time, too, even if you’ve been " +
                "pregnant before. If you have any health issues" +
                " that could affect your chances of conceiving " +
                "or that could make a pregnancy more risky, it’s " +
                "important to get those under control now. If " +
                "diseases like cystic fibrosis or sickle cell" +
                " disease run in your or your partner’s family," +
                " you might also want to see a genetic counselor " +
                "or do preconception screening tests.",

                "2.Check Your Gums."+
                        "\n"+
                        "\n"+
                        "\n"+

                      "Good oral health is strongly linked to a " +
                        "healthy pregnancy. Gum disease is linked " +
                        "to early birth and low birth weight. " +
                        "See a dentist to tackle any problems.",

                "3.Quit Smoking and Drinking."+
                        "\n"+
                        "\n"+
                        "\n"+


                        "You know tobacco and alcohol during pregnancy " +
                        "are never OK they’re bad for a baby’s growth " +
                        "and can cause health problems for him when " +
                        "he gets older. But even now, smoking and drinking " +
                        "can make it harder to get pregnant and raise your" +
                        " risk of a miscarriage. Talk to your doctor about" +
                        " programs that can help you quit these habits.",

                "4.Cut Back On Caffeine."+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Downing more than two cups of coffee or five " +
                        "cans of soda a day (that’s about 250 milligrams" +
                        " of caffeine) could make it harder for you to conceive" +
                        " and increase the chances that you’ll miscarry. Plus, " +
                        "switching to decaf now means you won’t have to put" +
                        " up with caffeine cravings during those first few " +
                        "weeks of pregnancy.",

                "5.Eat Smart."+
                        "\n"+
                        "\n"+
                        "\n"+

                       "There’s no better time to cut out junk food " +
                        "and all of its empty calories. Make sure you’re" +
                        " getting plenty of fruits, vegetables, whole grains," +
                        " and lean protein every day. A healthy diet before you " +
                        "conceive can make you less likely to get gestational " +
                        "diabetes, a type that affects pregnant women.",

                "6.Shed Extra Pounds."+
                        "\n"+
                        "\n"+
                        "\n"+

                        " Extra weight can raise your odds of problems " +
                        "like gestational diabetes and high blood pressure " +
                        "during pregnancy (your doctor might call this preeclampsia)." +
                        " It generally isn’t a good idea to lose weight while you’re" +
                        " pregnant, so start working on it now.",

                "7.Catch Up On Vaccines. "+
                        "\n"+
                        "\n"+
                        "\n"+

                        " Some illnesses during pregnancy could do more" +
                        " than make you miserable. They might hurt your child. " +
                        "Talk to your doctor about the vaccines you need now" +
                        " and which ones you’ll need later. Doctors give some " +
                        "shots (like the Tdap vaccine for whooping cough) during" +
                        " pregnancy so your baby can benefit from the protection, too.",

                "8.Think About The Meds You Take. "+
                        "\n"+
                        "\n"+
                        "\n"+

                        " It’s important to let your doctor know about " +
                        "all the drugs you’re taking prescription, over-" +
                        "the-counter, even vitamins and herbs. Some of " +
                        "them could affect your baby. Start taking a" +
                        "prenatal vitamin or folic acid supplement to " +
                        "lower your risk of birth defects..",

                "9.Get Picky About Seafood."+
                        "\n"+
                        "\n"+
                        "\n"+

                        "You’ve probably heard that it’s smart to " +
                        "steer clear of fish that are high in mercury " +
                        "while you’re pregnant. But it can take up to a " +
                        "year for your body to clear the element from " +
                        "your blood. Fish on your plate twice a week is" +
                        " fine, but pass on the kinds that have a lot of" +
                        " mercury like swordfish, tilefish, king mackerel, " +
                        "and shark.",


                "10.Hit The Gym."+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Not only will exercise help you get to a healthy weight, " +
                        "it’ll also get you into shape for labor and delivery." +
                        " Once you’re expecting, look for special prenatal " +
                        "classes that are safe for moms-to-be."+


                "\n"+
                        "\n"+
                        "\n"+
                        ""



        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(PreCheckUp.this,List);
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


