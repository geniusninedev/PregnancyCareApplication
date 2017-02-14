package com.nineinfosys.android.pregnancycareapplication.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Misscarriage;
import com.nineinfosys.android.pregnancycareapplication.R;


/**
 * Created by Dev on 10-02-2017.
 */
public class MonthlyPregnancy extends Fragment {
    ListView weekbyweekPregnancy;
    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weekbyweek, container, false);
        weekbyweekPregnancy=(ListView)view.findViewById(R.id.weekbyweekPregnancy);
        String[] values = new String[] {  "What Causes Miscarriage?","Symptoms of a Miscarriage?","How Is a Miscarriage Diagnosed and Treated?","How Do I Know if I Had a Miscarriage?" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, R.id.textViewpre, values);
        weekbyweekPregnancy.setAdapter(adapter);

        weekbyweekPregnancy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent i = new Intent(getContext(),Misscarriage.class);
                i.putExtra("key", position);
                startActivity(i);
            }
        });
        return view;
    }



}








