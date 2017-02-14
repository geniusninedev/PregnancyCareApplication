package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterOne;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.R;


public class FirstTrimsterActivity extends AppCompatActivity {

private ListView listViewExcercise;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_trimster);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        String[] listOfExcercise= new String[]{
                "First Trimester Warmup Exercises" ,
                "First Trimester Strength Workout" ,
                "First Trimester Cardio Workout",
                "Yoga And Health"
        };

        listViewExcercise=(ListView)findViewById(R.id.ListOfExcercise);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FirstTrimsterActivity.this,R.layout.activity_first_trimster,R.id.textViewlistexcercise,listOfExcercise);

        listViewExcercise.setAdapter(adapter);

        listViewExcercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(FirstTrimsterActivity.this,WarmupExcercise.class));
                }
                if(position == 1){
                    startActivity(new Intent(FirstTrimsterActivity.this,StrengthExcercise.class));
                }

                if(position == 2){
                    startActivity(new Intent(FirstTrimsterActivity.this,CardioWorkout.class));
                }
                if(position == 3){
                    startActivity(new Intent(FirstTrimsterActivity.this,YogaAndHealth.class));
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



