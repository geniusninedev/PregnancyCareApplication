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

public class MotherTipsInPregnancy extends AppCompatActivity implements
      ViewPager.OnPageChangeListener{

    private int position;
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

                "1. Never judge a parent that is bribing their baby with food… there will be times when you end up doing it too."
                ,
                "2. Be prepared for spontaneous mama-tears when you have love-saturated-heart moments. (And don’t rush them – they are precious.)"
                ,
                "3. Although you already thought you were a responsible driver, you will start to drive even slower and even more cautiously. Just sayin. Your wild days are over. . . at least temporarily. (But seriously Grandma, please at least try to drive the speed limit. You don’t want to get pulled over because a cop thinks you might be driving stoned. BE NORMAL.)"
                ,
                "4. Congratulations, you will now forever be known as “so-and-so’s” mom."
                ,
                "5. You will be tempted to spend more time making sure your baby looks cute than making sure you do. Keep it real, girlfriend. Brush your hair for goodness sakes."
                ,
                "6. Diaper bags are for carrying important things, like snacks for mommy."
                ,
                "7. Your baby will sleep through the night sometimes… and when he does you will have insomnia."
                ,
                "8. Even though you think you won’t be one of “those” parents who wants to buy their kid everything, you will come home with a big ridiculous Baby Einstein exersaucer. (And he will absolutely love it.)"
                ,
                "9. During those first few months, be prepared to go through baby’s clothes every 3-4 weeks and pack up the too-small ones and pull out the bigger ones. (And be aware that you might get a little teary on occasion about how fast it’s all going.)"
                ,
                "10. Even though it feels like a lot of work to think ahead and make double portions, it’s worth the effort to have homemade meals to pull out of the freezer instead of frozen pizzas on those nights. (Although frozen pizzas work too. See a theme here, ladies? Again, no shame. No shame.)"
                ,
                "11. Write milestones down on a calendar if you’re not into doing a baby book – it’s a lot easier than scrolling back through all your facebook status updates to remember when baby learned new tricks."
                ,
                "74. Make sure to regularly go through your photo files and delete 30% of the millions of photos you’re taking of sweet baby. (They really are more similar than you think.) But don’t stop taking the millions."
                ,
                "12. Plan for “quick errands” to take twice as long as they used to. Actually, make that three times as long."
                ,
                "13. There will days when you want to return to work just so you can have a break."
                ,
                "14. Being a stay-at-home-mom is the only job in the world that doesn’t come with coffee breaks, lunch breaks, weekends, holidays, or sick days. And there’s nothing you can do about it except to learn to roll with it. You really can learn to be a SAHM without losing your marbles."
                ,
                "15. There will be days where you cry as much as your baby. This is normal. There will also be days when you cry more than your baby. This is also normal."
                ,
                "16. When your baby is going through a growth spurt, cut your to-list down to 25% and give yourself lots of grace when it comes to house work and errands."
                ,
                "17. You think hearing your baby say “mama” for the first time will melt your heart… It will, but know that it’s even more than that. It will also blow your mind and make you weak at the knees. (So basically it affects your whole body, it’s that good.)"
                ,
                "18. Different babies have different milestones at different times. Do your best not to compare."
                ,
                "19. Weekly menu-planning has never been so important. I know it’s boring and not spontaneous, but it really does help. And I’m NOT one of those women who have binders of home organization stuff (bless their hearts), and yet I’m telling you – just plan the freaking meals. You’ll thank me later."
                ,
                "20. If you’re having one of those days where you feel discouraged because you’re getting nothing done, take 20 minutes to play with your baby without multi-tasking. It will instantly give you perspective."
                ,
                "21. Take long moments to stare at your little wonder and drink in that baby goodness. They really do grow way too fast."
                ,
                "22. Keep in mind that immunizations are harder for mama than for baby."
                ,
                "23. Find an on-line forum to join for encouragement and support."
                ,
                "24. Your bookmarks bar will become overrun with parenting websites and forums… but save your other links too. After the first couple of months you’ll want them again."
                ,
                "25. Always try to leave five minutes earlier than you need to. Then you will only be five minutes late to wherever you’re going (instead of ten) after you’ve changed the pooey diaper that inevitably happens when you’re walking out the door."
                ,
                "26. Be prepared to wonder if you ever knew what love was before you had a child."
                ,
                "27. Doing a load of laundry, folding it, and putting it away all within the same day will make you feel like wondermom. (Go ahead and congratulate yourself and tweet about it when you accomplish this.)"
                ,
                "28. Make feeding yourself as big a priority as feeding your baby. (That way everyone wins.) You really do need to be intentional about taking care of yourself."
                ,
                "29. Don’t stress about baby-proofing. Your baby will help you when it’s time."
                ,
                "30. Watching your husband be a daddy will make you fall in love with him even more. Relish it. Appreciate it. And make sure he knows how much it turns you on."
                ,
                "31. Don’t wait too long before finding a mom’s group. It really is more fun than you’d expect. You’re entering into one of the biggest changes of your life (maybe the biggest) and it helps to have others going through it along with you. They don’t even have to be your best friends. They just need to be willing to share the mom life and the little years with you. Solidarity, girls. #WeNeedEachOther"
                ,
                "32. You might find yourself accidentally speaking in a higher pitch or saying things like “bye bye”  or “night night” or “poo poo” when talking to other adults. You’ll grow out of it as you get used to this gig, so just have fun making fun of yourself in the meantime. You might also find yourself swaying the childless shopping cart back and forth as you read labels or scan the shelves looking for an item during the rare kid-free grocery run. Again, just laugh at yourself and then tweet about it later. These days are over fast."
                ,
                "33. You will re-define “sleeping-in” to any time past 7:00am, and thankfully it will happen every once-and-a-while."
                ,
                "34. Don’t put off buying a video baby monitor if you can afford to swing it. Not only will it provide endless entertainment for your first few days of having it, but it will save you from playing the guessing game about naptimes."
                ,
                "35. Be careful not to underestimate the small things. Starting your day with simple things like making the bed, having a shower, and eating breakfast will make the entire rest of your day better. Seriously, DO THIS STUFF."
                ,
                "36. Don’t get defensive when friends without children (especially single friends) ask you what you do all day at home. They honestly have no clue what it’s like to maintain sanity as a stay-at-home-mom."
                ,
                "37. Remember that you’re doing a great job. Being a mom brings out the best and the worst in you. Know that you’re normal and try to learn from all of it. And more than that, enjoy the ride — you’re a far better mom than you probably think."
        };


        viewPage = (ViewPager) findViewById(R.id.viewPager);


        adapter = new ViewPagerAdapterTips(MotherTipsInPregnancy.this, listofgeneralTips);

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