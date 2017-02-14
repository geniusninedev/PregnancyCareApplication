package com.nineinfosys.android.pregnancycareapplication.home;

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
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.PreCheckUp;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.PreHealth;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.PreHealthlist;
import com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy.Symtomps;

public class PrePregnancy extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_pregnancy);

        listView=(ListView)findViewById(R.id.listViewPregnancy);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //   Chankya=(TextView)findViewById(R.id.textView1);
        String[] values = new String[] {  "Pre-Pregnancy Health","Pre-Pregnancy Checkup List","Pregnancy Symtomps" ,"Already Pregnant"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.textViewpre, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    startActivity(new Intent(PrePregnancy.this,PreHealthlist.class));
                }

                if (position==1){
                    startActivity(new Intent(PrePregnancy.this,PreCheckUp.class));

                }
                if (position==2){
                    startActivity(new Intent(PrePregnancy.this,Symtomps.class));
                }

                if (position==3){
                    startActivity(new Intent(PrePregnancy.this,PreHealth.class));
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
