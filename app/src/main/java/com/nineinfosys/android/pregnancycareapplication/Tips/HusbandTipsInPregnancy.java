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

public class HusbandTipsInPregnancy extends AppCompatActivity implements
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

                "1. Your wife’s hormones will eb and flow like ocean waves. And just when you think you have her figured out—BAM! (This is especially true during her first trimester.)\n"
                ,
                "2. Always agree with her. Unless of course she doesn’t want you to. Then, whatever you do, don’t.\n"
                ,
                "3. You’ll need to take on some added responsibilities around the house during the first trimester if your wife experiences morning sickness.\n"
                ,
                "4. Have a burping or farting contest with your wife. She’ll win.\n"
                ,
                "5. Many women have an increased sex drive their 2nd trimester. Hopefully your wife is one of them. Enjoy it. (I said many, not all) And don’t worry about hurting baby (unless her Dr has said otherwise).\n"
                ,
                "6. Holy boobs! After the first trimester (when they may be far too sore) enjoy your wife’s new boobs now. Did you see #5?\n"
                ,
                "7. Let your boss know your wife is pregnant around the beginning of the second trimester. See what your options are for Paternity Leave.\n"
                ,
                "8. It’s totally normal if you have baby gender disappointment at the ultrasound (or longer). Just begin thinking of ways you’ll redefine family so you can get excited again.\n"
                ,
                "9. Go to all appointments with your wife. This includes Dr and lamaze. Even if you think it’s stupid. Go.\n"
                ,
                "10. Educate yourself about birth. C-sections. Inductions. Birth plans. Natural vs drugs.\n"
                ,
                "11. Just because she is gaining weight does not mean you need to also.\n"
                ,
                "12. Decide on what you want to do about circumcision. And when you want to have it done if you decide you do. You will definitely want to know this before you get to the hospital.\n"
                ,
                "13. Cravings are so real. Get to the store and then back home as quick as humanly possible before the craving changes.\n"
                ,
                "14. Foot massages are golden.\n"
                ,
                "15. Tell her she is beautiful. Her body will stretch, grow, stretch some more and just when you think it can’t possibly get any bigger, it will. Your wife is sexy…don’t you doubt this for a second because her insecurities about her new body will magnify if you believe she is anything but. Again, tell her she is beautiful and believe it.Advice for New Dads\n"
                ,
                "16. Take the time to ask how she is doing and truly listen to what she is saying.\n"
                ,
                "17. Pamper your wife. Bring her flowers, write a love note…speak her love language as she may be having a lot of strange new feelings about herself.\n"
                ,
                "18. Have sex to induce labor at the end of the 3rd trimester. Remind her of this. It is suggested that you don’t have sex for at least 6 weeks after the baby is born. So remind her again.\n"
                ,
                "19. It’s normal to feel like you don’t have a connection with the baby yet. After all, you aren’t the one carrying it, feeling it’s kicks, and any of the pregnancy ailments that come along with being pregnant that serve as a constant reminder that you’re growing another human.\n"
                ,
                "20. Don’t forget to pack a hospital bag for yourself.\n"
                ,
                "21. Your wife is going to have a million questions to go over together. Humor her. It’s important to become educated together. After all, there are a lot of things that happen to baby right after birth that you should talk about now and decide on together.\n",
                "22. Get the car seat securely strapped in the car. Despite all the other things you and your wife got as baby shower gifts, the car seat is the single most important thing you will need for baby as it is required to take a baby home from the hospital. (The Fire Station can usually help with this if you have any doubt or questions.)\n"
                ,
                "23. Help with the things she can’t do easily herself: tying laces, putting boots on, shaving legs, painting toenails.\n"
                ,
                "24. Avoid planning any work trips during the last trimester. You don’t want to miss the birth.\n"   ,
                "25. Make sure the car has gas and you know the quickest way to the hospital in case you need to get there fast.\n"
                ,
                "26. labor, birth & the hospital stayAdvice for Dads about Birth\n"
                ,
                "27. Giving birth isn’t glamorous. You will see your wife’s body in a way you never have before and may never want to again.\n"
                ,
                "28. Labor is just as exhausting for dads in a totally different way.\n"
                ,
                "29. Expect the unexpected. You know that birth plan you two worked so hard creating? Have an open mind because it may not go according to plan.\n"
                ,
                "30. Consider asking someone else to take pictures of the birth so you can be totally present. Just make sure it’s someone you and your wife are comfortable with because they will get more than a sneak peak.\n"
                ,
                "31. Be prepared to speak up. Do you feel like an epidural is being pushed? Are there too many visitors in the room? Change it. Your wife will be focusing intently on contractions, it will be your job to take care of the other things.\n"
                ,
                "32. Don’t be afraid to cut the cord, it is far easier than you’re imagining.\n"
                ,
                "33. It’s normal for your wife to poop while giving birth. Uh, what? Yup. But, the Dr or nurse will clean it up so quickly you probably won’t even notice. If you do, just roll with it, and try to forget it.\n"
                ,
                "34. Your wife may scream obscenities at you while she’s in the midst of labor. She doesn’t mean them.\n"   ,
                "35. Bring healthy snacks that you can sneak between contractions…you will need the energy to support your wife.  You remembered to pack these in your daddy bag, right?\n"
                ,
                "36. You will see your wife in intense pain and be able to do absolutely nothing about it.\n"
                ,
                "37. At least try to help her ease the pain. Does she need a foot massage? More ice? A cold cloth for her head? Does she want to change positions? A hand to hold? Music? Do your best to help ease her discomforts but understand she may also want you to do absolutely nothing. Remember #27? Told you so.\n"
                ,
                "38. You will wish you could bottle the feelings you felt when watching the baby get set on your wife’s chest for the very first time. No words can describe this moment. Same goes for when you hold your baby for the first time. It’s quite natural for a flood of emotions: joy, happiness, love, fear, uncertainty.\n"
                ,
                "39. Babies look funny when they are born. Most will have a cone shaped head (unless your wife has a c-section) and many are born covered in vernix, and some are born covered in blood, lanugo, and/or milia. Also, all of their features are swollen especially their genitalia so I wouldn’t go bragging about where your son got is size quite yet.Dads and Birth\n"
                ,
                "40. You may cry. You are no less a man.\n"
                ,
                "41. Write down your emotions and feelings so when/if you’re ever stressed about baby you can reflect back on this moment.\n"
                ,
                "42. Tell your wife what an amazing job she did…even if she got the epidural she (or you) didn’t want to get. Even if the birth didn’t go according to plan. Even if …\n"
                ,
                "43. Tell your wife how beautiful she looks.\n"
                ,
                "44. Spend time having skin to skin contact with the baby. You packed a button up shirt in your hospital bag…right?\n"
                ,
                "45. Changing the 1st diaper will take you forever—the first poop is a lot like wiping up tar. Don’t throw in the towel. Just know that by the 3rd diaper you’ll be a pro.\n"
                ,
                "46. Get use to analyzing poop.\n"
                ,
                "47. Post labor contractions hurt too. Your wife doesn’t push the baby out and then feel great. She will not only need to deliver the placenta immediately after giving birth but for the next several days her uterus will contract to return to its normal size. This can still be painful and uncomfortable.\n"
                ,
                "48. Consider a ‘push present.’\n"
                ,
                "49. Get some rest. If your hospital doesn’t carve out a “no visitors” window during the day, you should. It’s okay to put a sign on your door that you’re all resting and to please not disturb.\n"
                ,
                "50. Your first car ride home will be the most intense, alert, nerve-wracking car ride you will ever take.\n"
                ,
                "51. Introduce your pets to the new baby before bringing baby home. Bring a swaddle blanket you wrapped baby in at the hospital home to let the dog(s) sniff prior to bringing the baby home. Let the blanket hang out there where the dogs can keep checking it if need be."


        };
        viewPage = (ViewPager) findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapterTips(HusbandTipsInPregnancy.this, listofgeneralTips);

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