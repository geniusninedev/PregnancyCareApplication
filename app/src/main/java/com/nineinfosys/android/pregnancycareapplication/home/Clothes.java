package com.nineinfosys.android.pregnancycareapplication.home;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.nineinfosys.android.pregnancycareapplication.Pregnancy.ViewPagerWeek;
import com.nineinfosys.android.pregnancycareapplication.R;

public class Clothes extends AppCompatActivity implements View.OnClickListener,ViewPager.OnPageChangeListener{
    private Button btnImagePrevious, btnImageNext;
    private ViewPager viewPage;
    private int position = 0, totalImage;


    private ViewPagerWeek adapter;
    String List[]=new String[]{"Right Clothes To Wear During Pregnancy" +
            "\n" +
            "\n"+
            "\n" +

            "Maternity Clothing Styles" +
            "\n"+
            "\n"+
            "It has become a popular trend to wear fine quality" +
            " and well-designed clothes during pregnancy period. " +
            "Most pregnant women today are no longer trying to " +
            "hide or cover up their pregnancy; instead, they are " +
            "choosing different varieties of garments that fit into " +
            "their new shape. Some women like to dress in a very " +
            "subdued way during pregnancy, a few like to show their " +
            "bump and some like to hide it, pregnancy  wear are available " +
            "in different styles to suit all three expectations!" +
            "It is most important to choose best clothes to wear during " +
            "pregnancy. Dressing up during the time of pregnancy " +
            "is also fun, as it boosts the self-confidence" +
            " and sense of beauty in pregnant woman. " +
            "Here are some do’s and don’ts for the expecting mother:" +
            "Choose light and comfortable clothes; do not " +
            "wear extremely snug or figure-hugging outfits.\n" +
            "You can choose traditional clothes that are " +
            "tailored to your shape & style and is in your budget.\n" +
            "Wear clothes that provide support to your stomach.\n" +
            "Keep your garments simple and flaunt any dress " +
            "that you like, but be confident about it." +
            "\n"+
            "\n"+
            "\n\n",

            "Maternity Wear on Your Budget" +
                    "\n" +
                    "\n"+
                    "\n" +

                    " Often, women tend to be conscious about their" +
                    " looks during the various stages of their pregnancy," +
                    " which is why it is recommended to spend on " +
                    "good-quality maternity wear. There are several " +
                    "options available both in retail stores and online" +
                    " shopping websites for all types of budgets." +
                    " We suggest some of the following:-\n" +

                    "Wrap tops during pregnancy are simple and " +
                    "cheapest things that can be easily adjusted as you expand.\n" +
                    "\n" +
                    "Tunic tops too, are attractive, but make" +
                    " it a point to stick to fabrics that are soft, " +
                    "comfortable and breathable.\n" +
                    "\n" +
                    "Try and wear natural fibers since they " +
                    "are the best. Choose light prints and " +
                    "avoid bold, big prints. For a loose " +
                    "and laid back feel, wear longer shirts with buttons.."+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,

            "Comfort Counts the Most" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Fashion does play an important role when it comes " +
                    "to choosing clothes at the time of pregnancy, but keep " +
                    "in mind that you and your baby’s health comes first. " +
                    "Maternity pants at the waistline should be loose and " +
                    "elastic should not obstruct the baby’s movement or confine " +
                    "the blood flow to the stomach. The belly band, which holds " +
                    "up the unzipped jeans, skirts, pants, or low-slung jeans," +
                    " should provide support around your waist."+
                    "\n" +
                    "\n"+
                    "\n" ,

            "Make it Size Wise" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Maternity style clothes have added space for " +
                    "the belly and bust, as these body parts grow " +
                    "in the later months. Still, some pregnant women" +
                    " may prefer to stick to non-maternity. In that case," +
                    " to ensure a comfortable fit, they should choose" +
                    " clothes that are larger in size than they" +
                    " normally wear. Depending on your weight " +
                    "you need to buy larger sized garments " +
                    "for your final months."+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,

            "Maternity Clothing for Professionals" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "Pregnancy for regular professionals demands" +
                    " more care and comfortable dressing, without " +
                    "breaching the standard professional dress " +
                    "codes, for one’s entire pregnant phase. Here " +
                    "is a simple guide for you to dress up smoothly " +
                    "for office time:-\n" +
                    "\n" +
                    "For first three months of pregnancy, " +
                    "you can stick to regular clothes.\n" +
                    "\n" +
                    "For the later months, you may need maternity" +
                    " clothes that will be larger in size than" +
                    " your regular clothes.\n" +
                    "\n" +
                    "Stick to subtle, complimentary shades of " +
                    "clothing and soft fabric that allows you " +
                    "to move around without being all " +
                    "uncomfortable and irritated.\n" +
                    "\n" +
                    "Large shirts with buttons, slim fit pants " +
                    "and skirts should do the trick. You can " +
                    "also choose combinations of non-maternity tops and sweaters."+
                    "\n" +
                    "\n"+
                    "\n" ,



            "Exercise Clothing" +
                    "\n" +
                    "\n"+
                    "\n\n\n" +

                    "Exercising during pregnancy is highly " +
                    "recommended, provided it is approved by" +
                    " your doctor. Exercise makes sure both " +
                    "you and your baby are in good health. " +
                    "We suggest the following guide for you" +
                    " to choose the best exercise clothing during pregnancy:-\n" +
                    "\n" +
                    "Maternity clothes selected during " +
                    "exercising should be airy, loose fitting " +
                    "and comfortable.\n" +
                    "\n" +
                    "Stick to natural fibers like cotton," +
                    " Lycra, spandex etc. These fabrics " +
                    "are breathable and help regulate body temperature.\n" +
                    "\n" +
                    "Avoid tight clothes, choose " +
                    "clothes that are more flexible " +
                    "to move and stretch.\n" +
                    "\n" +
                    "Ideally, clothes chosen during " +
                    "pregnancy should leave lots " +
                    "of space for belly area."+
                    "\n" +
                    "\n"+
                    "\n\n\n" ,


            "The Inner Secret: “Bras”" +
                    "\n" +
                    "\n"+
                    "\n" +

                    "During the pregnancy months, your breasts" +
                    " get heavier and tender. This indicates shopping" +
                    " for new maternity innerwear. Selecting appropriate" +
                    " bra-size is important, as your breasts needs " +
                    "to be paid proper care and support. Pregnancy " +
                    "allows the breasts to enlarge during this " +
                    "time, thus absolute comfort is a must.\n" +
                    "\n" +
                    "Choose bras made of cotton materials.\n" +
                    "\n" +
                    "The bra should support your back and" +
                    " shoulders, and yet, you should not " +
                    "feel strained while wearing it.\n" +
                    "\n" +
                    "Make a good choice of the " +
                    "maternity bra, as we are sure you " +
                    "don’t want to end up looking like " +
                    "an old lady later!\n" +
                    "\n" +
                    "During pregnancy, stick to flat " +
                    "sandals and shoes and avoid " +
                    "high heels at all costs."+
                    "\n" +
                    "\n"+
                    "\n\n\n"



    };










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_by__week__pregnancy);



        viewPage = (ViewPager) findViewById(R.id.viewPager);
        btnImagePrevious = (Button) findViewById(R.id.btnImagePrevious);
        btnImageNext = (Button) findViewById(R.id.btnImageNext);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setPage(position);

        adapter = new ViewPagerWeek(Clothes.this,List);
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




