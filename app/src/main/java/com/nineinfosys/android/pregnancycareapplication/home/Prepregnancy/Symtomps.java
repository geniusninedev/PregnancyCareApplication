package com.nineinfosys.android.pregnancycareapplication.home.Prepregnancy;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nineinfosys.android.pregnancycareapplication.R;

public class Symtomps extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pre_healthlist);


        List = new String[] {
                "Introduction"+
                        "\n"+
                        "\n"+
                        "\n"+"Are you wondering if you might be pregnant?" +
                "\n"+
                " The only way to know for sure is by taking a pregnancy test.\n" +
                "\n" +
                "But there are early symptoms of pregnancy" +
                " that may point to the possibility. " +
                "Here's what to look for.\n" +
                "\n" +
                "Do All Women Get Early Symptoms of Pregnancy?\n" +
                "\n" +
                "Every woman is different. So are her" +
                " experiences of pregnancy. Not every woman " +
                "has the same symptoms or even the same symptoms" +
                " from one pregnancy to the next.",

                "1.Spotting and Cramping"+
                        "\n"+
                        "\n"+
                        "\n"+

                       "After conception, the fertilized egg attaches itself " +
                        "to wall of the uterus. This can cause one " +
                        "of the earliest signs of pregnancy spotting and," +
                        "sometimes, cramping.\n" +
                        "That's called implantation bleeding. " +
                        "It occurs anywhere from six to 12 days " +
                        "after the egg is fertilized.\n" +
                        "The cramps resemble menstrual cramps, " +
                        "so some women mistake them and the bleeding" +
                        " for the start of their period. The bleeding and" +
                        " cramps, however, are slight.\n" +
                        "Besides bleeding, a woman may notice " +
                        "a white, milky discharge from her vagina. That's " +
                        "related to the thickening of the vagina's walls," +
                        " which starts almost immediately after conception." +
                        " The increased growth of cells lining " +
                        "the vagina causes the discharge.\n" +
                        "This discharge, which can continue throughout" +
                        " pregnancy, is typically harmless and doesn't" +
                        " require treatment. But if there is a bad smell " +
                        "related to the discharge or a burning and " +
                        "itching sensation, tell your doctor so they " +
                        "can check on whether you have a yeast or " +
                        "bacterial infection."+
                "\n"+
                        "\n"+
                        "\n",

                "2.Breast Changes"+
                        "\n"+
                        "\n"+
                        "\n"+


                        "Breast changes are another very early sign of pregnancy. " +
                        "A woman's hormone levels rapidly change after conception." +
                        " Because of the changes, her breasts may become swollen," +
                        " sore, or tingly a week or two later. Or they may feel " +
                        "heavier or fuller or feel tender to the touch. " +
                        "The area around the nipples, called the areola, may also darken.\n" +
                        "Other things could cause breast changes. " +
                        "But if the changes are an early symptom " +
                        "of pregnancy, keep in mind that it is going " +
                        "to take several weeks to get used to the new " +
                        "levels of hormones. But when it does, " +
                        "breast pain should ease up.",

                "3.Fatigue"+
                        "\n"+
                        "\n"+
                        "\n"+

                     "Feeling very tired is normal in pregnancy, starting early on.\n" +

                        "A woman can start feeling unusually fatigued as" +
                        "soon as one week after conceiving.\n" +
                        "Why? It's often related to a high level of " +
                        "a hormone called progesterone, although other " +
                        "things such as lower levels of blood sugar, " +
                        "lower blood pressure, and a boost in " +
                        "blood production can all contribute" +
                        "If fatigue is related to pregnancy, " +
                        "it's important to get plenty of rest. " +
                        "Eating foods that are rich in protein " +
                        "and iron can help offset it.",

                "4.Nausea (Morning Sickness)"+
                        "\n"+
                        "\n"+
                        "\n"+

                      "Morning sickness is a famous symptom of pregnancy. " +
                        "But not every pregnant woman gets it." +

                        "The exact cause of morning sickness is " +
                        "not known but pregnancy hormones likely " +
                        "contribute to this symptom. Nausea during" +
                        " pregnancy may occur at any time of the " +
                        "day but most commonly in the morning.\n" +
                        "\n",

                "5.Missed Period"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "The most obvious early symptom of pregnancy " +
                        "and the one that prompts most women to get a " +
                        "pregnancy test -- is a missed period. But not " +
                        "all missed or delayed periods are caused by pregnancy." +
                        "Also, women can experience some bleeding during " +
                        "pregnancy. If you are pregnant, ask your doctor" +
                        " what you should be aware of with bleeding. " +
                        "For example, when is bleeding normal and " +
                        "when is it a sign of an emergency?\n" +
                        "There are reasons, besides pregnancy, for missing " +
                        "a period. it might be that you gained or lost" +
                        " too much weight. Hormonal problems, fatigue, " +
                        "or stress are other possibilities. Some women" +
                        " miss their period when they stop taking birth " +
                        "control pills. But if a period is late and pregnancy " +
                        "is a possibility, you may want to get a pregnancy test."
                        +
                        "\n"+
                        "\n"+
                        "\n",

                "6.Frequent Urination"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "For many women, this starts around the sixth or" +
                        " eighth week after conception. Although this could " +
                        "be caused by a urinary tract infection, diabetes," +
                        " or overusing diuretics, if you're pregnant, it's" +
                        " most likely due to hormonal levels.",


                "7.Constipation"+
                        "\n"+
                        "\n"+
                        "\n"+

                        "Being constipated means your bowel movements are" +
                        " tough or happen less often than normal. " +
                        "Almost everyone goes through it sooner or later." +
                        "Although it’s not usually serious, you'll " +
                        "feel much better when your body is back on track." +
                        "The normal length of time between bowel " +
                        "movements varies widely from person to person. " +
                        "Some people have them three times a day. " +
                        "Others have them only once or twice a week.",

                     "8.Headaches "+
                             "\n"+
                             "\n"+
                             "\n"+
                             "Migraines and other types of headaches, " +
                             "such as tension headache and sinus headache, " +
                             "are painful. Migraine symptoms include a pounding " +
                             "headache, nausea, vomiting, and light sensitivity " +
                             "and are treated with antinausea drugs and " +
                             "abortive or preventive medications. Headache " +
                             "remedies include pain relievers."+
                "\n"+
                        "\n"+
                        "\n"


        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(Symtomps.this,List);
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


