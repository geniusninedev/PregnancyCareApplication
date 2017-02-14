package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterOne;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.R;


public class FirstTrimsterActivity  extends Fragment {

    private ListView listViewExcercise;
    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_first_trimster, container, false);


        listViewExcercise=(ListView)view.findViewById(R.id.ListOfExcercise);
        String[] values = new String[]{
                "First Trimester Warmup Exercises" ,
                "First Trimester Strength Workout" ,
                "First Trimester Cardio Workout",
                "Yoga And Health"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, R.id.textViewpre, values);
        listViewExcercise.setAdapter(adapter);

        listViewExcercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){
                    startActivity(new Intent(getContext(),WarmupExcercise.class));
                }
                if(position == 1){
                    startActivity(new Intent(getContext(),StrengthExcercise.class));
                }

                if(position == 2){
                    startActivity(new Intent(getContext(),CardioWorkout.class));
                }
                if(position == 3){
                    startActivity(new Intent(getContext(),YogaAndHealth.class));
                }
            }
        });
        return view;
    }



}





