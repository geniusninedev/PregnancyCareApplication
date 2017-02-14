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


import com.nineinfosys.android.pregnancycareapplication.Pregnancy.FirstTrimister;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.SecondTrimister;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.ThirdTrimister;
import com.nineinfosys.android.pregnancycareapplication.R;

/**
 * Created by Dev on 10-02-2017.
 */
public class TrimisterPregnancy extends Fragment {

    ListView weekbyweekPregnancy;
    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weekbyweek, container, false);
        weekbyweekPregnancy=(ListView)view.findViewById(R.id.weekbyweekPregnancy);
        String[] values = new String[] {  "First Trimister","Second Trimister","Third Trimister" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, R.id.textViewpre, values);
        weekbyweekPregnancy.setAdapter(adapter);

        weekbyweekPregnancy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    startActivity(new Intent(getContext(), FirstTrimister.class));
                }
                if (position == 1) {
                    startActivity(new Intent(getContext(), SecondTrimister.class));
                }


                if (position == 2) {
                    startActivity(new Intent(getContext(), ThirdTrimister.class));
                }


            }
        });
        return view;
    }



}





