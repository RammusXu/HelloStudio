package com.system_process.hellostudio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class HelloReceiver extends BroadcastReceiver {
    public HelloReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "HelloReceiver.onReceive", Toast.LENGTH_SHORT).show();

        // Create thread to avoid ANR
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (i<5) {
                        Log.d("HelloReceiver", "second: " + i++);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        thread.start();
    }
}
