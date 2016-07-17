package com.example.hanshu.mybroadcast.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by HanShu on 2016/7/16.
 */
public class Broadcast01 extends BroadcastReceiver{
    private static final String TAG = "Broadcast01";
    @Override
    public void onReceive(Context context, Intent intent) {
        
        String str=intent.getStringExtra("haha");
        Log.i(TAG, "onReceive: 22222222222222222222"+str);
    }
}
