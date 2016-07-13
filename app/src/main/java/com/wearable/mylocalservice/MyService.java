package com.wearable.mylocalservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    private final static String TAG = MyService.class.getSimpleName();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.v(TAG, "Service onCreate() is called.");

        Toast.makeText(this, "Local service created.", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "Service onCreate() is called.");

        Toast.makeText(this, "Local service stopped.", Toast.LENGTH_LONG).show();
    }
}
