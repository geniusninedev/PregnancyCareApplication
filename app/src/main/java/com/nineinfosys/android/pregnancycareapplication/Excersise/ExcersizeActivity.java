package com.nineinfosys.android.pregnancycareapplication.Excersise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterOne.FirstTrimsterActivity;
import com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterThree.ThirdTrimsterActivity;
import com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterTwo.SecondTrimsterActivity;
import com.nineinfosys.android.pregnancycareapplication.R;


public class ExcersizeActivity extends AppCompatActivity {


    private ListView Trimster;

    String[] listTrimster = new String []{" First Trimster"," Second Trimster "," Third Trimster"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excersize);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Trimster = (ListView)findViewById(R.id.listTrimsters);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.activity_excersize,R.id.textViewtrimster,listTrimster);
        Trimster.setAdapter(mAdapter);

        Trimster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(ExcersizeActivity.this,FirstTrimsterActivity.class));
                }
                if(position==1){
                    startActivity(new Intent(ExcersizeActivity.this,SecondTrimsterActivity.class));
                }
                if(position==2){
                    startActivity(new Intent(ExcersizeActivity.this,ThirdTrimsterActivity.class));
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
