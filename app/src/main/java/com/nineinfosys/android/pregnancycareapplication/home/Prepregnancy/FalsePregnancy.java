package com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;

/**
 * Created by Dev on 10-02-2017.
 */
public class FalsePregnancy extends AppCompatActivity{

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {"False Pregnancy :"+
                "\n"+
                "\n"+

                "Pregnancy is usually an exciting time for " +
                "expectant parents. But pregnancy doesn't " +
                "always end with the anticipated baby. In " +
                "rare cases, a woman (or even a man) believes " +
                "she is pregnant, only to find out that her symptoms " +
               "were caused not by pregnancy, but by something else " +
               "entirely."+
                "False pregnancy, clinically termed pseudocyesis, " +
                "is the belief that you are expecting a baby when " +
                "you are not really carrying a child. People with " +
                "pseudocyesis have many, if not all, symptoms of pregnancy " +
                "with the exception of an actual fetus. Some men experience " +
                "a related phenomenon known as couvade, or sympathetic pregnancy." +
                " They will develop many of the same symptoms as their" +
                " pregnant partners, including weight gain, nausea, and backache."+
                "False pregnancy, clinically termed pseudocyesis, is the belief " +
                "that you are expecting a baby when you are not really " +
                "carrying a child. People with pseudocyesis have many, " +
                "if not all, symptoms of pregnancy with the exception " +
                "of an actual fetus. Some men experience a related " +
                "phenomenon known as couvade, or sympathetic pregnancy. " +
                "They will develop many of the same symptoms as their " +
                "pregnant partners, including weight gain, nausea, and backache."+
                "\n"+
                "\n"+
                "\n",

                "What Causes False Pregnancy?"+
                        "\n"+
                "\n"+
                        "\n"+
                "Only recently have doctors begun to understand the " +
                        "psychological and physical issues that are " +
                        "at the root of pseudocyesis. Although the" +
                        " exact causes still aren't known, doctors suspect " +
                        "that psychological factors may trick the body into" +
                        " \"thinking\" that it's pregnant."+
                        "When a woman feels an intense desire to " +
                        "get pregnant, which may be because of " +
                        "infertility, repeat miscarriages, impending" +
                        " menopause, or a desire to get married, her body " +
                        "may produce some pregnancy signs " +
                        "(such as a swollen belly, enlarged breasts, and even the sensation of fetal movement). " +
                        "The woman's brain then misinterprets those" +
                        " signals as pregnancy, and triggers the release of hormones"+
                        "Some researchers have suggested that poverty," +
                        " a lack of education, childhood sexual abuse, " +
                        "or relationship problems might play a role in " +
                        "triggering false pregnancy. Having a false pregnancy " +
                        "is not the same as claiming to be pregnant for " +
                        "a benefit (for example, to profit financially), " +
                        "or having delusions of pregnancy."+
                        "\n"+
                "\n"+
                "\n",




                "Tests for False Pregnancy"+
                        "\n"+
                        "\n"+
                        "\n"+
                        "To determine whether a woman is" +
                        " experiencing a false pregnancy, the doctor will" +
                        " usually evaluate her symptoms, perform a " +
                        "pelvic exam and abdominal ultrasound " +
                        "the same tests used to feel and visualize " +
                        "the unborn baby during a normal pregnancy."+
                        "In a case of false pregnancy, no baby will be seen " +
                        "on the ultrasound, and there won't be any heartbeat." +
                        " Sometimes, however, the doctor will find some of the " +
                        "physical changes that occur during pregnancy, such as " +
                        "an enlarged uterus and softened cervix. Urine pregnancy " +
                        "tests will always be negative in these cases, with the " +
                        "exception of rare cancers that produce similar " +
                        "hormones to pregnancy"+
                        "Certain medical conditions can mimic the symptoms " +
                        "of pregnancy, including ectopic pregnancy, " +
                        "morbid obesity, and cancer. These conditions " +
                        "may need to be ruled out with tests."
                        +
                        "\n"+
                        "\n",

                   "Treating False Pregnancy" +
                           "\n"+
                        "\n" +
                           "\n"+
                        "When a woman believes she is pregnant," +
                           " especially for a period of several months, " +
                           "it can be very upsetting for her to learn that " +
                           "she is not. Doctors need to gently break the news, " +
                           "and provide psychological support, including therapy," +
                           " to help the patient with pseudocyesis recover" +
                           " from her disappointment."+

                "\n"+
                        "\n" +
                        "\n"
















        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(FalsePregnancy.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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



