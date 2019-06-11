package com.example.android.elpsycongroo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();

    public void checkplaying(MediaPlayer m){
        if(m.isPlaying()) {
            m.pause();
            m.seekTo(0);
        }
    }

    public void playnow(MediaPlayer m) {
        if(m.isPlaying()) {
            m.seekTo(0);
        }
        m.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer m0 = MediaPlayer.create(this, R.raw.music);
        final MediaPlayer m1 = MediaPlayer.create(this, R.raw.sonuva);
        final MediaPlayer m2 = MediaPlayer.create(this, R.raw.mad);
        final MediaPlayer m3 = MediaPlayer.create(this, R.raw.mad2);
        final MediaPlayer m4 = MediaPlayer.create(this, R.raw.otoko);


        ImageButton playokabe = (ImageButton) this.findViewById(R.id.playmusic);

        playokabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int b = rand.nextInt(5);

                switch (b){
                    case 0: {
                        checkplaying(m1);
                        checkplaying(m2);
                        checkplaying(m3);
                        checkplaying(m4);
                        playnow(m0);
                        break;
                    }
                    case 1: {
                        checkplaying(m0);
                        checkplaying(m2);
                        checkplaying(m3);
                        checkplaying(m4);
                        playnow(m1);
                        break;
                    }
                    case 2: {
                        checkplaying(m1);
                        checkplaying(m2);
                        checkplaying(m3);
                        checkplaying(m4);
                        playnow(m2);
                        break;
                    }
                    case 3: {
                        checkplaying(m1);
                        checkplaying(m2);
                        checkplaying(m3);
                        checkplaying(m4);
                        playnow(m3);
                        break;
                    }
                    case 4: {
                        checkplaying(m0);
                        checkplaying(m1);
                        checkplaying(m2);
                        checkplaying(m3);
                        playnow(m4);
                        break;
                    }
                }

                Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);
                findViewById(R.id.playmusic).startAnimation(shake);

                double a[] = new double[2];
                a[0] = 1.048596;
                a[1] = rand.nextDouble();

                double number = a[rand.nextInt(2)];
                String message = "" + String.format("%.6f",number);

                TextView steiner = (TextView) findViewById(R.id.steiner);
                steiner.setText(message);
            }
        });
    }

}
