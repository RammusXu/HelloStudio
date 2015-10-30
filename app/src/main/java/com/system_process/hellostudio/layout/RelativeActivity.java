package com.system_process.hellostudio.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.asus.amax.hellostudio.R;

import java.util.ArrayList;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        ArrayList<String> mArrayList = new ArrayList<>();
        mArrayList.add("hi");
        mArrayList.add("hi");
        mArrayList.add("hi");

        ListView mListView = (ListView) findViewById(R.id.listView);

        //利用字串陣列製作 Adapter ，顯示樣式為 android.R.layout.simple_list_item_1。
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                RelativeActivity.this,
                android.R.layout.simple_list_item_1, mArrayList);
        //將 Adapter 放進元件中，設定資料來源。
        mListView.setAdapter(adapter);
    }
}
