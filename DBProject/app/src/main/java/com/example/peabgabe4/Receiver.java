package com.example.peabgabe4;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.Toast;

/**
 * Die Receiver Klasse mit der man die Informationen vom Airplane Mode bekommt.
 * Es wird ein Toast ausgegeben, wenn dieser sich ändert.
 */
public class Receiver extends BroadcastReceiver {
    public static final IntentFilter INTENT_FILTER = new IntentFilter("android.intent.action.AIRPLANE_MODE");

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Airplane mode changed", Toast.LENGTH_LONG).show();
        Log.d("AirplaneMode", "Service state changed");
    }
}
