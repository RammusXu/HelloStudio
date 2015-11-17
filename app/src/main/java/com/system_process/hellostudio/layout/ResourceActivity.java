package com.system_process.hellostudio.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.asus.amax.hellostudio.R;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        int score = 20;
        String resultMsgFmt = getResources().getString(R.string.resultMsg);
        String resultMsg = String.format(resultMsgFmt, score);
        TextView result = (TextView) findViewById(R.id.aty_resource_tv1);
        result.setText(resultMsg);
        String name = "陳會安";
        String device = "平板電腦";
        String myMsgFmt = getResources().getString(R.string.myMsg);
        String myMsg = String.format(myMsgFmt, name, device);
        TextView my = (TextView) findViewById(R.id.aty_resource_tv2);
        my.setText(myMsg);
    }
}
