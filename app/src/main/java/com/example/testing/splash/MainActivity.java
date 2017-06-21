package com.example.testing.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "111";
    SplashLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (SplashLayout) findViewById(R.id.splashLayout);
        layout.addListener(new SplashLayout.onClickListener() {
            @Override
            public void onFinish() {
                Intent intent = SecondActivity.newIntent(MainActivity.this);
                startActivity(intent);
                finish();
            }

            @Override
            public void onClickBackgroud(View v) {
                Intent intent = ThirdActivity.newIntent(MainActivity.this);
                startActivity(intent);
                finish();
            }
        });
    }
}
