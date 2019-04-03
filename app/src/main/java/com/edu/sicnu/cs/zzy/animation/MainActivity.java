package com.edu.sicnu.cs.zzy.animation;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewClick(View v){
        CircleView circleView = (CircleView) v;
        circleView.setPaintColor(Color.GREEN);
        circleView.setStrokeWidth(25);
        circleView.Increment();

//        Animation animation = new TranslateAnimation(v.getTranslationX(),v.getTranslationX(),v.getTranslationY(),v.getTranslationY()+v.getHeight());
//        animation.setDuration(2000);
//        animation.setFillAfter(true);
//        circleView.startAnimation(animation);


//        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(circleView,"TranslationY",v.getTranslationY(),v.getTranslationY()+v.getHeight());
//        objectAnimator.setDuration(2000);
//        objectAnimator.start();

        circleView.animate().translationYBy(v.getHeight()).setDuration(2000).start();
    }
}
