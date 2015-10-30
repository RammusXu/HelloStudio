package com.system_process.hellostudio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.asus.amax.hellostudio.R;
import com.system_process.hellostudio.layout.FrameActivity;
import com.system_process.hellostudio.layout.RelativeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button main_btn_rl = (Button) findViewById(R.id.relataive_btn);
        main_btn_rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOtherActivity = new Intent(v.getContext(), RelativeActivity.class);
                startActivity(goOtherActivity);
            }
        });
        Button main_btn_fm = (Button) findViewById(R.id.frame_btn);
        main_btn_fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOtherActivity = new Intent(v.getContext(), FrameActivity.class);
                startActivity(goOtherActivity);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "One");
        menu.add(0, 1, 2, "Two");
        menu.add(0, 2, 1, "Three");
        return super.onCreateOptionsMenu(menu);
    }

    public void sendMessage(View view) {
        String s  ="cool";
        //Toast.LENGTH_LONG表示顯示時間較長，Toast.LENGTH_SHORT則表示顯示時間較短
        Toast.makeText(view.getContext(), "這是一個Toast......", Toast.LENGTH_LONG).show();
        Log.d("HI", "sendMessage() returned: " + "this is log");
        Log.d("NiceTag", "sendMessage() returned: " + s);
    }




}
