package com.nineinfosys.android.pregnancycareapplication.Excersise.TrimsterTwo;

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

public class SecondTrimsterActivity extends Fragment {

    private ListView listViewExcercise;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_first_trimster, container, false);


        String[] listOfExcercise = new String[]{
                "Second Trimester Warmup Exercises",
                "Second Trimester Strength Workout",
                "Second Trimester Cardio Workout",
                "Yoga And Health"
        };

        listViewExcercise = (ListView) view.findViewById(R.id.ListOfExcercise);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, R.id.textViewpre, listOfExcercise);

        listViewExcercise.setAdapter(adapter);

        listViewExcercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(getContext(), WarmupExcerciseSecond.class));
                }
                if (position == 1) {
                    startActivity(new Intent(getContext(), StrengthExcerciseSecond.class));
                }

                if (position == 2) {
                    startActivity(new Intent(getContext(), CardioWorkoutSecond.class));
                }
                if (position == 3) {
                    startActivity(new Intent(getContext(), YogaAndHealthSecond.class));
                }
            }
        });
        return view;

    }

}
