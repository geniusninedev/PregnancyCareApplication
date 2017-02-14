package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterThree;

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
 * Created by Supriya on 13-02-2017.
 */

public class ThirdTrimsterActivity extends AppCompatActivity {

    private ListView listViewExcercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_trimster);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        String[] listOfExcercise= new String[]{
                "Third Trimester Warmup Exercises" ,
                "Third Trimester Strength Workout" ,
                "Third Trimester Cardio Workout",
                "Yoga And Health"
        };

        listViewExcercise=(ListView)findViewById(R.id.ListOfExcercise);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ThirdTrimsterActivity.this,R.layout.activity_first_trimster,R.id.textViewlistexcercise,listOfExcercise);

        listViewExcercise.setAdapter(adapter);

        listViewExcercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(ThirdTrimsterActivity.this,WarmupExcerciseThird.class));
                }
                if(position == 1){
                    startActivity(new Intent(ThirdTrimsterActivity.this,StrengthExcerciseThird.class));
                }

                if(position == 2){
                    startActivity(new Intent(ThirdTrimsterActivity.this,CardioWorkoutThird.class));
                }
                if(position == 3){
                    startActivity(new Intent(ThirdTrimsterActivity.this,YogaAndHealthThird.class));
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
