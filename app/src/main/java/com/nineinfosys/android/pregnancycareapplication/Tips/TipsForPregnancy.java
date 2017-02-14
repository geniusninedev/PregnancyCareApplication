package com.nineinfosys.android.pregnancycareapplication.Tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.R;


public class TipsForPregnancy extends AppCompatActivity {

    private ListView ListTips;

    String[] listofTips = new String []{" General Tips"," Husband Tips "," Baby Tips", " Mother Tips", " After Pregnancy Health Care Tips"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_for_pregnancy);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListTips = (ListView)findViewById(R.id.listOfTips);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.activity_excersize,R.id.textViewtrimster,listofTips);
        ListTips.setAdapter(mAdapter);

        ListTips.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    startActivity(new Intent(TipsForPregnancy.this,GeneralTipsForPregnancyIndex.class));
                }
                if(position==1){
                    startActivity(new Intent(TipsForPregnancy.this,HusbandTipsIndex.class));
                }
                if(position==2){
                    startActivity(new Intent(TipsForPregnancy.this,BabyTipsIndex.class));
                }
                if(position==3){
                    startActivity(new Intent(TipsForPregnancy.this,MotherTipsIndex.class));
                }
                if(position==4){
                    startActivity(new Intent(TipsForPregnancy.this,HealthCareTipsIndex.class));
                }


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
