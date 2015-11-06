package com.system_process.hellostudio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
        Button main_btn_dynamic = (Button) findViewById(R.id.aty_btn_dynamic_activity);
        main_btn_dynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOtherActivity = new Intent(v.getContext(), DynamicActivity.class);
                //可放所有基本類別
                goOtherActivity.putExtra("name", "Eaway"); // String
                goOtherActivity.putExtra("age", 18); // int

//                startActivity(goOtherActivity);
                startActivityForResult(goOtherActivity, 567); // 567 為 requestCode(識別碼)
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 567:
                if (resultCode == RESULT_OK) {
                    String result = data.getExtras().getString("fullname");
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "One");
        menu.add(0, 1, 2, "Two");
        menu.add(0, 2, 1, "Three");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(MainActivity.this, item.getTitle(),
                Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        String s = "cool";
        //Toast.LENGTH_LONG表示顯示時間較長，Toast.LENGTH_SHORT則表示顯示時間較短
        Toast.makeText(view.getContext(), "這是一個Toast......", Toast.LENGTH_LONG).show();
        Log.d("HI", "sendMessage() returned: " + "this is log");
        Log.d("NiceTag", "sendMessage() returned: " + s);
    }

    public void clickIntent(View view) {
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.asus.com/"));
//        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0955038039"));
//        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:eaway_lu@asus.com"));
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/1"));
//        Intent intent = new Intent(Intent.ACTION_EDIT, Uri.parse("content://contacts/people/1"));
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:23.5646155,119.5641291"));
//        Intent intent = new Intent("Intent.ACTION_VIEW_EAWAY");

        startActivity(intent);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.asus.com/"));
//        Intent chooser = Intent.createChooser(intent, "Please choose an app");
//        startActivity(chooser);


//        String textMessage = "hi";
//        // Create the text message with a string
//        Intent sendIntent = new Intent();
//        sendIntent.setAction(Intent.ACTION_SEND);
//        sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
//        sendIntent.setType("text/plain");
//
//        // Verify that the intent will resolve to an activity
//        if (sendIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(sendIntent);
//        }
    }

}
