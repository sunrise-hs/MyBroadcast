package com.example.hanshu.mybroadcast.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by HanShu on 2016/7/16.
 */
public class Broadcast extends BroadcastReceiver {
    private static final String TAG = "Broadcast";
    @Override
    public void onReceive(Context context, Intent intent) {
        String str=intent.getStringExtra("haha");
        Log.i(TAG, "onReceive:11111111111111111111111 "+str);
        abortBroadcast();
        Log.i(TAG, "onReceive: 我被拦截了");
    }
}
