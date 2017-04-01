package com.example.adi.news_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //loading Activity Transition animation
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        //Initializing Variables
        toolbar=(Toolbar)findViewById(R.id.main_toolbar);
        //Setting Up the toolbar
        setSupportActionBar(toolbar);
    }
}
