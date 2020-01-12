package com.example.entebus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView splash_image;
    Intent start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        start = new Intent(getApplicationContext(), LoginActivity.class);

        splash_image = findViewById(R.id.splash);
        Animation splash = AnimationUtils.loadAnimation(this,R.anim.splash_transition);
        splash_image.startAnimation(splash);

        Thread splash_timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(start);
                    finish();
                }
            }
        };
        splash_timer.start();
    }
}
