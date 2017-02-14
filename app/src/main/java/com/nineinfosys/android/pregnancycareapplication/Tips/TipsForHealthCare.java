package com.nineinfosys.android.pregnancycareapplication.Tips;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.nineinfosys.android.pregnancycareapplication.R;


/**
 * Created by Supriya on 13-02-2017.
 */

public class TipsForHealthCare extends AppCompatActivity implements
         ViewPager.OnPageChangeListener{


    private int position ;
    private ViewPager viewPage;
    String[] listofgeneralTips;
    private ViewPagerAdapterTips adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_tips);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

       listofgeneralTips = new String []{

                "1. Eat five or six well-balanced meals each day.\n"
                ,
                "2. Take a prenatal vitamin each day as directed by your obstetrician or midwife.\n"
                ,
                "3. Drink plenty of fluids -- at least eight to 10 glasses a day -- avoiding caffeine and artificial coloring.\n"
                ,
                "4. Don't drink alcohol.\n"
                ,
                "5. Don't smoke or allow yourself to be exposed to secondhand smoke.\n"
                ,
                "6. Exercise -- it's important for your general health and also can help reduce stress. Take a pregnancy exercise class or walk at least fifteen to twenty minutes every day at a moderate pace. Walk in cool, shaded areas or indoors in order to prevent overheating.\n"
                ,
                "7. Get adequate sleep -- at least eight hours a night. If you're suffering from sleep disturbances, take naps during the day and see your physician for advice.\n"
                ,
                "8. Wear comfortable, nonrestricting shoes and put your feet up several times a day to prevent fatigue and swelling of the feet, legs, and ankles.\n"
                ,
                "9. Continue to wear a safety belt while riding in motor vehicles. According to the National Highway Traffic Safety Administration, the shoulder portion of the restraint should be positioned over the collar bone. The lap portion should be placed under the abdomen as low as possible on the hips and across the upper thighs, never above the abdomen. Also, pregnant women should sit as far from the air bag as possible.\n"
                ,
                "10. Don't take over-the-counter medications or herbal remedies without first consulting your obstetrician or midwife."
                ,
                "11. Rest\n" +
                        "Maybe this is obvious, but it’s also the easiest tip to not follow. You have a completely new person to take care of—and if this is your first it can be even more daunting trying to learn how to become a mom. \n" +
                        "An adrenaline-fueled panic triggered by your newborn screaming for the last 20 minutes can make resting impossible. But make sure you take the time you need to get some sleep and heal. This may mean getting extra support and sleeping when your baby sleeps, whenever that may be.\n"
                ,

                "12. Use the Sitz Bath\n" +

                        "Even though the human body is designed to allow a fully-formed being to come out of it doesn’t mean it isn’t going to hurt.If you were given an episiotomy, or experienced tearing, you’re going to need to keep your stitches clean. If you did not receive any sutures, your vulva is still likely to be swollen and tender (and let’s not even mention what pushing a baby out does to your rear end). A sitz bath will help keep your undercarriage clean and the soak will be soothing to those exceptionally ouchy bits below.\n"

                ,
                "13. Wear Extra Maxi Pads\n" +

                        "After nine months of period-free bliss, post-birth bleeding can be very heavy. We’ve already mentioned how tender things down there could be, so a little extra padding won’t hurt. Putting two pads side-by-side, or overlapping pads from front-to-back, will give you extra coverage and protection. You can also make \"pad-sicles\" by wetting some pads with aloe vera and witch hazel and freezing.\n"

                ,
                "14Wear Those Mesh Undies\n" +

                        "OK, they’re ugly and ridiculous, but unless you have a large supply of cotton undies that you don’t plan on ever wearing again, those babies will come in handy. You can’t use tampons for at least six weeks after giving birth, and even if you double up on your pads you’re still most likely to experience occasional overflow.\n"+
                        "Take a few extra pairs from the hospital and use them the first week home. Bonus points when you realize you can throw them out instead of adding to the laundry pile.\n"
                ,
                "15. Hover or Lean\n" +

                        "Did we mention that you’re going to be sore “down there”?\n" +
                        "If you find that sitting on the toilet causes your pelvic floor to become achy, try hovering over the seat like you’re in a public restroom, or, lean to one side. Finding a comfortable position for those first few days post-partum is a necessity.\n"
                ,
                "16. Ice Packs are Good\n" +

                        "If you had a hospital birth, there’s a chance that your recovery nurse has already brought you some ice packs. Whether you sit on them or you tuck one in your undies, ice is going to help soothe the swelling and tenderness. \n"+
                        "Never leave ice on for longer than 15 minutes, and make sure you have a protective layer of fabric between your sensitive skin and the pack.\n"
                ,
                "17. Wipe with Medicated Pads\n" +

                        "Witch Hazel is the active ingredient in hemorrhoid pads, and that means they are going to soothe and cool your lady parts. If you’re one of the many, many women who has developed hemorrhoids during pregnancy or childbirth you’re going to want to have these on hands to help with the pain back there--but they’re also approved for use on vaginal tissue. Use these pads to wipe every time you go those first few weeks--your bottom will thank you for it.\n"
                ,
                "18. Don’t Strain\n" +

                        "It’s important to make sure your bowels are working regularly, but don’t push or strain to help with a movement. Drink plenty of fluids, eat foods high in dietary fiber, and take your Colace to help soften your stool. Straining to poop is going to increase the pressure on parts that are already sore and in need of healing.\n"

                ,
                "19. Eat Healthfully\n" +

                        "If you’re normal, you probably wensst a little overboard every now and then. Pregnancy is a great excuse to have Belgian waffles with extra whipped cream every morning, but your body needs to replenish itself now. Eating colorful foods (no, Fruit Loops don’t count) and making sure you get lots of protein and fiber will help your body to heal, and get you feeling better, faster. Hard-boiled eggs are a particularly good go-to, protein-packed snack to have on hand. Plus, make sure to drink plenty of water.\n"

                ,
                "20. Ask for Help\n" +


                        "People are going to want to visit and meet your new baby. Take advantage of their presence and ask for some help. Don’t be too shy to ask them to stroll with the baby for half an hour so you can rest. Ask somebody to take out the garbage, walk the dog, fold some laundry, or heat up some leftovers—anything they do is one less thing you have to worry about. Don’t worry about being bossy—you’re the mom now, and “bossy” is your new middle name—it’s good practice.\n"
               ,
               "21. Increase Your Water Intake:\n" +
                       "\n" +
                       "Water is an elixir for your body. It not only hydrates your skin but makes it more elastic.\n" +
                       "\n" +
                       "It helps in burning calories more efficiently.\n" +
                       "It is a great way to keep your skin healthy and tight.\n" ,

                       "22. Breastfeeding Is Essential:\n" +
                       "\n" +
                       "Apart from being a healthy source of nutrition for your baby, breastfeeding is very important for you too.\n" +
                       "\n" +
                       "When you breastfeed, your calories are transformed into milk, thereby helping you lose the extra fat.\n" +
                       "A breastfeeding mother loses weight faster than a non-breastfeeding mother.\n" ,

                       "23. Exercise Helps:\n" +
                       "\n" +
                       "It is important to indulge in activity or exercise regime once your body is ready post-delivery. Make sure your doctor gives you the go-ahead to start before you begin.",

               "24. Consume Proteins:\n" +
                       "\n" +
                       "Protein is good for muscle growth.\n" +
                       "\n" +
                       "It also contains an important nutrient called collagen which helps in firming your skin.\n" +
                       "Your protein intake depends on your weight and the extent of physical activity you do.\n" +
                       "On an average you should consume 50 grams of protein.\n" ,

                       "25. Exfoliate Your Skin:\n" +
                       "\n" +
                       "Another good way to tighten your skin is to use an exfoliating scrub on your belly when you take a shower.\n" +
                       "\n" +
                       "It helps in increasing the blood circulation by increasing the flow of blood in the area.\n" +
                       "It also creates new, healthy and more elastic skin.\n" +
                       "[ Read: Skin Care After Pregnancy ]\n" +
                       "\n" ,

                       "26. Use of Lotions and Massage:\n" +
                       "\n" +
                       "There are plenty of creams and lotions available in the market which contain collagen as well as Vitamin E, C, A and K.\n" +
                       "\n" +
                       "Apply such lotions on your loose skin as it will aid in skin tightening after pregnancy.\n" +
                       "You can massage with the lotion to improve the blood flow. Do this at least twice a day for good results.\n" ,

                       "27. No To Crash Dieting:\n" +
                       "\n" +
                       "When you opt for strict dieting, you might lose weight faster initially. But once you stop your regime the weight will bounce back faster.\n" +
                       "\n" +
                       "It is always better for the elasticity of your skin when you reduce weight gradually and not dramatically.\n" +
                       "Don’t starve yourself or fall for fad dieting.\n" ,

                       "28. Take Up Strength Training:\n" +
                       "\n" +
                       "After your body is accustomed to regular exercise you can opt for strength training also. Your doctor’s nod is a must though.\n" +
                       "\n" +
                       "Strength training stimulates muscular contraction which helps in building strength.\n" +
                       "It also improves your body composition and reduces fat all over the body.\n" ,

                       "29. Keep A Healthy Mind:\n" +
                       "\n" +
                       "It is really frustrating, when you are unable to lose that extra flab. But in such circumstances, keeping a calm mind is of immense value.\n" +
                       "\n" +
                       "Try to keep yourself relaxed and be patient with yourself.\n" +
                       "Practice deep breathing, listen to music and enjoy the outdoors as much as you can."
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapterTips(TipsForHealthCare.this, listofgeneralTips);

        viewPage.setAdapter(adapter);


        int pos = getIntent().getIntExtra("key", 0);
        viewPage.setCurrentItem(pos);

    }


    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int position) {
        this.position = position;
       viewPage.setCurrentItem(position);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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