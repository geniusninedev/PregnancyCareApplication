package com.nineinfosys.android.pregnancycareapplication.home;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.*;

/**
 * Created by Dev on 15-02-2017.
 */
public class HealthyDiet extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {
                "Healthy Pregnancy Diet"+
                        "\n"+
                        "\n"+
                        "\n"+
                        "The phrase 'eating for two' doesn't mean piling " +
                        "twice as much food onto your plate. Instead," +
                        " the idea is to eat twice as well. Find out" +
                        " how to maintain a balanced diet between you" +
                        " & your baby here. Not sure how to go about " +
                        "what to include in your pregnancy diet?" +
                        " We're about to tell you."+
                "\n"+
                        "\n"+
                        "\n",


                "Eggs"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Packed with protein and vitamins D and B12," +
                        " these nutritional powerhouses are quick " +
                        "and easy to prepare. Try them scrambled " +
                        "or on top of lightly fried rice."+
                        "\n"+
                        "\n"+
                        "\n",

                "Dairy products"+
                        "\n"+
                        "\n"+
                        "\n"+


                        "Low-fat milk, cheese and yoghurt are delicious " +
                        "sources of calcium. Try to drink milk a couple" +
                        " of times a day, and include a daily serving " +
                        "of yoghurt or cheese (made with pasteurised milk)."+
                "\n"+
                        "\n"+
                        "\n"

                ,

                "Nuts"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Portable and non-perishable, nuts and nut butters " +
                        "are perfect on-the-go snacks and excellent sources" +
                        " of protein and healthy fat, which can aid in your" +
                        " baby's development. Almonds, peanuts and walnuts" +
                        " are all good selections.",

                "Fruits"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Whether fresh, frozen or tinned, fruit is" +
                        " high in vitamins and fibre, key in every " +
                        "pregnancy diet since it can help prevent " +
                        "constipation. Read the labels on tinned " +
                        "fruit carefully. Go for fruit packed in " +
                        "water rather than syrup.\n" +
                        "\n",

                "Iron"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "You'll need a lot of it during pregnancy" +
                        " to keep up your energy and ward off anaemia." +
                        " Stock up on lean meats, fortified cereals and" +
                        " spinach. Frozen spinach is especially affordable" +
                        " and easy to prepare; try mixing it into " +
                        "casseroles or pasta sauce." +
                        "If you're pregnant, your baby's development " +
                        "is on your mind all the time. Improving " +
                        "your diet during pregnancy is an easy way " +
                        "to enhance your baby's health. Chat to" +
                        " your doctor, shop carefully and try to" +
                        " avoid processed food whenever you can.."
                        +
                        "\n"+
                        "\n"+
                        "\n",

                "How Much Calcium During Pregnancy?"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Calcium is a vital building block for" +
                        " your baby's bones and teeth and also " +
                        "helps to preserve your bone strength. " +
                        "Women younger than 19 need 1,300 milligrams " +
                        "(mg) each day; those of 19 and older need 1,000 mg daily.\n" +
                        "Each of the following is equal to one " +
                        "serving (300 mg) of calcium. Try to eat" +
                        " four servings every day.\n" +
                        "200 ml milk or yoghurt\n" +
                        "40 g hard cheese\n" +
                        "40 to 50 g cottage cheese\n" +
                        "225 g cooked, fresh green vegetables",


                "How Much Iron During Pregnancy?"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Iron helps to create blood cells and " +
                        "prevents anaemia. When you're pregnant, " +
                        "you need 27 mg of iron daily (usually included " +
                        "in your pre-natal vitamin preparation)." +
                        "Most women need to take additional iron " +
                        "supplements during pregnancy because it's " +
                        "hard to get the desired amount from food alone." +
                        " To boost your iron intake, aim for at " +
                        "least four servings a day of these foods:" +
                        "75 g dried fruit, like apricots, raisins or prunes\n" +
                        "150 g cooked dried beans, dried peas or lentils\n" +
                        "50 g dark green leafy vegetables\n" +
                        "1 slice wholewheat bread or 28 g wholegrain cereal\n" +
                        "56 g almonds or walnuts\n" +
                        "56 g red meat"+

                "\n"+
                        "\n"+
                        "\n"


        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.ViewPagerAdapter(HealthyDiet.this,List);
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


