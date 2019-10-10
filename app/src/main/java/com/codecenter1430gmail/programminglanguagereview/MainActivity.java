package com.codecenter1430gmail.programminglanguagereview;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Intent i;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        logo = (ImageView)findViewById(R.id.logo);
        logo.setImageResource(R.drawable.logo);
        logo.startAnimation(myanim);
        i = new Intent(getApplicationContext(),Main3Activity.class);

        new Thread()
        {
            public void run()
            {
                try
            {
                sleep(1800L);
                startActivity(i);
                finish();
                return;
            }
            catch (InterruptedException localInterruptedException)
            {
                localInterruptedException = localInterruptedException;
                startActivity(i);
                finish();
                return;
            }

            }
        }.start();

    }
}
