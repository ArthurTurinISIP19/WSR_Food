package com.example.food_wsr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.test.espresso.web.sugar.Web;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView circleProgress = (ImageView) findViewById(R.id.imageView5);
        @SuppressLint("ResourceType") Animation circleAnim = AnimationUtils.loadAnimation(this, R.animator.circle);
        circleProgress.startAnimation(circleAnim);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, OnBoardingScreen1.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }, 2000);
    }
}