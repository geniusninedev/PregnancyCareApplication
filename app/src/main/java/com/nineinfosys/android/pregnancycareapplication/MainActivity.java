package com.nineinfosys.android.pregnancycareapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import com.nineinfosys.android.pregnancycareapplication.DosAndDonts.DosAndDontsActivity;
import com.nineinfosys.android.pregnancycareapplication.Excersise.ExcersizeActivity;
import com.nineinfosys.android.pregnancycareapplication.Generaltips.Tips;
import com.nineinfosys.android.pregnancycareapplication.Tips.TipsForPregnancy;
import com.nineinfosys.android.pregnancycareapplication.home.Clothes;
import com.nineinfosys.android.pregnancycareapplication.home.Excercise;
import com.nineinfosys.android.pregnancycareapplication.home.Introduction;
import com.nineinfosys.android.pregnancycareapplication.home.PrePregnancy;
import com.nineinfosys.android.pregnancycareapplication.home.Pregnancy;
import com.nineinfosys.android.pregnancycareapplication.home.Sleep;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;
    String[] web = {"Introduction",
            "Pre-Pregnancy ",
            "Pregnancy",
            "Excercise In Pregnancy",
            "Right Clothes To Wear During Pregnancy",
            "The Basics Of Good Sleep During Pregnancy"



    } ;
    Integer[] imageId = {   R.drawable.begin,
            R.drawable.pre,
            R.drawable.carr,
            R.drawable.exercise,
            R.drawable.rightwear,
            R.drawable.sleep,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.care);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    startActivity(new Intent(MainActivity.this,Introduction.class));
                }


                if (position == 1) {

                    startActivity(new Intent(MainActivity.this,PrePregnancy.class));
                }
                if (position == 2) {

                    startActivity(new Intent(MainActivity.this,Pregnancy.class));
                }
                if (position == 3) {

                    startActivity(new Intent(MainActivity.this,Excercise.class));
                }
                if (position == 4) {

                    startActivity(new Intent(MainActivity.this,Clothes.class));
                }
                if (position == 5) {

                    startActivity(new Intent(MainActivity.this,Sleep.class));
                }


            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                /*Intent i=new Intent(this,Splash_Screen.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity;*/
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_tips) {
            startActivity(new Intent(MainActivity.this,TipsForPregnancy.class));

        } else if (id == R.id.nav_excercise) {
            startActivity(new Intent(MainActivity.this, ExcersizeActivity.class));

        } else if (id == R.id.nav_does) {
            startActivity(new Intent(MainActivity.this, DosAndDontsActivity.class));
        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
