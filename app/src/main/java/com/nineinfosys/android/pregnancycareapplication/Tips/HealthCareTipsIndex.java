package com.nineinfosys.android.pregnancycareapplication.Tips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.R;


/**
 * Created by Supriya on 14-02-2017.
 */

public class HealthCareTipsIndex   extends AppCompatActivity {

    private ListView ListTipsgeneral;

    String[] listofgeneralTips = new String []{

            "1. Eat five or six well-balanced meals each day."
                     ,
                    "2. Take a prenatal vitamin each day as directed by your obstetrician or midwife."
                     ,
                    "3. Drink plenty of fluids -- at least eight to 10 glasses a day -- avoiding caffeine and artificial coloring."
                     ,
                    "4. Don't drink alcohol."
                     ,
                    "5. Don't smoke or allow yourself to be exposed to secondhand smoke."
                     ,
                    "6. Exercise -- it's important for your general health and also can help reduce stress. Take a pregnancy exercise class or walk at least fifteen to twenty minutes every day at a moderate pace. Walk in cool, shaded areas or indoors in order to prevent overheating."
                     ,
                    "7. Get adequate sleep -- at least eight hours a night. If you're suffering from sleep disturbances, take naps during the day and see your physician for advice."
                     ,
                    "8. Wear comfortable, nonrestricting shoes and put your feet up several times a day to prevent fatigue and swelling of the feet, legs, and ankles."
                     ,
                    "9. Continue to wear a safety belt while riding in motor vehicles. According to the National Highway Traffic Safety Administration, the shoulder portion of the restraint should be positioned over the collar bone. The lap portion should be placed under the abdomen as low as possible on the hips and across the upper thighs, never above the abdomen. Also, pregnant women should sit as far from the air bag as possible."
                     ,
                    "10. Don't take over-the-counter medications or herbal remedies without first consulting your obstetrician or midwife.",
                    "11. Rest" ,
                    "12. Use the Sitz Bath",
                    "13. Wear Extra Maxi Pads",
                    "14. Wear Those Mesh Undies"  ,
                    "15. Hover or Lean"   ,
                    "16. Ice Packs are Good",
                    "17. Wipe with Medicated Pads",
                    "18. Don’t Strain",
                    "19. Eat Healthfully",
                    "20. Ask for Help",
            "21. Increase Your Water Intake",
            "22. Breastfeeding Is Essential",
            "23. Exercise Helps",
            "24. Consume Proteins",
            "25. Exfoliate Your Skin",
            "26. Use of Lotions and Massage",
            "27. No To Crash Dieting",
            "28. Take Up Strength Training",
            "29.  Keep A Healthy Mind"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_tips_for_pregnancy_index);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListTipsgeneral = (ListView)findViewById(R.id.generaltipslist);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.activity_general_tips_for_pregnancy_index,R.id.textViewgeneraltips,listofgeneralTips);
        ListTipsgeneral.setAdapter(mAdapter);

        ListTipsgeneral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(HealthCareTipsIndex.this,TipsForHealthCare.class);
                i.putExtra("key", position);
                startActivity(i);
            }
        });

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

