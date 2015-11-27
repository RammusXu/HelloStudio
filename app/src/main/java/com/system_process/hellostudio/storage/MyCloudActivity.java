package com.system_process.hellostudio.storage;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.asus.amax.hellostudio.R;

public class MyCloudActivity extends AppCompatActivity {

    public static final String FRAGTAG = "MyCloudFragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_client);

        if (getSupportFragmentManager().findFragmentByTag(FRAGTAG) == null ) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            MyCloudFragment fragment = new MyCloudFragment();
            transaction.add(fragment, FRAGTAG);
            transaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cloud, menu);
        return true;
    }
}
