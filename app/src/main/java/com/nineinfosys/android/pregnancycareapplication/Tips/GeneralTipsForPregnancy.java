package com.nineinfosys.android.pregnancycareapplication.Tips;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.nineinfosys.android.pregnancycareapplication.R;


public class GeneralTipsForPregnancy extends AppCompatActivity implements
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

                "1. Don’t worry about timing your baby “just right”. Most people take a few months to get pregnant anyway." ,

                "2. Forget #1 and do everything possible to not be in your third trimester in the middle of summer. Because seriously, nine months pregnant in the height of summer sucks." ,

                "3. Your pregnant elephant ankles will return to normal. Just hang in there." ,

                "4. Take more naps. Don’t wait for the baby to be born so you can “nap when the baby naps”… He might not be a good napper." ,

                "5. Ask your husband’s employer if he can take an extra week of paternity leave if you end up having an unplanned c-section." ,

                "6. You have no idea about your capacity to burp and fart until you’re into your second trimester. Just you wait." ,

                "7. Don’t feel guilty if the gender of the baby on the ultra sound isn’t what you were expecting (or hoping for). It’s normal and will pass. (And you will be so happy about your little boy or girl that you’ll forget about it anyway.) Many women struggle with gender disappointment during pregnancy, so don’t let it rob you of your pregnancy joy." ,

                "8. Wear fitted clothes – your bump is beautiful and you look cuter without extra frump." ,

                "9. Don’t buy maternity clothes if you can get around it. Just buy a belly band or button extender and wear your normal clothes. (Until/unless that’s not an option any more.)" ,

                "10. If you do buy anything, buy long tank tops that you can layer under other “normal” shirts. Or better yet, buy nursing tank tops (You will live in them during those first few postpartum months, whether you are layering over them or not.)" ,

                "11. Take heart, your shoes will fit again someday." ,

                "12. Enjoy that beautiful skin. Unfortunately it doesn’t last." ,

                "13. Enjoy that hair. You will soon be losing it in copious amounts." ,

                "14. Save receipts because you really don’t need that bottle sanitizer." ,

                "15. Use your birthday money on yourself, silly girl. I know you’re excited, but that little baby will get more presents than you know what to do with." ,

                "16. Get educated about giving birth. The more you know, the more you will be empowered and the less scared you will be." ,

                "17. Have some understanding about c-sections and recovery… just case. (Ever heard of a “gentle cesarean“?)" ,

                "18. It really is reasonable (and loving!) to let the lady with small children move to the front of the line. Start now." ,

                "19. Read differing parenting philosophy books and then decide for yourself what’s best for you and your family. I know it’s hard to believe, but you really are the expert." ,

                "20. In light of #19, be prepared to change your mind later if you need to.",

                "21. If you want to speed up labor once your contractions have begun, use a breast pump. Oh. My. Goodness." ,

                "22. Have a birth plan but know that it’s just a plan, not a prophecy. It will look different. (Need help? Here’s how to organize and write a birth plan.)" ,

                "23. Having your waters break is not a one-off gush… it continues for hours into labor. Don’t be alarmed when you have to walk around with a towel between your legs for the rest of the day. (Birth is so glamorous.)" ,

                "24. Watching So You Think You Can Dance between contractions provides good distraction, but don’t get mad when they forget to pause it during contractions." ,

                "25. Giving birth is messy. Really messy. What? You know that? Ok then, remember it." ,

                "26. Remember that sometimes your midwife needs encouragement too, especially when things go wrong." ,

                "27. Make sure your husband knows how to quickly and efficiently find the ice machine." ,

                "28. Labor is hard work, but you were totally made for it. Go for it, girl.",

                "29. If you wake up drenched in sweat a week or two after giving birth, get excited about it. You’re sweating off those extra baby fluid pounds." ,

                "30. Deal with your disappointment about things that went wrong with the birth and don’t let it steal the joy of birth from you." ,

                "31. You are going to feel so overwhelmed with love – don’t try to harness it, just soak in it." ,

                "32. Who cares about getting your tiny baby on a schedule from day one? Just snuggle, snuggle, snuggle and let him sleep on your chest as much as your little heart desires. I promise you, you will not regret this. Don’t let any book or auntie tell you otherwise." ,

                "33. Yes, the world really does want to see a bajillion photos of your baby on facebook – load ‘em up. (You’ll never feel so popular as when you’re the mom of an incredibly good-looking brand-new baby.) And even if they don’t, you will NEVER regret taking all those photos. (Just give clear, repeated instructions to your husband to make sure you’re included in some of them too. Don’t shy away because of bad hair or bags under your eyes. When you’ve survived the baby years, you’ll want photographic proof that you were there – mothering victoriously.)" ,

                "34. Tell hubs to stock up on Draino because at around four months post-partum you will begin to shed ungodly amounts of hair." ,

                "35. Your c-section scar will still be numb six months after the surgery, and it will sometimes still feel itchy. Just deal with it and know it’s now a badge of honor."
        };




        viewPage = (ViewPager) findViewById(R.id.viewPager);


        adapter = new ViewPagerAdapterTips(GeneralTipsForPregnancy.this, listofgeneralTips);

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