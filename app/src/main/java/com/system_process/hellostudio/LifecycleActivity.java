package com.system_process.hellostudio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.asus.amax.hellostudio.R;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
    }
}
