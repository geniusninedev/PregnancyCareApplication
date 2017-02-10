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
public class PregnancyTest extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {
                "Pregnancy Tests"+
                        "\n"+
                        "\n"+
                        "\n"+


                "A pregnancy test may let you know, " +
                "one way or the other, if you are pregnant.\n" +
                "Here are answers to some of the most" +
                " common questions about pregnancy tests."+
                        "\n"+
                        "\n"+
                        "\n",
              "What Types Of Pregnancy Tests are Available?"+
                "\n"+
                "\n"+
                 "\n"+
                "Two main types of pregnancy tests can let" +
                      " you know if you're pregnant: " +
                      "urine tests and blood tests."+
                      "\n"+
                        "\n"+
                "Urine Tests:" +
                      "\n"+
                      "\n"+
                      "can be done at home or in a doctor's office. " +
                      "Many women first choose a home pregnancy " +
                      "test to take about a week after a missed period." +
                      " Home pregnancy tests are private and convenient." +
                      "These products come with instructions. Follow them " +
                      "closely for the most accurate results. After testing," +
                      " you can confirm results by seeing your doctor, who " +
                      "can perform even more sensitive pregnancy tests."+
                      "\n"+
                      "\n"+

                "Blood Tests:" +
                      "\n"+
                      "\n"+
                        "are done at your doctor's office, but are used " +
                      "less often than urine tests. These tests can detect " +
                      "pregnancy earlier than a home pregnancy test, or about" +
                      " six to eight days after ovulation. But with these tests," +
                      " it takes longer to get the results than with a home pregnancy test."+
                "\n"+
                        "\n"+
                        "\n",

                        "How Accurate are Pregnancy Tests?"+
                                "\n"+
                                "\n"+
                                "\n"+
                                "You should know that waiting at least a week" +
                                " after a missed period may give you the most" +
                                " accurate result. Results may also be more accurate" +
                                " if you do the test first thing in the morning, " +
                                "when your urine is more concentrated." +
                                "Urine home pregnancy tests are about 99% accurate. " +
                                "Blood tests are even more accurate than this.",
                "If You Get a Positive Result" +
                        "\n"+
                        "\n"+
                        "\n"+

                        "you are pregnant. This is true no matter how " +
                        "faint the line, color, or sign is. If you " +
                        "get a positive result, you may want to call" +
                        " your doctor to talk about what comes next." +

                        "In very rare cases, you can have a false-positive result." +
                        " This means you're not pregnant but the test says you are." +
                        " You could have a false-positive result if blood or protein" +
                        " is present in your urine. And certain drugs, such as " +
                        "tranquilizers, anti-convulsants, or hypnotics, " +
                        "may also cause false-positive results."+
                "\n"+
                        "\n"+
                        "\n",


                "If You Get a Negative Result" +
                        "\n"+
                        "\n"+
                        "\n"+
                        " you are likely not pregnant. However, you may still be pregnant if:" +
                        "The test is past its expiration date." +
                        "You took the test the wrong way." +
                        "You tested too soon." +
                        "Your urine is too diluted because you consumed large amounts of fluid right before the test." +
                        "You are taking certain medications, such as diuretics or antihistamines."



        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(PregnancyTest.this,List);
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



