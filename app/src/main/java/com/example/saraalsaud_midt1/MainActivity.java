package com.example.saraalsaud_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpTrack;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lion = (ImageView) findViewById(R.id.imgLion);
        Button btn = (Button) findViewById(R.id.btnMain);

        mpTrack = new MediaPlayer();
        MediaPlayer mpTrack = MediaPlayer.create(this, R.raw.track3);
        playing = 0;

        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing) {
                    case 0:
                        mpTrack.start();
                        playing = 1;

                        break;
                    case 1:
                        mpTrack.pause();
                        playing = 0;
                        break;
                }

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
    }
}




