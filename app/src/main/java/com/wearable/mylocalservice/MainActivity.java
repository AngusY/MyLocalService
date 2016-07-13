package com.wearable.mylocalservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startSvcBtn = (Button) findViewById(R.id.StartSvcBtn);
        Button stopSvcBtn = (Button) findViewById(R.id.StopSvcBtn);

        startSvcBtn.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Log.v(TAG, "Start service button was clicked.");
                startService(new Intent(MainActivity.this, MyService.class));
            }
        });

        stopSvcBtn.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Log.v(TAG, "Stop service button was clicked.");
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });
    }
}
