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
public class Medicine extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {

                "Taking Medicine During Pregnancy" +
                        "\n"+
                        "\n"+
                        "\n"+
                "There may come a time during your pregnancy when you’re " +
                        "feeling under the weather and aren't sure if you " +
                        "can take your regular over-the-counter (OTC) medication. " +
                        "Some medications are safe to take during pregnancy." +
                        " But others are not, or their effects on your baby may not be known." +
                        "When you meet with your doctor to confirm " +
                        "you're pregnant, ask what meds are OK to take and " +
                        "what meds you need to find alternatives for. " +
                        "Your health care provider will weigh the risks" +
                        " and benefits to help you know what's safe.\n" +
                        "Also, tell your doctor about any alternative " +
                        "medicines or supplements you take, even if the " +
                        "label says \"natural.\" And if you get any new" +
                        " prescriptions while you're pregnant, make sure " +
                        "the people who prescribe them know that " +
                        "you're pregnant."+

                "\n"+
                        "\n"+
                        "\n",

                "Safe Medications to Take During Pregnancy*"+

                "\n"+
                        "\n"+
                        "\n"+
                "1.Allergy" +
                        "\n"+
                        "\n" +
                        "diphenhydramine (Benadryl)" +
                        "\n"+
                        "Loratadine (Claritin)" +
                        "\n"+
                        "Steroid nasal spray (Rhinocort)"+
                        "\n"+
                        "\n"+

                "2.Constipation"+
                "\n"+
                        "\n" +
                "Colace"+
                        "\n"+

               "Metamucil"+
                "\n"+
                        "\n" +

                "3.First Aid Ointment"+
                "\n"+
                        "\n" +
                "Bacitracin"+
                "J&J First-Aid Cream"+
                "Neosporin"+
                "Polysporin"+
                        "\n"+
                        "\n" +
                "4.Rashes"+
                        "\n"+
                        "\n" +
                "Benadryl cream"+
                "\n"+
                "Caladryl lotion or cream"+
                        "\n"+
                "Hydrocortisone cream or ointment"+
                        "\n"+
                "Oatmeal bath (Aveeno)"+

                "\n"+
                        "\n"




        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(Medicine.this,List);
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

