package com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.R;

public class PreHealth extends AppCompatActivity {
    ListView listViewHealth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_health);
        listViewHealth=(ListView)findViewById(R.id.listViewPregnancy);

        String[] values = new String[] {
                     " Early Pregnancy Symptoms",

                      " Implantation Bleeding " ,
                       " False Pregnancy",
                        " Home Pregnancy Tests",

                      " Medicine During Pregnancy"


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item,R.id.textViewpre, values);


        // Assign adapter to ListView
        listViewHealth.setAdapter(adapter);

        listViewHealth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                        if (position==0)
                        {
                            startActivity(new Intent(PreHealth.this,Symtomps.class));
                        }

                        if (position==1)
                        {
                            startActivity(new Intent(PreHealth.this,Implementation.class));
                        }

                        if (position==2)
                        {
                            startActivity(new Intent(PreHealth.this,FalsePregnancy.class));
                        }
                        if (position==3)
                        {
                            startActivity(new Intent(PreHealth.this,PregnancyTest.class));
                        }



                        if (position==4)
                        {
                            startActivity(new Intent(PreHealth.this,Medicine.class));
                        }




            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

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


