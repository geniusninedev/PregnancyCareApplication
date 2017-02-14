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

public class BabyTips extends AppCompatActivity implements
       ViewPager.OnPageChangeListener{


    private int position ;
    private ViewPager viewPage;

    private ViewPagerAdapterTips adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_tips);


        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        String[] listofgeneralTips = new String []{

                "1. Breastfeeding will come easily and natural to you, so you have nothing to be nervous about, and just ignore all those horror stories. Unless it doesn’t. Go ahead and read a few stories (without obsessing) and prepare for both the best and worst. And practice this mantra now: I will not be defined by breastfeeding ‘success’ or ‘failure’. (Psst – no mom that’s trying hard is a failure. Perhaps banish that word from your vocabulary?)"
                ,
                "2. Breastfeeding will be one of the absolute sweetest things you will ever do. (Need courage to breastfeed in public?)"
                ,
                "3. Breastfeeding will sometimes feel like one of the most annoying things you ever do."
                ,
                "4. Breastfeeding will sometimes feel like a competition with some inanimate object while you vie for your baby’s focus and attention."
                ,
                "5. Breastfeeding will sometimes feel like one of the most time-consuming things you ever do. (And it is.) Hang in there, it changes before you know it and you will miss the excuse to sit down for forty-five minutes at a time like you did during the newborn phase. Later, when you’re baby’s nursing for only ten minutes at a time you’ll be thinking, What baby? Already done? No… let’s just sit here for a while snuggling."
                ,
                "6. Breastfeeding will be one of the wisest things you do for your baby and for you. (Still pregnant? Here’s how you can prepare for breastfeeding.)"
                ,
                "7. Breastfeeding is the one thing only you can do with (and for) your baby. That’s a special honor that only a mama can experience. Remember to appreciate it."
                ,
                "8. If you keep your baby awake too long, he will never go to sleep easily. Don’t overestimate how much awake time a newborn can handle between naptimes."
                ,
                "9. Don’t worry about changing your baby every time he spits up. You already have too much laundry to do. Just rub it in – ha!"
                ,
                "10. Never judge your baby’s clothes by the numbers on the tag. If you think that cutest-ever outfit for your baby is too big to pull out, do it anyway. It’s easier than you know to miss the “right size” window."
                ,
                "11. When traveling on an airplane, don’t only pack a spare set of clothes for your baby – pack a spare shirt for yourself too. Just go ahead and trust me on this one."
                ,
                "12. I’m totally against the use of “baby TV time” (you guys know how bad it is for your kids’ development to let them watch TV as babies and toddlers, right?! experts say to wait until two years old), but go ahead and use the TV to your advantage when cutting your baby’s fingernails. (Don’t worry, when they hit the stage where this is necessary, you will know.)"
                ,
                "13. Don’t wake your sleeping baby unless you absolutely have too. Feeding schedules, shmeeding schedules. Let the baby sleep. (You’re welcome.)"
                ,
                "14. When your baby is a newborn, take extra care to burp him after a feed. (I like the firm, upward rub up the back. I’m also a fan of the firm thump.) It’s worth the extra few minutes to avoid gassy baby melt-downs."
                ,
                "15. If your baby is having a melt-down, drop everything and walk outside. It really does work every time so don’t waste your time trying to find something else more “convenient.”"
                ,
                "16. Four months is not too early to begin teething. If in doubt, just keep sticking your finger in there to check."
                ,
                "17. Decide on a lullaby song for your baby so that every time you sing it they know to expect that it’s naptime/bedtime. (Just make sure that you like it, or make your own up.)"
                ,
                "18. Just because your baby sleeps through the night consistently at a few weeks old doesn’t mean they will continue as he gets older and hungrier. Just know that in advance. Sometimes this really feels like two steps forward, one step back. (Or one step forward, two steps back.)"
                ,
                "19. Traveling with babies is fun and adventurous and you often get to jump to the front of the line. Take advantage of kind security guards and airline officials.  No shame here, ladies, no shame. Take favors when you get them – DUH."
                ,
                "20. Leave the diaper bag in the car unless you really, really need it. You have enough to carry around."
                ,
                "21. Don’t wait months and months to introduce the bottle – you underestimate just how much you baby really does love your boobs."
                ,
                "22. There will be some diaper blowouts that are not worth trying to clean up outside of the bathtub.  We’re talking a right, hot mess. That goes for both you and baby."
                ,
                "23. Don’t be legalistic about starting solids at exactly six months old. Get educated about a baby’s gut development, but then learn to listen to your baby’s cues and trust your instincts. Don’t start them too soon (again, read up on that gut development!), but remember that something magic doesn’t just click on their half birthday."
                ,
                "24. It’s okay to pull your baby into bed with you sometimes when you’re just too tired to get up yet. Do what you want. (Just do it safely: bed rails are your friend, move away your blankets, safety first, ladies! . . . with comfort and convenience being a close tie for second.) And seriously, don’t worry — you’re not going to ruin them by co-sleeping. I promise you co-sleeping is not the evil that will turn them into disobedient, overly dependent narcissists. (Don’t allow any rigid parenting book to convince you otherwise.) Remember, these are BABIES. Let them act like babies. They have plenty of time to grow up. And remember, you are TIRED. Do what you need to do to get a little sleep, too. DUH."
                ,
                "25. There will be lots of times when the baby is crying and you don’t know why. That’s ok, babies cry. Sometimes they are trying to communicate something, but often they are releasing their big emotions and pent up baby angst. Just do your best and remember that sometimes even you specifically choose movies based on the fact that you need a good cry, too."
                ,
                "26. When introducing solids to your baby, strip him down to a diaper and bib, roll up your sleeves, put on goggles, and make sure an assistant is standing by (with a camera, of course)."
                ,
                "27. Be prepared when you’re encouraging your child to learn to crawl. I know it’s fun and super cute, but there really is no turning back. (Don’t say I didn’t warn you, you overly keen first-time mom, you.)"

        };



        viewPage = (ViewPager) findViewById(R.id.viewPager);



        adapter = new ViewPagerAdapterTips(BabyTips.this, listofgeneralTips);

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