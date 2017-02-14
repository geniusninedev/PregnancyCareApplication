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

import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_by_Week_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_five_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_nine_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_seventeen_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_thirteen_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_thirtyone_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_thirtysix_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_twentyone_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.Pregnancy.Week_twentysix_Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.R;

/**
 * Created by Dev on 10-02-2017.
 */
public class WeekByWeek extends Fragment {
ListView weekbyweekPregnancy;
    ArrayAdapter<String> adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.weekbyweek, container, false);
        weekbyweekPregnancy=(ListView)view.findViewById(R.id.weekbyweekPregnancy);
        String[] values = new String[] {  "Weeks 1-4","Weeks 5-8","Weeks 9-12" ,"Weeks 13-16",
        "Weeks 17-20","Weeks 21-25","Weeks 26-30","Weeks 31-35","Weeks 36-40"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, R.id.textViewpre, values);
        weekbyweekPregnancy.setAdapter(adapter);

     weekbyweekPregnancy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
             if (position==0)
             {
                 startActivity(new Intent(getContext(),Week_by_Week_Pregnancy.class));
             }
             if (position==1)
             {
                 startActivity(new Intent(getContext(),Week_five_Pregnancy.class));
             }


             if (position==2)
             {
                 startActivity(new Intent(getContext(),Week_nine_Pregnancy.class));
             }


             if (position==3)
             {
                 startActivity(new Intent(getContext(),Week_thirteen_Pregnancy.class));
             }

             if (position==4)
             {
                 startActivity(new Intent(getContext(),Week_seventeen_Pregnancy.class));
             }
             if (position==5)
             {
                 startActivity(new Intent(getContext(),Week_twentyone_Pregnancy.class));
             }
             if (position==6)
             {
                 startActivity(new Intent(getContext(),Week_twentysix_Pregnancy.class));
             }

             if (position==7)
             {
                 startActivity(new Intent(getContext(),Week_thirtyone_Pregnancy.class));
             }

             if (position==8)
             {
                 startActivity(new Intent(getContext(),Week_thirtysix_Pregnancy.class));
             }

         }
     });
        return view;
    }



}


