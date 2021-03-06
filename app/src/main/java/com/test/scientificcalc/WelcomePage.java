package com.test.scientificcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        getSupportActionBar().hide();
        Thread thread = new Thread()
        {
            public void run()
            {
                try {
                    sleep(1000);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(WelcomePage.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();


    }
}