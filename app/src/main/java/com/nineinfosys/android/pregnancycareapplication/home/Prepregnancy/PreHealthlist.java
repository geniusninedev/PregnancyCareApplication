package com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;

public class PreHealthlist extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {"1.Home and Workplace Environment."+
                "\n"+
                "\n"+
                "\n"+
                "You'll talk about possible hazards " +
                " such as exposure to cat feces, " +
                "X-rays, and lead or solvents  that could affect your ability " +
                "to become pregnant or maintain a healthy pregnancy.",

                "2.Your Weight."+
                        "\n"+
                        "\n"+
                        "\n"+

                        "It's a good idea to reach your ideal body " +
                        "weight before you get pregnant. This means losing " +
                        "weight if you are overweight to reduce your risk " +
                          "of complications during pregnancy; " +
                        "or gaining weight if you are underweight " +
                        "to reduce the risk of delivering a low birth-weight baby.",
                "3.Lifestyle Factors."+
                        "\n"+
                        "\n"+
                        "\n"+


                "Your doctor will ask you questions about you " +
                        "and your partner's habits that could influence " +
                        "your pregnancy, such as smoking, drinking alcohol," +
                        " and using recreational drugs. The goal is to help you stop" +
                        " any habits that could stand in the way of a healthy pregnancy." +
                        " Your doctor will keep it confidential, so feel free to be open.",

                "4.Exercise."+
                        "\n"+
                        "\n"+
                        "\n"+

                "Tell your doctor what type of exercise you do  " +
                        "and if you don't work out, tell them that, too." +
                        " Generally, you may continue your normal exercise " +
                        "routine while pregnant unless you are instructed to" +
                        " decrease or modify your activities.",

                "5.Diet."+
                        "\n"+
                        "\n"+
                        "\n"+

                " Your doctor will ask you about what you eat and drink. " +
                        "It's ideal to go into pregnancy with good dietary " +
                        "habits already in place. That includes eating a variety" +
                        " of foods rich in fiber, and getting enough calcium, folic acid," +
                        " and other nutrients",

                "6.Caffeine."+
                        "\n"+
                        "\n"+
                        "\n"+

                        " Before you get pregnant, your doctor may recommend" +
                        " limiting caffeine to no more than 300 milligrams (mg) per day. " +
                        "That's about the amount in two 8-ounce cups of coffee. " +
                        "Remember, caffeine isn't just in coffee and tea " +
                        " it's also in chocolate, some soft" +
                        " drinks, and certain medications.",

                "7.Prenatal Vitamins."+
                "\n"+
                        "\n"+
                        "\n"+
                        " Before you're pregnant, you should be taking a folic acid supplement. " +
                        "Folic acid makes it less likely that your " +
                        "baby will have a neural tube defect, and it's best " +
                        "to start taking it before you conceive. Your doctor will " +
                        "likely recommend taking 400 micrograms (mcg) of folic acid " +
                        "daily before conception and in early pregnancy."+

                "\n"+
                        "\n"+
                        "\n"+
                        ""



        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(PreHealthlist.this,List);
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


