package com.example.admin.week4daily3assigment;

import android.*;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View v) {
        Button button = (Button) findViewById(R.id.button1);
        Intent service = new Intent(MainActivity.this, ForegroundService.class);
        if (!ForegroundService.IS_SERVICE_RUNNING) {
            service.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);
            ForegroundService.IS_SERVICE_RUNNING = true;
            button.setText("Stop Service");
        } else {
            service.setAction(Constants.ACTION.STOPFOREGROUND_ACTION);
            ForegroundService.IS_SERVICE_RUNNING = false;
            button.setText("Start Service");

        }
        startService(service);
    }


    public void SndPrivateBroadcast(View view) {
        Intent intent = new Intent();
        intent.setAction("KarimActionBroad");
        intent.putExtra("Key","DummyData");
        sendBroadcast(intent,"TestPermission");
    }
}
