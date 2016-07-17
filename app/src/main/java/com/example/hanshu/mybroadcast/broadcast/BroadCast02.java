package com.example.hanshu.mybroadcast.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by HanShu on 2016/7/17.
 */
public class BroadCast02 extends BroadcastReceiver {
    private static final String TAG = "BroadCast02";
    @Override
    public void onReceive(Context context, Intent intent) {
        String str=intent.getStringExtra("haha");
        Log.i(TAG, "onReceive: 33333333333333"+str);
    }
}
