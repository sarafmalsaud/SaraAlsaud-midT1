package com.example.saraalsaud_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class lisActivity extends AppCompatActivity {
    MediaPlayer mpTrack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lis);

        mpTrack = new MediaPlayer();
        MediaPlayer mpTrack = MediaPlayer.create(this, R.raw.track3);
        mpTrack.start();
    }
}